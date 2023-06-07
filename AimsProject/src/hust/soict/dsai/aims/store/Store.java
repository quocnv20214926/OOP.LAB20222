package hust.soict.dsai.aims.store;
import hust.soict.dsai.aims.disc.*;

public class Store {
    private DigitalVideoDisc[] itemsInStore;
    private int quantity;

    public Store() {
        itemsInStore = new DigitalVideoDisc[10]; // Initial capacity of 10 DVDs
        quantity = 0;
    }

    public void addDVD(DigitalVideoDisc dvd) {
        if (quantity < itemsInStore.length) {
            itemsInStore[quantity] = dvd;
            quantity++;
            System.out.println("DVD \"" + dvd.getTitle() + "\" added to the store.");
        } else {
            System.out.println("full. Cannot add more DVDs.");
        }
    }

    public void removeDVD(DigitalVideoDisc dvd) {
        int index = -1;
        for (int i = 0; i < quantity; i++) {
            if (itemsInStore[i] == dvd) {
                index = i;
                break;
            }
        }
        if (index != -1) {
            for (int i = index; i < quantity - 1; i++) {
                itemsInStore[i] = itemsInStore[i + 1];
            }
            quantity--;
            System.out.println("DVD \"" + dvd.getTitle() + "\" removed from the store.");
        } else {
            System.out.println("DVD \"" + dvd.getTitle() + "\" not found in the store.");
        }
    }


    public void displayItemsInStore() {
        System.out.println("DVDs in the store:");
        for (int i = 0; i < quantity; i++) {
            System.out.println((i + 1) + ". " + itemsInStore[i].toString());
        }
    }
}
