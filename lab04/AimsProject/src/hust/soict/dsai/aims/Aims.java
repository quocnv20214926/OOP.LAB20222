package hust.soict.dsai.aims;

import hust.soict.dsai.aims.cart.Cart;
import hust.soict.dsai.aims.media.*;
import hust.soict.dsai.aims.store.Store;

import java.util.Scanner;

public class Aims {
    private static Store store = new Store();
    private static Cart cart = new Cart();
    private static Scanner scanner = new Scanner(System.in);

    public static void showMenu() {
        System.out.println("AIMS: ");
        System.out.println("--------------------------------");
        System.out.println("1. View store");
        System.out.println("2. Update store");
        System.out.println("3. See current cart");
        System.out.println("0. Exit");
        System.out.println("--------------------------------");
        System.out.println("Please choose a number: 0-1-2-3");
    }

    public static void storeMenu() {
        System.out.println("Options: ");
        System.out.println("--------------------------------");
        System.out.println("1. See a media’s details");
        System.out.println("2. Add a media to cart");
        System.out.println("3. Play a media");
        System.out.println("4. See current cart");
        System.out.println("0. Back");
        System.out.println("--------------------------------");
        System.out.println("Please choose a number: 0-1-2-3-4");
    }

    public static void cartMenu() {
        System.out.println("Options: ");
        System.out.println("--------------------------------");
        System.out.println("1. Filter medias in cart");
        System.out.println("2. Sort medias in cart");
        System.out.println("3. Remove media from cart");
        System.out.println("4. Play a media");
        System.out.println("5. Place order");
        System.out.println("0. Back");
        System.out.println("--------------------------------");
        System.out.println("Please choose a number: 0-1-2-3-4-5");
    }

    public static void main(String[] args) {
        showMenu();
        int option = scanner.nextInt();
        while (option != 0) {
            switch (option) {
                case 1:
                    viewStore();
                    break;
                case 2:
                    updateStore();
                    break;
                case 3:
                    seeCurrentCart();
                    break;
                default:
                    System.out.println("Invalid option. Please choose again.");
                    break;
            }
            showMenu();
            option = scanner.nextInt();
        }
        System.out.println("Goodbye!");
    }

    public static void viewStore() {
        storeMenu();
        int option = scanner.nextInt();
        while (option != 0) {
            switch (option) {
                case 1:
                    seeMediaDetails();
                    break;
                case 2:
                    addMediaToCart();
                    break;
                case 3:
                    playMedia();
                    break;
                case 4:
                    seeCurrentCart();
                    break;
                default:
                    System.out.println("Invalid option. Please choose again.");
                    break;
            }
            storeMenu();
            option = scanner.nextInt();
        }
    }

    public static void seeMediaDetails() {
        System.out.println("Enter the title of the media:");
        scanner.nextLine();
        String title = scanner.nextLine();
        Media media = store.search(title);
        if (media != null) {
            System.out.println(media.toString());
            mediaDetailsMenu(media);
        } else {
            System.out.println("Media not found.");
        }
    }

    public static void mediaDetailsMenu(Media media) {
        System.out.println("Options: ");
        System.out.println("--------------------------------");
        System.out.println("1. Add to cart");
        System.out.println("2. Play");
        System.out.println("0. Back");
        System.out.println("--------------------------------");
        System.out.println("Please choose a number: 0-1-2");
        int option = scanner.nextInt();
        while (option != 0) {
            switch (option) {
                case 1:
                    cart.addMedia(media);
                    System.out.println("Media added to cart successfully.");
                    break;
                case 2:
                    if (media instanceof Playable) {
                        ((Playable) media).play();
                    } else {
                        System.out.println("This media cannot be played.");
                    }
                    break;
                default:
                    System.out.println("Invalid option. Please choose again.");
                    break;
            }
            mediaDetailsMenu(media);
            option = scanner.nextInt();
        }
    }

