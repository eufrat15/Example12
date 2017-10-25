package rs.aleph.android.example12.activities.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by androiddevelopment on 13.10.17..
 */

public class Sastojci {

    private int id;
    private String name;
    private Hrana foods;

    public Sastojci() {

    }

    public Sastojci(int id, String name) {

        this.id = id;
        this.name = name;

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

    public Hrana getFoods() { return foods; }

    public void setFoods(Hrana foods) {this.foods = foods; }

    @Override
    public String toString() {return name; }
}
