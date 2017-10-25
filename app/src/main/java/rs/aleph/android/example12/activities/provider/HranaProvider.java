package rs.aleph.android.example12.activities.provider;

import java.util.ArrayList;
import java.util.List;

import rs.aleph.android.example12.activities.model.Hrana;
import rs.aleph.android.example12.activities.model.Kategorija;
import rs.aleph.android.example12.activities.model.Sastojci;

/**
 * Created by androiddevelopment on 13.10.17..
 */

public class HranaProvider {

    public static List<Hrana> getFoods() {

        Kategorija hamburger = new Kategorija(0, "Hamburger");
        Kategorija pizza = new Kategorija(1, "Pizza");
        Kategorija spaghetti = new Kategorija(2, "Spaghetti");

        ArrayList<Sastojci> hamburgerSas = new ArrayList<>();
        hamburgerSas.add(new Sastojci(0, "mleveno meso"));
        hamburgerSas.add(new Sastojci(1, "salata"));
        hamburgerSas.add(new Sastojci(2, "lepinja"));
        hamburgerSas.add(new Sastojci(3, "premazi"));

        ArrayList<Sastojci> pizzaSas = new ArrayList<>();
        pizzaSas.add(new Sastojci(0, "kackavalj"));
        pizzaSas.add(new Sastojci(1, "masline"));
        pizzaSas.add(new Sastojci(2, "pecurke"));
        pizzaSas.add(new Sastojci(3, "salama"));

        ArrayList<Sastojci> spaghettiSas = new ArrayList<>();
        spaghettiSas.add(new Sastojci(0, "mleveno meso"));
        spaghettiSas.add(new Sastojci(1, "spagete"));
        spaghettiSas.add(new Sastojci(2, "bolonjeze sos"));
        spaghettiSas.add(new Sastojci(3, "kecap"));


        List<Hrana> foods = new ArrayList<>();
        foods.add(new Hrana(0, "hamburger.jpg", "Hamburger", "description...", hamburger, hamburgerSas, 500, 300));
        foods.add(new Hrana(1, "pizza.jpg", "Pizza", "description...", pizza, pizzaSas, 400, 200));
        foods.add(new Hrana(2, "spaghetti.jpg", "Spaghetti", "description...", spaghetti, spaghettiSas, 450, 250));
        return foods;
    }

    public static List<String> getHranaNames() {

        List<String> names = new ArrayList<>();
        names.add("Hamburger");
        names.add("Pizza");
        names.add("Spaghetti");
        return names;
    }

    public static Hrana getHranabyId(int id) {

        Kategorija hamburger = new Kategorija(0, "Hamburger");
        Kategorija pizza = new Kategorija(1, "Pizza");
        Kategorija spaghetti = new Kategorija(2, "Spaghetti");

        ArrayList<Sastojci> hamburgerSas = new ArrayList<>();
        hamburgerSas.add(new Sastojci(0, "mleveno meso"));
        hamburgerSas.add(new Sastojci(1, "salata"));
        hamburgerSas.add(new Sastojci(2, "lepinja"));
        hamburgerSas.add(new Sastojci(3, "premazi"));

        ArrayList<Sastojci> pizzaSas = new ArrayList<>();
        pizzaSas.add(new Sastojci(0, "kackavalj"));
        pizzaSas.add(new Sastojci(1, "masline"));
        pizzaSas.add(new Sastojci(2, "pecurke"));
        pizzaSas.add(new Sastojci(3, "salama"));

        ArrayList<Sastojci> spaghettiSas = new ArrayList<>();
        spaghettiSas.add(new Sastojci(0, "mleveno meso"));
        spaghettiSas.add(new Sastojci(1, "spagete"));
        spaghettiSas.add(new Sastojci(2, "bolonjeze sos"));
        spaghettiSas.add(new Sastojci(3, "kecap"));

        switch (id) {
            case 0:
                return new Hrana(0, "hamburger.jpg", "Hamburger", "description...", hamburger, hamburgerSas, 500, 300);
            case 1:
                return new Hrana(1, "pizza.jpg", "Pizza", "description...", pizza, pizzaSas, 400, 200);
            case 2:
                return new Hrana(2, "spaghetti.jpg", "Spaghetti", "description...", spaghetti, spaghettiSas, 450, 250);
            default:
                return null;

        }
    }
}


