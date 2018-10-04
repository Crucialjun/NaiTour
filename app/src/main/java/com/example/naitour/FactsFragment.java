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
public class FactsFragment extends Fragment {


    public FactsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_facts, container,
            false);

        ArrayList<Experience> facts = new ArrayList<>();


        facts.add(new Experience(getString(R.string.nairobi_history), getString(R.string.nairobi_history_body)));
        facts.add(new Experience(getString(R.string.get_there),getString(R.string.get_there_body)));
        facts.add(new Experience(getString(R.string.sights_souns),getString(R.string.sight_sounds_body)));
        facts.add(new Experience(getString(R.string.culture_lifestyle), getString(R.string.culture_lifestyle_body)));
        facts.add(new Experience(getString(R.string.doing_business),getString(R.string.doing_business_body)));



        FactsAdapter adapter = new FactsAdapter(getActivity(), facts);

        ListView listView = rootView.findViewById(R.id.facts_fragment);

        listView.setAdapter(adapter);

        return rootView;
    }

}
