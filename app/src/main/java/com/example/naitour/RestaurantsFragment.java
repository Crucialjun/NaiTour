package com.example.naitour;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.ListView;

import java.security.spec.ECField;
import java.util.ArrayList;

public class RestaurantsFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_restaurants, container,
                false);

        ArrayList<Experience> experiences = new ArrayList<>();


        experiences.add(new Experience(R.drawable.carnivore, "Carnivore"));
        experiences.add(new Experience(R.drawable.roadhouse_grill, "Road House Grill"));
        experiences.add(new Experience(R.drawable.karen_blixen_coffee, "Karen Blixen's Coffee Garden"));
        experiences.add(new Experience(R.drawable.talisman, "Talisman"));
        experiences.add(new Experience(R.drawable.al_yusra, "Al - Yusra"));



        ExperienceAdapter adapter = new ExperienceAdapter(getActivity(), experiences);

        ListView listView = rootView.findViewById(R.id.restaurants_fragment);

        listView.setAdapter(adapter);

        return rootView;

    }
}
