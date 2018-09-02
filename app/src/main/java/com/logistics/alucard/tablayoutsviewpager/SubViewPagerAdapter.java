package com.logistics.alucard.tablayoutsviewpager;

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class SubViewPagerAdapter extends FragmentPagerAdapter {

    public SubViewPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return new SubTab1();
            case 1:
                return new SubTab2();
            case 2:
                return new SubTab3();
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return 3;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {

        String title = null;

        switch (position) {
            case 0:
                return "Sub Tab1";
            case 1:
                return "Sub Tab2";
            case 2:
                return "Sub Tab3";
            default:
                return title;
        }
    }
}
