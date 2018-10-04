package com.example.naitour;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * The type Top experiences fragment.
 */
public class TopExperiencesFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.top_experiences_activity, container,
                false);

        ArrayList<Experience> experiences = new ArrayList<>();


        experiences.add(new Experience(R.drawable.national_park, getString(R.string.national_park)));
        experiences.add(new Experience(R.drawable.david_sheldrick, getString(R.string.david_shel)));
        experiences.add(new Experience(R.drawable.karen_blixen, getString(R.string.karen_blix)));
        experiences.add(new Experience(R.drawable.national_museum, getString(R.string.national_museum)));



        ExperienceAdapter adapter = new ExperienceAdapter(getActivity(), experiences);

        ListView listView = rootView.findViewById(R.id.top_experiences_activity);

        listView.setAdapter(adapter);

        return rootView;

    }
}
