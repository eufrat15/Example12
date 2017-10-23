package rs.aleph.android.example12.activities;

import android.app.Activity;
import android.app.FragmentTransaction;
import android.os.Bundle;

import rs.aleph.android.example12.R;
import rs.aleph.android.example12.activities.fragments.DetailFragment;
import rs.aleph.android.example12.activities.fragments.ListFragment;


public class FirstActivity extends Activity implements ListFragment.OnItemSelectedListener {

	boolean landscape = false;

	@Override
	protected void onCreate(Bundle savedInstanceState) 	{

		super.onCreate(savedInstanceState);

		setContentView(R.layout.activity_first);

		if (savedInstanceState == null) {
			FragmentTransaction ft = getFragmentManager().beginTransaction();
			ListFragment listFragment = new ListFragment();
			ft.add(R.id.fl_list, listFragment, "List_Fragment_1");
			ft.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE);
			ft.commit();
		}

		if (findViewById(R.id.fl_detail) != null) {
			landscape = true;
			getFragmentManager().popBackStack();

			DetailFragment detailFragment = (DetailFragment) getFragmentManager().findFragmentById(R.id.fl_detail);
			if (detailFragment == null) {
				FragmentTransaction ft = getFragmentManager().beginTransaction();
				detailFragment = new DetailFragment();
				ft.replace(R.id.fl_detail, detailFragment, "Detail_Fragment_1");
				ft.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE);
				ft.commit();
			}
		}
	}

	@Override
	public void onItemSelected(int position) {

		if (landscape) {
			DetailFragment detailFragment = (DetailFragment) getFragmentManager().findFragmentById(R.id.fl_detail);
			detailFragment.updateContent(position);
		} else {
			DetailFragment detailFragment = new DetailFragment();
			detailFragment.setContent(position);
			FragmentTransaction ft = getFragmentManager().beginTransaction();
			ft.replace(R.id.fl_list, detailFragment, "Detail_Fragment_2");
			ft.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE);
			ft.addToBackStack(null);
			ft.commit();
		}
	}

}
