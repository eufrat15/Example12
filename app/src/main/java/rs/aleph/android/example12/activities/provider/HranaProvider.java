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

        Kategorija grilovano = new Kategorija(0, "Grilovano");
        Kategorija kuvano = new Kategorija(1, "Kuvano");
        Kategorija peceno = new Kategorija(2, "Peceno");

        Sastojci hamburger = new Sastojci(0, "Mleveno meso, lepinja, luk, premazi, zacini");
        Sastojci pizza = new Sastojci(1, "Sir, sampinjoni, kecap, origano, sunkarica");
        Sastojci soup = new Sastojci(2, "voda, so, vegeta");
        Sastojci spaghetti = new Sastojci(3, "Mleveno meso, testenina, kecap, origano");


        List<Hrana> foods = new ArrayList<>();
        foods.add(new Hrana(0, "hamburger.jpg", "Hamburger", "description...", grilovano, hamburger, 500, 300));
        foods.add(new Hrana(1, "pizza.jpg", "Pizza", "description...", peceno, pizza, 400, 200));
        foods.add(new Hrana(2, "soup.jpg", "Soup", "description...", kuvano, soup, 300, 100));
        foods.add(new Hrana(3, "spaghetti.jpg", "Spaghetti", "description...", kuvano, spaghetti, 450, 250));
        return foods;
    }

    public static List<String> getHranaNames() {

        List<String> names = new ArrayList<>();
        names.add("Hamburger");
        names.add("Pizza");
        names.add("Soup");
        names.add("Spaghetti");
        return names;
    }

    public static Hrana getHranabyId(int id) {

        Kategorija grilovano = new Kategorija(0, "Grilovano");
        Kategorija kuvano = new Kategorija(1, "Kuvano");
        Kategorija peceno = new Kategorija(2, "Peceno");

        Sastojci hamburger = new Sastojci(0, "Mleveno meso, lepinja, luk, premazi, zacini");
        Sastojci pizza = new Sastojci(1, "Sir, sampinjoni, kecap, origano, sunkarica");
        Sastojci soup = new Sastojci(2, "voda, so, vegeta");
        Sastojci spaghetti = new Sastojci(3, "Mleveno meso, testenina, kecap, origano");

        switch (id) {
            case 0:
                return new Hrana(0, "hamburger.jpg", "Hamburger", "description...", grilovano, hamburger, 500, 300);
            case 1:
                return new Hrana(1, "pizza.jpg", "Pizza", "description...", peceno, pizza, 400, 200);
            case 2:
                return new Hrana(2, "soup.jpg", "Soup", "description...", kuvano, soup, 300, 100);
            case 3:
                return new Hrana(3, "spaghetti.jpg", "Spaghetti", "description...", kuvano, spaghetti, 450, 250);
            default:
                return null;

        }
    }
}


