package com.example.tourguide;

import android.content.Context;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class FragmentAdapter extends FragmentPagerAdapter {

    private Context mContext;

    public FragmentAdapter(Context context, @NonNull FragmentManager fm) {
        super(fm);
        mContext = context;
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {

        if (position == 0) {
            return new ParkFragment();
        } else if (position == 1) {
            return new RestaurantFragment();
        } else if (position == 2) {
            return new MuseumFragment();
        } else {
            return new HotelFragment();
        }
    }

    @Override
    public int getCount() {
        return 4;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0) {
            return mContext.getString(R.string.park);
        } else if (position == 1) {
            return mContext.getString(R.string.restaurant);
        } else if (position == 2) {
            return mContext.getString(R.string.museum);
        } else {
            return mContext.getString(R.string.hotel);
        }
    }
}

