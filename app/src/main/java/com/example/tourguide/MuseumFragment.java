package com.example.tourguide;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import java.util.ArrayList;

public class MuseumFragment extends Fragment {
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.word_list, container, false);

        // Create a list of words
        final ArrayList<Word> words = new ArrayList<Word>();

        words.add(new Word(R.string.museum_fauna, R.string.museum_loc_fauna, R.drawable.fauna,R.string.maps_museum_fauna));
        words.add(new Word(R.string.museum_migas, R.string.museum_loc_migas,
                R.drawable.migas,R.string.maps_museum_migas));
        words.add(new Word(R.string.museum_prajurit, R.string.museum_loc_prajurit,
                R.drawable.prajurit,R.string.maps_museum_prajurit));
        words.add(new Word(R.string.museum_gajah, R.string.museum_loc_gajah,
                R.drawable.museumgajah,R.string.maps_museum_gajah));
        words.add(new Word(R.string.museum_fatahillah, R.string.museum_loc_fatahillah,
                R.drawable.fatahillah,R.string.maps_museum_fatahillah));

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
