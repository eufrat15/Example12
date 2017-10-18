package rs.aleph.android.example12.activities;

import android.app.Activity;

import android.graphics.drawable.Drawable;
import android.os.Bundle;

import android.view.View;
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
import rs.aleph.android.example12.activities.model.Hrana;
import rs.aleph.android.example12.activities.model.Kategorija;
import rs.aleph.android.example12.activities.model.Sastojci;
import rs.aleph.android.example12.activities.provider.HranaProvider;
import rs.aleph.android.example12.activities.provider.KategorijaProvider;
import rs.aleph.android.example12.activities.provider.SastojciProvider;

// Each activity extends Activity class
public class SecondActivity extends Activity {

    private int position = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_relative);

        final int position = getIntent().getIntExtra("position", 0);

        ImageView ivImage = (ImageView) findViewById(R.id.iv_image);
        InputStream is = null;
        try {
            is = getAssets().open(HranaProvider.getHranabyId(position).getImage());
            Drawable drawable = Drawable.createFromStream(is, null);
            ivImage.setImageDrawable(drawable);
        } catch (IOException e) {
            e.printStackTrace();
        }

        TextView tvName = (TextView) findViewById(R.id.tv_name);
        tvName.setText(HranaProvider.getHranabyId(position).getName());


        TextView tvDescription = (TextView) findViewById(R.id.tv_description);
        tvDescription.setText(HranaProvider.getHranabyId(position).getDescription());

        TextView tvKcal = (TextView) findViewById(R.id.tv_kcal);
        tvKcal.setText(Integer.toString(HranaProvider.getHranabyId(position).getKcal()));

        TextView tvPrice = (TextView) findViewById(R.id.tv_price);
        tvPrice.setText(Double.toString(HranaProvider.getHranabyId(position).getPrice()));


        Spinner category = (Spinner) findViewById(R.id.sp_category);
        List<String> categories = KategorijaProvider.getKategorijaNames();
        ArrayAdapter<String> adapter = new ArrayAdapter(this, android.R.layout.simple_spinner_item, categories);
        category.setAdapter(adapter);
        category.setSelection((int)HranaProvider.getHranabyId(position).getCategory().getId());

        ListView listView = (ListView) findViewById(R.id.lv_list_view);
        List<String> list = SastojciProvider.getSastojciNames();
        ArrayAdapter<String> adapter2 = new ArrayAdapter(this, android.R.layout.simple_list_item_1, list);
        listView.setAdapter(adapter2);
        listView.setSelection((int) HranaProvider.getHranabyId(position).getIngridients().getId());

    }

}
