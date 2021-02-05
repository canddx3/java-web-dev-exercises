package Studios.restaurant;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

public class Menu {
    private Date lastUpdated;
    private ArrayList<MenuItem> items;
    private HashMap<String, ArrayList<MenuItem>> categoryToItemsMap = new HashMap<>();

    public Menu ( ArrayList<MenuItem> items ) {
        setItems(items);
    }

    public Menu ( Date d, ArrayList<MenuItem> items ) {
        setItems(items);
        this.lastUpdated = d;
    }

    public void addItem ( MenuItem newItem1 ) {
        if (this.items.contains(newItem1)) {
            System.out.println("already exists");
            return;
        }
        this.items.add(newItem1);
        this.lastUpdated = new Date();
    }

    public void printMenu (MenuItem item) {
        for (int i = 0; i < items.size(); i++) {
            System.out.println(item.getDescription());
        }
    }

    public void printItem ( MenuItem newItem2 ) {
        System.out.println(newItem2.getDescription());
        return;
    }

    public void removeItem ( MenuItem newItem3 ) {
        this.items.remove(newItem3);
        System.out.println(newItem3.getDescription());
    }

    public void setItems ( ArrayList<MenuItem> items ) {
        this.items = items;
        this.lastUpdated = new Date();
    }

    public Date getLastUpdated () {
        return this.lastUpdated;
    }

    public String getMenuString () {
        String str = "";
        for (MenuItem item : this.items) {
            str += item.getCategory() + " (" + item.getPrice() + ")" + "-" + item.getDescription();
        }
        return str;
    }
}


