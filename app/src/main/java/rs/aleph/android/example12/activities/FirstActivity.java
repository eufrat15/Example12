package rs.aleph.android.example12.activities;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.List;

import rs.aleph.android.example12.R;
import rs.aleph.android.example12.activities.model.Hrana;
import rs.aleph.android.example12.activities.provider.HranaProvider;


public class FirstActivity extends Activity {


	@Override
	protected void onCreate(Bundle savedInstanceState) 	{

		super.onCreate(savedInstanceState);

		setContentView(R.layout.activity_main);

		Toast toast = Toast.makeText(getBaseContext(), "FirstActivity.onCreate()", Toast.LENGTH_SHORT);
		toast.show();

        final List<String> hranaNames = HranaProvider.getHranaNames();

		ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(this, R.layout.list_item, hranaNames);
		ListView listView = (ListView) findViewById(R.id.listofFoods);


		listView.setAdapter(dataAdapter);


		listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
			public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
				Intent intent = new Intent(FirstActivity.this, SecondActivity.class);
				intent.putExtra("position", position);
				startActivity(intent);
			}
		});
	}

}
