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

public class HotelFragment extends Fragment {
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.word_list, container, false);

        // Create a list of words
        final ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word(R.string.hotel_gajah, R.string.hotel_loc_gajah,
                R.drawable.gajah,R.string.maps_hotel_gajah));
        words.add(new Word(R.string.hotel_four, R.string.hotel_loc_four,
                R.drawable.four,R.string.maps_hotel_four));
        words.add(new Word(R.string.hotel_pondok, R.string.hotel_loc_pondok,
                R.drawable.pondok,R.string.maps_hotel_pondok));
        words.add(new Word(R.string.hotel_swissotel, R.string.hotel_swissotel,
                R.drawable.swissotel,R.string.maps_hotel_swissotel));
        words.add(new Word(R.string.hotel_westin, R.string.hotel_loc_westin,
                R.drawable.westin,R.string.maps_hotel_westin));


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
