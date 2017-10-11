package rs.aleph.android.example12.activities.model;

/**
 * Created by androiddevelopment on 11.10.17..
 */

public class Hrana {

    private int id;
    private String image;
    private String name;
    private String description;
    private String category;
    private String ingridients;
    private int kcal;
    private double price;


    public Hrana() {

    }

    public Hrana(String image, String name, String description, String category, String ingridients, int kcal, double price) {
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

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getIngridients() {
        return ingridients;
    }

    public void setIngridients(String ingridients) {
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
    public String toString() {
        return "Hrana{" +
                "id=" + id +
                ", image='" + image + '\'' +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", category='" + category + '\'' +
                ", ingridients='" + ingridients + '\'' +
                ", kcal='" + kcal + '\'' +
                ", price='" + price +
                '}';
    }
}