    public static void addMediaToCart() {
        System.out.println("Enter the title of the media:");
        scanner.nextLine();
        String title = scanner.nextLine();
        Media media = store.search(title);
        if (media != null) {
            cart.addMedia(media);
            System.out.println("Media added to cart successfully.");
            System.out.println("Number of DVDs in the current cart: " + cart.getDVDCount());
        } else {
            System.out.println("Media not found.");
        }
    }

    public static void playMedia() {
        System.out.println("Enter the title of the media:");
        scanner.nextLine();
        String title = scanner.nextLine();
        Media media = store.search(title);
        if (media != null && media instanceof Playable) {
            ((Playable) media).play();
        } else {
            System.out.println("Media not found or cannot be played.");
        }
    }

    public static void updateStore() {
        System.out.println("Options: ");
        System.out.println("--------------------------------");
        System.out.println("1. Add a media to the store");
        System.out.println("2. Remove a media from the store");
        System.out.println("0. Back");
        System.out.println("--------------------------------");
        System.out.println("Please choose a number: 0-1-2");
        int option = scanner.nextInt();
        while (option != 0) {
            switch (option) {
                case 1:
                    addMediaToStore();
                    break;
                case 2:
                    removeMediaFromStore();
                    break;
                default:
                    System.out.println("Invalid option. Please choose again.");
                    break;
            }
            updateStore();
            option = scanner.nextInt();
        }
    }

    public static void addMediaToStore() {

    }

    public static void removeMediaFromStore() {

    }

    public static void seeCurrentCart() {
        cartMenu();
        int option = scanner.nextInt();
        while (option != 0) {
            switch (option) {
                case 1:
                    filterMediasInCart();
                    break;
                case 2:
                    sortMediasInCart();
                    break;
                case 3:
                    removeMediaFromCart();
                    break;
                case 4:
                    playMediaFromCart();
                    break;
                case 5:
                    placeOrder();
                    break;
                default:
                    System.out.println("Invalid option. Please choose again.");
                    break;
            }
            cartMenu();
            option = scanner.nextInt();
        }
    }

    public static void filterMediasInCart() {
        System.out.println("Filter options: ");
        System.out.println("--------------------------------");
        System.out.println("1. Filter by ID");
        System.out.println("2. Filter by title");
        System.out.println("0. Back");
        System.out.println("--------------------------------");
        System.out.println("Please choose a number: 0-1-2");
        int option = scanner.nextInt();
        while (option != 0) {
            switch (option) {
                case 1:
                    break;
                case 2:
                    break;
                default:
                    System.out.println("Invalid option. Please choose again.");
                    break;
            }
            filterMediasInCart();
            option = scanner.nextInt();
        }
    }

    public static void sortMediasInCart() {
        System.out.println("Sort options: ");
        System.out.println("--------------------------------");
        System.out.println("1. Sort by title");
        System.out.println("2. Sort by cost");
        System.out.println("0. Back");
        System.out.println("--------------------------------");
        System.out.println("Please choose a number: 0-1-2");
        int option = scanner.nextInt();
        while (option != 0) {
            switch (option) {
                case 1:
                    break;
                case 2:
                    break;
                default:
                    System.out.println("Invalid option. Please choose again.");
                    break;
            }
            sortMediasInCart();
            option = scanner.nextInt();
        }
    }

    public static void removeMediaFromCart() {
        System.out.println("Enter the title of the media to remove from cart:");
        scanner.nextLine();
        String title = scanner.nextLine();
        Media media = cart.search(title);
        if (media != null) {
            cart.removeMedia(media);
            System.out.println("Media removed from cart successfully.");
        } else {
            System.out.println("Media not found in cart.");
        }
    }

    public static void playMediaFromCart() {
        System.out.println("Enter the title of the media to play from cart:");
        scanner.nextLine();
        String title = scanner.nextLine();
        Media media = cart.search(title);
        if (media != null && media instanceof Playable) {
            ((Playable) media).play();
        } else {
            System.out.println("Media not found in cart or cannot be played.");
        }
    }

    public static void placeOrder() {
        System.out.println("Order placed successfully.");
        cart.clear();
    }
}
