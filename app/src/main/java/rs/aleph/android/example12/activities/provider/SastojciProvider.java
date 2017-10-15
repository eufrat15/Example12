package rs.aleph.android.example12.activities.provider;

import java.util.ArrayList;
import java.util.List;

import rs.aleph.android.example12.activities.model.Sastojci;

/**
 * Created by Aleksandar on 15-Oct-17.
 */

public class SastojciProvider {

    public static List<Sastojci> getSastojak() {

        List<Sastojci> sastojci = new ArrayList<>();

        sastojci.add(new Sastojci(0, "Mleveno meso, lepinja, luk, premazi, zacini"));
        sastojci.add(new Sastojci(1, "Sir, sampinjoni, kecap, origano, sunkarica"));
        sastojci.add(new Sastojci(2, "Voda, so, vegeta"));
        sastojci.add(new Sastojci(3, "Mleveno meso, testenina, kecap, origano"));
        return sastojci;
    }

    public static List<String> getSastojciNames() {
        List<String> names = new ArrayList<>();
        names.add("Mleveno meso, lepinja, luk, premazi, zacini");
        names.add("Sir, sampinjoni, kecap, origano, sunkarica");
        names.add("Voda, so, vegeta");
        names.add("Mleveno meso, testenina, kecap, origano");
            return names;
    }

    public static Sastojci getSastojciById(int id) {
        switch (id) {
            case 0:
                return new Sastojci(0, "Mleveno meso, lepinja, luk, premazi, zacini");
            case 1:
                return new Sastojci(1, "Sir, sampinjoni, kecap, origano, sunkarica");
            case 2:
                return new Sastojci(2, "Voda, so, vegeta");
            case 3:
                return new Sastojci(3, "Mleveno meso, testenina, kecap, origano");
            default:
                return null;
        }
    }

}


