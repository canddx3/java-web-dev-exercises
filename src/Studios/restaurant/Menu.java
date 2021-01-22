package Studios.restaurant;
import java.util.ArrayList;
import java.util.Date;

public class Menu {
    public static void main ( String[] args ) {
        MenuItem menuItem = new MenuItem("fries", 1.00, "appetizer", true);
        Date date = new Date();
    }

    private Date date;
    private ArrayList<String> menuItem = new ArrayList<>();


    public Menu(ArrayList<String> menuItem) {
        this.menuItem = menuItem;
        date = new Date();
    }

    private Date getDate() {
        return date; }
    private void setDate(Date date) {
        this.date = date; }

    private ArrayList<String> getMenuItem() {
        return menuItem; }
    public void setMenuItem(ArrayList<String> menuItem) {
        this.menuItem = menuItem; this.date = new Date(); }
}
