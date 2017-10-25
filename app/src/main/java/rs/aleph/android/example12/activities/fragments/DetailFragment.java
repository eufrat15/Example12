package rs.aleph.android.example12.activities.fragments;


import android.app.Fragment;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.RatingBar;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import rs.aleph.android.example12.R;
import rs.aleph.android.example12.activities.model.Kategorija;
import rs.aleph.android.example12.activities.model.Sastojci;
import rs.aleph.android.example12.activities.provider.HranaProvider;
import rs.aleph.android.example12.activities.provider.KategorijaProvider;
import rs.aleph.android.example12.activities.provider.SastojciProvider;

/**
 * Created by androiddevelopment on 20.10.17..
 */

public class DetailFragment extends Fragment {

    private int position = 0;

    @Override
    public void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {

        super.onActivityCreated(savedInstanceState);

        if (savedInstanceState != null) {
            position = savedInstanceState.getInt("position", 0);
        }

        ImageView ivImage = (ImageView) getView().findViewById(R.id.iv_image);
        InputStream is = null;
        try {
            is = getActivity().getAssets().open(HranaProvider.getHranabyId(position).getImage());
            Drawable drawable = Drawable.createFromStream(is, null);
            ivImage.setImageDrawable(drawable);
        } catch (IOException e) {
            e.printStackTrace();
        }

        TextView tvName = (TextView) getView().findViewById(R.id.tv_name);
        tvName.setText(HranaProvider.getHranabyId(position).getName());

        TextView tvDescription = (TextView) getView().findViewById(R.id.tv_description);
        tvDescription.setText(HranaProvider.getHranabyId(position).getDescription());

        Spinner category = (Spinner) getView().findViewById(R.id.sp_category);
        List<String> kategorije = KategorijaProvider.getKategorijaNames();
        ArrayAdapter<String> adapter = new ArrayAdapter(getActivity(), android.R.layout.simple_spinner_item, kategorije);
        category.setAdapter(adapter);
        category.setSelection((int)HranaProvider.getHranabyId(position).getCategory().getId());


        List<Sastojci> ingridients = (HranaProvider.getHranabyId(position).getIngridients());
        ArrayAdapter<String> itemsAdapter = new ArrayAdapter(getActivity(), android.R.layout.simple_list_item_1, ingridients);
        ListView listView = (ListView) getView().findViewById(R.id.tv_ingridients);
        listView.setAdapter(itemsAdapter);

        TextView hranaKcal = (TextView) getView().findViewById(R.id.tv_kcal);
        String stringdouble = Double.toString(HranaProvider.getHranabyId(position).getKcal());
        hranaKcal.setText(stringdouble);

        TextView hranaPrice = (TextView) getView().findViewById(R.id.tv_price);
        stringdouble = Double.toString(HranaProvider.getHranabyId(position).getPrice());
        hranaPrice.setText(stringdouble);

    }

        @Override
        public void onSaveInstanceState(Bundle savedInstanceState) {
            super.onSaveInstanceState(savedInstanceState);
            savedInstanceState.putInt("position", position);
        }

        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
            View view = inflater.inflate(R.layout.fragment_detail, container, false);
            return view;
        }

        @Override
        public void onDestroyView() {
        super.onDestroyView();
    }
        public void setContent(final int position) {
        this.position = position;
        }

    public void updateContent(final int position) {

        this.position = position;

        ImageView ivImage = (ImageView) getView().findViewById(R.id.iv_image);
        InputStream is = null;
        try {
            is = getActivity().getAssets().open(HranaProvider.getHranabyId(position).getImage());
            Drawable drawable = Drawable.createFromStream(is, null);
            ivImage.setImageDrawable(drawable);
        } catch (IOException e) {
            e.printStackTrace();
        }

        TextView tvName = (TextView) getView().findViewById(R.id.tv_name);
        tvName.setText(HranaProvider.getHranabyId(position).getName());

        TextView tvDescription = (TextView) getView().findViewById(R.id.tv_description);
        tvDescription.setText(HranaProvider.getHranabyId(position).getDescription());

        Spinner category = (Spinner) getView().findViewById(R.id.sp_category);
        List<String> kategorije = KategorijaProvider.getKategorijaNames();
        ArrayAdapter<String> adapter = new ArrayAdapter(getActivity(), android.R.layout.simple_spinner_item, kategorije);
        category.setAdapter(adapter);
        category.setSelection((int)HranaProvider.getHranabyId(position).getCategory().getId());

        List<Sastojci> ingridients = (HranaProvider.getHranabyId(position).getIngridients());
        ArrayAdapter<String> itemsAdapter = new ArrayAdapter(getActivity(), android.R.layout.simple_list_item_1, ingridients);
        ListView listView = (ListView) getView().findViewById(R.id.tv_ingridients);
        listView.setAdapter(itemsAdapter);

        TextView hranaKcal = (TextView) getView().findViewById(R.id.tv_kcal);
        String stringdouble = Double.toString(HranaProvider.getHranabyId(position).getKcal());
        hranaKcal.setText(stringdouble);

        TextView hranaPrice = (TextView) getView().findViewById(R.id.tv_price);
        stringdouble = Double.toString(HranaProvider.getHranabyId(position).getPrice());
        hranaPrice.setText(stringdouble);

    }
}
