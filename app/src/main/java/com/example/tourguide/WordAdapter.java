package com.example.tourguide;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class WordAdapter extends ArrayAdapter<Word> {


    public WordAdapter(@NonNull Context context, ArrayList<Word> words) {
        super(context, 0, words);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View listView = convertView;
        if (listView == null) {
            listView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_view, parent, false);
        }
        Word currentWord = getItem(position);

        TextView titleText = (TextView) listView.findViewById(R.id.title_text);
        titleText.setText(currentWord.getTitleId());

        TextView locationText = (TextView) listView.findViewById(R.id.location_text);
        locationText.setText(currentWord.getLocationId());

        ImageView imageView = (ImageView) listView.findViewById(R.id.image);
        imageView.setImageResource(currentWord.getResourceImageId());

        return listView;
    }
}
