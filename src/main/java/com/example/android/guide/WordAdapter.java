package com.example.android.guide;

import android.app.Activity;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class WordAdapter extends ArrayAdapter<Word> {

    private int resourceColorId;

    public WordAdapter(Activity context, ArrayList<Word> words, int resource) {

        super(context, 0, words);
        resourceColorId = resource;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        // Get the {@link AndroidFlavor} object located at this position in the list
        Word currentWord = getItem(position);

        ImageView img = (ImageView) listItemView.findViewById(R.id.image);

        if (currentWord.hasImage()) {
            img.setImageResource(currentWord.getImageId());
            img.setVisibility(View.VISIBLE);
        } else {
            img.setVisibility(View.GONE);
        }

        View textContainer = (View) listItemView.findViewById(R.id.text_container);
        int color = ContextCompat.getColor(getContext(), resourceColorId);
        textContainer.setBackgroundColor(color);

        // Find the TextView in the list_item.xml layout with the ID version_name
        TextView textView1 = (TextView) listItemView.findViewById(R.id.text1);
        // Get the version name from the current AndroidFlavor object and
        // set this text on the name TextView
        textView1.setText(currentWord.getLocation());

        // Find the TextView in the list_item.xml layout with the ID version_number
        TextView textView2 = (TextView) listItemView.findViewById(R.id.text2);
        // Get the version number from the current AndroidFlavor object and
        // set this text on the number TextView
        textView2.setText(currentWord.getBusinessHour());
        // Find the TextView in the list_item.xml layout with the ID version_number
        TextView textView3 = (TextView) listItemView.findViewById(R.id.text3);
        // Get the version number from the current AndroidFlavor object and
        // set this text on the number TextView
        textView3.setText(currentWord.getPhoneNuber());


        // Return the whole list item layout (containing 2 TextViews and an ImageView)
        // so that it can be shown in the ListView
        return listItemView;
    }


}
