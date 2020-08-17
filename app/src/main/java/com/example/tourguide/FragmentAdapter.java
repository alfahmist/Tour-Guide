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
            return new AttractionFragment();
        } else if (position == 1) {
            return new AttractionFragment();
        } else if (position == 2) {
            return new AttractionFragment();
        } else {
            return new AttractionFragment();
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
            return mContext.getString(R.string.attraction);
        } else if (position == 1) {
            return mContext.getString(R.string.attraction);
        } else if (position == 2) {
            return mContext.getString(R.string.attraction);
        } else {
            return mContext.getString(R.string.attraction);
        }
    }
}

