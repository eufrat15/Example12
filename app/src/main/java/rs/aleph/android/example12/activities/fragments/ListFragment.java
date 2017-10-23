package rs.aleph.android.example12.activities.fragments;

import android.app.Activity;
import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.List;

import rs.aleph.android.example12.R;
import rs.aleph.android.example12.activities.provider.HranaProvider;


public class ListFragment extends Fragment {

    OnItemSelectedListener listener;


    @Override
    public void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {

        super.onActivityCreated(savedInstanceState);

        final List<String> hranaNames = HranaProvider.getHranaNames();

        ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(getActivity(), R.layout.list_item, hranaNames);
        ListView listView = (ListView) getActivity().findViewById(R.id.listofFoods);

        listView.setAdapter(dataAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                listener.onItemSelected(position);
            }
        });

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        if (container == null) {
            return null;
        }

        View view = inflater.inflate(R.layout.fragment_list, container, false);

        return view;
    }

    @Override
    public void onDestroyView() {

        super.onDestroyView();

    }

    @Override
    public void onAttach(Activity activity) {

        super.onAttach(activity);

        try {
            listener = (OnItemSelectedListener) activity;
        } catch (ClassCastException e) {
            throw new ClassCastException(activity.toString() + " must implement OnItemSelectedListener");
        }
    }

    public interface OnItemSelectedListener {

        public void onItemSelected(int position);
    }
}
