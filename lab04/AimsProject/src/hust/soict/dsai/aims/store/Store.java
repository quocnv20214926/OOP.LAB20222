package hust.soict.dsai.aims.store;

import hust.soict.dsai.aims.media.*;

import java.util.ArrayList;

public class Store {
    public static final int Max_number_ordered = 20;
    private ArrayList<Media> itemsInStore = new ArrayList<Media>();

    public void addMedia(Media disc) {
        if (itemsInStore.size() == Max_number_ordered)
            System.out.println("The store is full");
        else {
            itemsInStore.add(disc);
            System.out.println("The store has been added");
        }
    }

    public void removeMedia(Media disc) {
        int check = 0;
        if (itemsInStore.size() == 0)
            System.out.println("The store is empty");
        else {
            for (int i = 0; i < itemsInStore.size(); i++) {
                if (itemsInStore.get(i).getId() == disc.getId()) {
                    check = 1;
                    break;
                }
            }
            if (check == 1) {
                itemsInStore.remove(disc);
                System.out.println("The store has been updated");
            } else
                System.out.println("Not found");
        }
    }

    public Media search(int id) {
        for (Media media : itemsInStore) {
            if (media.getId() == id) {
                System.out.println(media.toString());
                return media;
            }
        }
        System.out.println("No match is found!");
        return null;
    }

    public Media search(String title) {
        for (Media media : itemsInStore) {
            if (media.getTitle().equals(title)) {
                System.out.println(media.toString());
                return media;
            }
        }
        System.out.println("No match is found!");
        return null;
    }
}