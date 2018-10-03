package com.example.naitour;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Objects;

/**
 * The type Experience adapter.
 */
public class ExperienceAdapter extends ArrayAdapter <Experience> {

    /**
     * Instantiates a new Experience adapter.
     *
     * @param context    the context
     * @param experience the experience
     */
    public ExperienceAdapter(Context context, ArrayList<Experience> experience){
        super(context,0,experience);

    }


    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View listItemView = convertView;
        if(listItemView == null){
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.layout_format,parent,false);
        }

        Experience currentPlaceImage = getItem(position);
        Experience currentPlaceName = getItem(position);




        ImageView placeImage = listItemView.findViewById(R.id.place_image);
        placeImage.setImageResource(Objects.requireNonNull(currentPlaceImage).getPlaceImage());

        TextView placeName = listItemView.findViewById(R.id.place_name);
        placeName.setText(currentPlaceName.getPlaceName());






        return listItemView;
    }
}
