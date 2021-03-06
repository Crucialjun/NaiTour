package com.example.naitour;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * The type Restaurants fragment.
 */
public class RestaurantsFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_restaurants, container,
                false);

        ArrayList<Experience> experiences = new ArrayList<>();


        experiences.add(new Experience(R.drawable.carnivore, getString(R.string.carnivore)));
        experiences.add(new Experience(R.drawable.roadhouse_grill, getString(R.string.road_house)));
        experiences.add(new Experience(R.drawable.karen_blixen_coffee, getString(R.string.karen_blix_coffee)));
        experiences.add(new Experience(R.drawable.talisman, getString(R.string.talisman)));



        ExperienceAdapter adapter = new ExperienceAdapter(getActivity(), experiences);

        ListView listView = rootView.findViewById(R.id.restaurants_fragment);

        listView.setAdapter(adapter);

        return rootView;

    }
}
