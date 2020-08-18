package com.example.tourguide;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import org.w3c.dom.Text;

import java.util.ArrayList;

/**
 * {@link WordAdapter} is an {@link ArrayAdapter} that can provide the layout for each list item
 * based on a data source, which is a list of {@link Word} objects.
 */
public class WordAdapter extends ArrayAdapter<Word> {

    /**
     * Create a new {@link WordAdapter} object.
     *
     * @param context is the current context (i.e. Activity) that the adapter is being created in.
     * @param words   is the list of {@link Word}s to be displayed.
     */
    public WordAdapter(@NonNull Context context, ArrayList<Word> words) {
        super(context, 0, words);
    }

    @NonNull
    @Override
    public View getView(final int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        // Check if an existing view is being reused, otherwise inflate the view

        View listView = convertView;
        if (listView == null) {
            listView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_view, parent, false);
        }
        // Get the {@link Word} object located at this position in the list
        final Word currentWord = getItem(position);
        // Find the TextView in the list_item.xml layout with the ID title_text
        TextView titleText = (TextView) listView.findViewById(R.id.title_text);
        // Get the titleText from the currentWord object and set this text on
        // the titleText TextView.
        titleText.setText(currentWord.getTitleId());
        // Find the TextView in the list_item.xml layout with the ID location_text
        TextView locationText = (TextView) listView.findViewById(R.id.location_text);
        //  Set text based on locationId
        locationText.setText(currentWord.getLocationId());
        // Find the ImageView in the list_item.xml layout with the ID image
        ImageView imageView = (ImageView) listView.findViewById(R.id.image);
        // display the provided image based on the resource ID
        imageView.setImageResource(currentWord.getResourceImageId());
        //  Find the TextView in the list_item.xml layout with the ID maps
        TextView maps = (TextView) listView.findViewById(R.id.maps);
        // change titleId it is value to string
        final String locName = getContext().getResources().getString(currentWord.getTitleId());

        maps.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri gmmIntentUri = Uri.parse("geo:"+ getContext().getResources().getString(currentWord.getLatitudeId()) +"?q=" + Uri.encode(locName));
                Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
                mapIntent.setPackage("com.google.android.apps.maps");
                // Attempt to start an activity that can handle the Intent
                if (mapIntent.resolveActivity(getContext().getPackageManager()) != null) {
                    getContext().startActivity(mapIntent);
                }

                Toast.makeText(getContext(), currentWord.getTitleId(), Toast.LENGTH_SHORT).show();
            }
        });
        // Return the whole list item layout
        return listView;
    }
}
