package Studios.restaurant;

import java.util.Objects;

public class MenuItem {
    private double price;
    private String description;
    private String category;
    private boolean isNew;
    public static final String[] CATEGORIES = {"Entree", "Dessert", "Appetizer"};

    public MenuItem ( double price, String description, String category, boolean isNew ) {
        //TODO: validation
        this.price = price;
        this.description = description;
        this.isNew = isNew;
        //Check valid category
        this.category = category;
    }

    public double getPrice () {
        return price;
    }

    public String getDescription () {
        return description;
    }

    public String getCategory () {
        return category;
    }

    public boolean isNew () {
        return isNew;
    }

    public void setPrice ( double price ) {
        //TODO: validation
        this.price = price;
    }

    public void setDescription ( String description ) {
        //TODO: validation
        this.description = description;
    }

    public void setNew ( boolean aNew ) {
        //TODO: validation
        this.isNew = aNew;
    }

    @Override
    public boolean equals ( Object o ) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MenuItem menuItem = (MenuItem) o;
        return Double.compare(menuItem.price, price) == 0 &&
                isNew == menuItem.isNew &&
                description.equals(menuItem.description) &&
                category.equals(menuItem.category);
    }

    @Override
    public int hashCode () {
        return Objects.hash(price, description, category, isNew);
    }
}