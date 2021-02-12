package studios.restaurant;

import java.util.Objects;

public class MenuItem {
    private final double price;
    private final String description;
    private final String category;
    private final String lastUpdated;
    public static final String[] CATEGORIES = {"Entree", "Dessert", "Appetizer"};

    public MenuItem ( double price, String description, String category, String lastUpdated ) {
        //TODO: validation
        this.price = price;
        this.description = description;
        this.lastUpdated = lastUpdated;
        //Check valid category
        this.category = category;
    }


    public String getDescription () {
        return description;
    }
    public Double getPrice() { return price; }
    public String getLastUpdated() { return lastUpdated; }

    @Override
    public boolean equals ( Object o ) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MenuItem menuItem = (MenuItem) o;
        return Double.compare(menuItem.price, price) == 0 &&
                lastUpdated == menuItem.lastUpdated &&
                description.equals(menuItem.description) &&
                category.equals(menuItem.category);
    }

    @Override
    public int hashCode () {
        return Objects.hash(price, description, category, lastUpdated);
    }
}