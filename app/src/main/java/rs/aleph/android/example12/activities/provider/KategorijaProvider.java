package rs.aleph.android.example12.activities.provider;

import java.util.ArrayList;
import java.util.List;

import rs.aleph.android.example12.activities.model.Kategorija;

/**
 * Created by androiddevelopment on 13.10.17..
 */

public class KategorijaProvider {



    public static List<Kategorija> getKategorije() {

        List<Kategorija> kategorije = new ArrayList<>();
        kategorije.add(new Kategorija(0, "Grilovano"));
        kategorije.add(new Kategorija(1, "Kuvano"));
        kategorije.add(new Kategorija(2, "Peceno"));
        return kategorije;
    }

    public static List<String> getKategorijaNames() {
        List<String> names = new ArrayList<>();
        names.add("Grilovano");
        names.add("Kuvano");
        names.add("Peceno");
        return names;
    }

    public static Kategorija getKategorijaById(int id) {
        switch (id) {
            case 0:
                return new Kategorija(0, "Grilovano");
            case 1:
                return new Kategorija(1, "Kuvano");
            case 2:
                return new Kategorija(2, "Peceno");
            default:
                return null;
        }
    }

}
