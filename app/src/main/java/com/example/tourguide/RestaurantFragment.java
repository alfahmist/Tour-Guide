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

public class RestaurantFragment extends Fragment {
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.word_list, container, false);

        // Create a list of words
        final ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word(R.string.restaurant_asinan, R.string.restaurant_loc_asinan,
                R.drawable.asinan,R.string.maps_restaurant_asinan));
        words.add(new Word(R.string.restaurant_ayam, R.string.restaurant_loc_ayam,
                R.drawable.ayam,R.string.maps_restaurant_ayam));
        words.add(new Word(R.string.restaurant_defacto, R.string.restaurant_loc_defacto,
                R.drawable.defacto,R.string.maps_restaurant_defacto));
        words.add(new Word(R.string.restaurant_yauda, R.string.restaurant_loc_yauda,
                R.drawable.yauda,R.string.maps_restaurant_yauda));
        words.add(new Word(R.string.restaurant_martabak, R.string.restaurant_loc_martabak,
                R.drawable.martabak,R.string.maps_restaurant_martabak));
        words.add(new Word(R.string.restaurant_nomi, R.string.restaurant_loc_nomi,
                R.drawable.nominomi,R.string.maps_restaurant_nomi));
        words.add(new Word(R.string.restaurant_quiznos, R.string.restaurant_loc_quiznos,
                R.drawable.quiznos,R.string.maps_restaurant_quiznos));
        words.add(new Word(R.string.restaurant_locale, R.string.restaurant_loc_locale,
                R.drawable.locale,R.string.maps_restaurant_locale));

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
