package hust.soict.dsai.aims.cart;

import hust.soict.dsai.aims.media.*;
import java.util.ArrayList;
import java.util.Collections;

public class Cart {
    private ArrayList<Media> itemsOrdered = new ArrayList<Media>();
    public static final int Max_number_ordered = 20;

    public void addMedia(Media disc) {
        if (itemsOrdered.size() == Max_number_ordered)
            System.out.println("The cart is full, cannot add more");
        else {
            itemsOrdered.add(disc);
            System.out.println("The cart has been added");
        }
    }

    public void removeMedia(Media disc) {
        int check = -1;
        if (itemsOrdered.size() == 0) {
            System.out.println("The cart is empty");
        } else {
            for (int i = 0; i < itemsOrdered.size(); i++) {
                if (disc.getId() == itemsOrdered.get(i).getId()) {
                    check = 1;
                    break;
                }
            }
            if (check == 1) {
                itemsOrdered.remove(disc);
                if (check == 1)
                    System.out.println("The cart has been updated");
            } else {
                System.out.println("Not found");
            }
        }

    }

    public int numberOfMedia() {
        return itemsOrdered.size();
    }

    public float totalCost() {

        float total = 0;
        for (Media media : itemsOrdered) {
            total += media.getCost();

        }
        return total;
    }

    public void printCart() {
        System.out.println("***********************CART***********************");
        System.out.println("Ordered Items:");
        for (int i = 0; i < itemsOrdered.size(); i++) {
            System.out.println((i + 1) + "." + itemsOrdered.get(i).toString());
        }
        System.out.println("Total cost: " + totalCost() + "$");
        System.out.println("***************************************************");
    }

    public Media search(int id) {
        for (Media media : itemsOrdered) {
            if (media.getId() == id) {
                System.out.println(media.toString());
                return media;
            }
        }
        System.out.println("No match is found!");
        return null;
    }

    public Media search(String title) {
        for (Media media : itemsOrdered) {
            if (media.getTitle().equals(title)) {
                return media;
            }
        }
        System.out.println("No match is found!");
        return null;
    }

    public void sortByTitle() {
        Collections.sort(itemsOrdered, Media.COMPARE_BY_TITLE_COST);
    }

    public void sortByCost() {
        Collections.sort(itemsOrdered, Media.COMPARE_BY_COST_TITLE);
    }

    public void clear() {
    }

    public String getDVDCount() {
        return null;
    }

}