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


public class SightsFragment extends Fragment {

    public SightsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.activity_list, container, false);

        // Create and setup the {@link AudioManager} to request audio focus


        // Create a list of words
        final ArrayList<Word> words = new ArrayList<Word>();

        words.add(new Word(getString(R.string.sights1), getString(R.string.hour1), getString(R.string.phone1), R.drawable.mastixa2));
        words.add(new Word(getString(R.string.sights2), getString(R.string.hour2), getString(R.string.phone2), R.drawable.spilaio2));
        words.add(new Word(getString(R.string.sights3), getString(R.string.hour3), getString(R.string.phone3), R.drawable.maritime));
        words.add(new Word(getString(R.string.sights4), getString(R.string.hour4), getString(R.string.phone4), R.drawable.castle));
        words.add(new Word(getString(R.string.sights5), getString(R.string.hour5), getString(R.string.phone5), R.drawable.krina));
        words.add(new Word(getString(R.string.sights6), getString(R.string.hour6), getString(R.string.phone6), R.drawable.neamoni));


        // Create an {@link WordAdapter}, whose data source is a list of {@link Word}s. The
        // adapter knows how to create list items for each item in the list.

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // word_list.xml layout file.

        // Make the {@link ListView} use the {@link WordAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Word} in the list.
        WordAdapter itemsAdapter = new WordAdapter(getActivity(), words, R.color.category_sights);

        ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(itemsAdapter);

        return rootView;
    }


}
