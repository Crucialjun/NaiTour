package com.example.naitour;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class AttractionsFragment extends Fragment {



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_attractions, container,
                false);

        ArrayList<Experience> attractions = new ArrayList<>();


        attractions.add(new Experience(getString(R.string.david_shel),getString(R.string.david_shel_body)));
        attractions.add(new Experience(getString(R.string.national_park),getString(R.string.national_park_body)));
        attractions.add(new Experience(getString(R.string.national_museum),getString(R.string.museum_body)));
        attractions.add(new Experience(getString(R.string.giraffe_centre),getString(R.string.giraffe_centre_body)));
        attractions.add(new Experience(getString(R.string.karen_blix),getString(R.string.karen_blix_body)));

        FactsAdapter adapter = new FactsAdapter(getActivity(), attractions);

        ListView listView = rootView.findViewById(R.id.attractions_fragment);

        listView.setAdapter(adapter);

        return rootView;
    }

}
