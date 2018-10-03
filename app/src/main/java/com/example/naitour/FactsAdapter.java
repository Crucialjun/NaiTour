package com.example.naitour;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter ;
import android.widget.TextView;

import java.util.ArrayList;

public class FactsAdapter extends ArrayAdapter <Experience> {

    public FactsAdapter(Context context, ArrayList<Experience> facts){
        super(context,0,facts);
    }

    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View listItemView = convertView;
        if(listItemView == null){
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.facts_layout,parent,false);
        }

        Experience currentFactTitle = getItem(position);
        Experience currentFactBody = getItem(position);

        TextView factTittle = listItemView.findViewById(R.id.fact_tittle);
        factTittle.setText(currentFactTitle.getFactTittle());

        TextView factBody = listItemView.findViewById(R.id.fact_body);
        factBody.setText(currentFactBody.getFactBody());

        return listItemView;
    }
}


