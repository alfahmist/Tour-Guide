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

public class AttractionFragment extends Fragment {
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.word_list, container, false);

        // Create a list of words
        final ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word(R.string.attraction_anggrek, R.string.attraction_loc_anggrek,
                R.drawable.taman_anggrek));
        words.add(new Word(R.string.attraction_anggrek, R.string.attraction_loc_anggrek,
                R.drawable.taman_anggrek));
        words.add(new Word(R.string.attraction_anggrek, R.string.attraction_loc_anggrek,
                R.drawable.taman_anggrek));
        words.add(new Word(R.string.attraction_anggrek, R.string.attraction_loc_anggrek,
                R.drawable.taman_anggrek));
        words.add(new Word(R.string.attraction_anggrek, R.string.attraction_loc_anggrek,
                R.drawable.taman_anggrek));
        words.add(new Word(R.string.attraction_anggrek, R.string.attraction_loc_anggrek,
                R.drawable.taman_anggrek));
        words.add(new Word(R.string.attraction_anggrek, R.string.attraction_loc_anggrek,
                R.drawable.taman_anggrek));
        words.add(new Word(R.string.attraction_anggrek, R.string.attraction_loc_anggrek,
                R.drawable.taman_anggrek));

        WordAdapter adapter = new WordAdapter(getActivity(), words);

        ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);

        return rootView;
    }
}
