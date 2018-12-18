package com.example.android.miwok;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.widget.Switch;

/**
 * Created by Dell on 18/12/2017.
 */

public class PagerAdapter extends FragmentPagerAdapter {
    public PagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public int getCount() {
        return 4;
    }

    @Override
    public Fragment getItem(int position) {
        switch(position) {
            case 0:return new NumbersFragment();
            case 1: return new ColorsFragment();
            case 2: return new FamilyFragment();
            case 3: return new PhrasesFragment();
            default : return null;
        }
    }
    @Override
    public CharSequence getPageTitle(int position) {
        switch (position){
            case 0: return "NUMBERS";
            case 1: return "COLORS";
            case 2: return "FAMILY";
            case 3: return "PHRASES";
            default: return null;
        }
    }
}
