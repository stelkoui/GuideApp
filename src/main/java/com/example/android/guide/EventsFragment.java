package com.example.android.guide;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class EventsFragment extends Fragment {

    public EventsFragment() {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.activity_list, container, false);

        ArrayList<Word> events = new ArrayList<Word>();

        events.add(new Word(getString(R.string.event1), getString(R.string.hour1), getString(R.string.phone1)));
        events.add(new Word(getString(R.string.event2), getString(R.string.hour2), getString(R.string.phone2)));
        events.add(new Word(getString(R.string.event3), getString(R.string.hour3), getString(R.string.phone3)));
        events.add(new Word(getString(R.string.event4), getString(R.string.hour4), getString(R.string.phone4)));
        events.add(new Word(getString(R.string.event5), getString(R.string.hour5), getString(R.string.phone5)));
        events.add(new Word(getString(R.string.event6), getString(R.string.hour6), getString(R.string.phone6)));

        WordAdapter itemsAdapter = new WordAdapter(getActivity(), events, R.color.category_events);
        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(itemsAdapter);
        return rootView;
    }

}
