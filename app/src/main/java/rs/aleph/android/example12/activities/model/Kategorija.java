package rs.aleph.android.example12.activities.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by androiddevelopment on 13.10.17..
 */

public class Kategorija {

    private int id;
    private String name;
    private List<Hrana> foods;

    public Kategorija() {

        foods = new ArrayList<>();
    }

    public Kategorija(int id, String name) {

        this.id = id;
        this.name = name;
        foods = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addHrana(Hrana hrana) {

        foods.add(hrana);
    }

    public void removeHrana(Hrana hrana) {

        foods.remove(hrana);
    }

    public Hrana getHrana(int position) {

        return foods.get(position);
    }

    public List<Hrana> getFoods() {
        return foods;
    }

    public void setFoods(List<Hrana> foods) {
        this.foods = foods;
    }


}
