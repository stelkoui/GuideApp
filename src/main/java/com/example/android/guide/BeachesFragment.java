package com.example.android.guide;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;


public class BeachesFragment extends Fragment {

    public BeachesFragment(){

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.activity_list, container, false);

        final ArrayList<Word> beaches= new ArrayList<Word>();

        beaches.add(new Word(getString(R.string.beach1), R.drawable.vroulidia));
        beaches.add(new Word(getString(R.string.beach2), R.drawable.mauravolia));
        beaches.add(new Word(getString(R.string.beach3), R.drawable.magemena));
        beaches.add(new Word(getString(R.string.beach4), R.drawable.karfas));
        beaches.add(new Word(getString(R.string.beach5), R.drawable.lithi));
        beaches.add(new Word(getString(R.string.beach6), R.drawable.komi));
        beaches.add(new Word(getString(R.string.beach7), R.drawable.leukathia));
        beaches.add(new Word(getString(R.string.beach8), R.drawable.glaroi));
        beaches.add(new Word(getString(R.string.beach9), R.drawable.elinta));


        WordAdapter itemsAdapter = new WordAdapter(getActivity(), beaches,R.color.category_beaches);
        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(itemsAdapter);
        return rootView;

    }

}
