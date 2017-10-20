package rs.aleph.android.example12.activities;

import android.app.Activity;
import android.app.FragmentTransaction;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.List;

import rs.aleph.android.example12.R;
import rs.aleph.android.example12.activities.fragments.DetailFragment;
import rs.aleph.android.example12.activities.fragments.ListFragment;
import rs.aleph.android.example12.activities.model.Hrana;
import rs.aleph.android.example12.activities.provider.HranaProvider;


public class FirstActivity extends Activity implements ListFragment.OnItemSelectedListener {

	boolean landscape = false;

	@Override
	protected void onCreate(Bundle savedInstanceState) 	{

		super.onCreate(savedInstanceState);

		setContentView(R.layout.activity_first);

		if (savedInstanceState == null) {
			FragmentTransaction ft = getFragmentManager().beginTransaction();
			ListFragment listFragment = new ListFragment();
			ft.add(R.id.list_view, listFragment, "List_Fragment_1");
			ft.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE);
			ft.commit();
		}

		if (findViewById(R.id.detail_view) != null) {
			landscape = true;
			getFragmentManager().popBackStack();

			DetailFragment detailFragment = (DetailFragment) getFragmentManager().findFragmentById(R.id.detail_view);
			if (detailFragment == null) {
				FragmentTransaction ft = getFragmentManager().beginTransaction();
				detailFragment = new DetailFragment();
				ft.replace(R.id.detail_view, detailFragment, "Detail_Fragment_1");
				ft.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE);
				ft.commit();
			}
		}
	}

	@Override
	public void onItemSelected(int position) {

		Toast.makeText(getBaseContext(), "FirstActivity.onItemSelected()", Toast.LENGTH_SHORT).show();

		if (landscape) {
			DetailFragment detailFragment = (DetailFragment) getFragmentManager().findFragmentById(R.id.detail_view);
			detailFragment.updateContent(position);
		} else {
			DetailFragment detailFragment = new DetailFragment();
			detailFragment.setContent(position);
			FragmentTransaction ft = getFragmentManager().beginTransaction();
			ft.replace(R.id.list_view, detailFragment, "Detail_Fragment_2");
			ft.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE);
			ft.addToBackStack(null);
			ft.commit();
		}
	}

}
