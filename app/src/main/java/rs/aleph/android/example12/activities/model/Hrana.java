package rs.aleph.android.example12.activities.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by androiddevelopment on 11.10.17..
 */

public class Hrana {

    private int id;
    private String image;
    private String name;
    private String description;
    private Kategorija category;
    private List<Sastojci> ingridients;
    private int kcal;
    private double price;


    public Hrana() {

        this.ingridients = new ArrayList<Sastojci>();

    }

    public Hrana(int id, String image, String name, String description, Kategorija category, ArrayList<Sastojci> ingridients, int kcal, double price) {
        this.id = id;
        this.image = image;
        this.name = name;
        this.description = description;
        this.category = category;
        this.ingridients = ingridients;
        this.kcal = kcal;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Kategorija getCategory() {
        return category;
    }

    public void setCategory(Kategorija category) {
        this.category = category;
    }

    public List<Sastojci> getIngridients() {
        return ingridients;
    }

    public void setIngridients(List<Sastojci> ingridients) {
        this.ingridients = ingridients;
    }

    public int getKcal() {
        return kcal;
    }

    public void setKcal(int kcal) {
        this.kcal = kcal;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() { return name; }
}


