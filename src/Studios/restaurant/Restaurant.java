package Studios.restaurant;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

public class Restaurant {
    public static void main ( String[] args ) {
        MenuItem newItem1 = new MenuItem(4.99, "hamburger", "Dinner", true);
        MenuItem newItem2 = new MenuItem(4.99, "Steak", "Dinner", false);
        MenuItem newItem3 = new MenuItem(2.99, "fries", "Appetizer", true);

        Date today = Calendar.getInstance().getTime();
        ArrayList<MenuItem> startingMenu = new ArrayList<>();

        Menu ourMenu = new Menu(today, startingMenu);

        ourMenu.addItem(newItem1);
        ourMenu.addItem(newItem2);
        ourMenu.addItem(newItem3);

        ourMenu.printMenu(newItem1);
        ourMenu.printItem(newItem2);
        ourMenu.removeItem(newItem3);
        ourMenu.printMenu(newItem2);
    }
}
