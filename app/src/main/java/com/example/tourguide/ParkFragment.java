package com.example.tourguide;

import android.content.Context;
import android.media.AudioManager;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import java.util.ArrayList;

public class ParkFragment extends Fragment {
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.word_list, container, false);

        // Create a list of words
        final ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word(R.string.park_anggrek, R.string.park_loc_anggrek,
                R.drawable.taman_anggrek,R.string.maps_park_anggrek));
        words.add(new Word(R.string.park_aquarium, R.string.park_loc_aquarium,
                R.drawable.aquarium,R.string.maps_park_aquarium));
        words.add(new Word(R.string.park_istana, R.string.park_loc_istana,
                R.drawable.istana,R.string.maps_park_istana));
        words.add(new Word(R.string.park_skyworld, R.string.park_loc_skyworld,
                R.drawable.skyworld,R.string.maps_park_skyworld));
        words.add(new Word(R.string.park_wiladatika, R.string.park_loc_wiladatika,
                R.drawable.wiladatika,R.string.maps_park_wiladatika));



        // Create an {@link WordAdapter}, whose data source is a list of {@link Word}s. The
        // adapter knows how to create list items for each item in the list.
        WordAdapter adapter = new WordAdapter(getActivity(), words);
        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // word_list.xml layout file.
        ListView listView = (ListView) rootView.findViewById(R.id.list);
        // Make the {@link ListView} use the {@link WordAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Word} in the list.
        listView.setAdapter(adapter);


        return rootView;
    }
}
