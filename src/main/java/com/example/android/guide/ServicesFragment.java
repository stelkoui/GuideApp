package com.example.android.guide;

import android.content.Context;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;


public class ServicesFragment extends Fragment {

    public ServicesFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.activity_list, container, false);


        ArrayList<Word> services = new ArrayList<Word>();


        services.add(new Word(getString(R.string.service1), getString(R.string.hour1), getString(R.string.phone1)));
        services.add(new Word(getString(R.string.service2), getString(R.string.hour2), getString(R.string.phone2)));
        services.add(new Word(getString(R.string.service3), getString(R.string.hour3), getString(R.string.phone3)));
        services.add(new Word(getString(R.string.service4), getString(R.string.hour1), getString(R.string.phone4)));
        services.add(new Word(getString(R.string.service5), getString(R.string.hour4), getString(R.string.phone1)));
        services.add(new Word(getString(R.string.service6), getString(R.string.hour5), getString(R.string.phone5)));
        services.add(new Word(getString(R.string.service7), getString(R.string.hour6), getString(R.string.phone6)));
        services.add(new Word(getString(R.string.service8), getString(R.string.hour3), getString(R.string.phone4)));
        services.add(new Word(getString(R.string.service9), getString(R.string.hour4), getString(R.string.phone2)));
        services.add(new Word(getString(R.string.service10), getString(R.string.hour5), getString(R.string.phone3)));

        WordAdapter itemsAdapter = new WordAdapter(getActivity(), services, R.color.category_services);

        ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(itemsAdapter);


        return rootView;


    }


}
