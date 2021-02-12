package studios.restaurant;

import java.util.ArrayList;

public class Menu {
    private ArrayList<MenuItem> items;

    public Menu (ArrayList<MenuItem> items) {
        this.items = items;
    }

    public void printMenu ( MenuItem item ) {
        for (int i = 0; i < items.size(); i++) {
            System.out.println("Print Menu: " + item.getDescription() + " Price: " + item.getPrice() + " Last Updated: " + item.getLastUpdated());
        }
    }

    public void printItem ( MenuItem item ) {
        System.out.println("Print Item: " + item.getDescription() + " Price: " + item.getPrice() + " Last Updated: " + item.getLastUpdated());
    }

    public void addItem ( MenuItem item ) {
        if (this.items.contains(item)) {
            System.out.println("already exists");
            return;
        }
        this.items.add(item);
    }

    public void removeItem ( MenuItem item ) {
        this.items.remove(item);
        System.out.println("Remove Item: " + item.getDescription() + " Price: " + item.getPrice() + " Last Updated: " + item.getLastUpdated());
    }
}


