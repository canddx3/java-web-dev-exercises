package exercises.lsn7interfaces;

import java.util.ArrayList;

public abstract class Ingredient {
    private final String name;
    private final double cost;
    private final ArrayList<String> allergens;

    public Ingredient(String aName, double aCost, ArrayList<String> someAllergens){
        name = aName;
        cost = aCost;
        allergens = someAllergens;
    }

    public String getName() {
        return name;
    }

    public double getCost() {
        return cost;
    }

    public ArrayList<String> getAllergens() {
        return allergens;
    }

    @Override
    public String toString() {
        return "Name: " + name + "\n" +
                "Cost: $" + cost + "\n" +
                "Allergens: " + allergens + "\n";
    }
}
