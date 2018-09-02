package com.logistics.alucard.tablayoutsviewpager;

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class ViewPagerAdapter extends FragmentPagerAdapter {

    public ViewPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {

        switch (position) {
            case 0:
                return new Tab1();
            case 1:
                return new Tab2();
            case 2:
                return new Tab3();
            case 3:
                return new Tab4();
            case 4:
                return new Tab5();
            case 5:
                return new Tab6();
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return 6;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {

        String title = null;

        switch (position) {
            case 0:
                return "Tab 1";
            case 1:
                return "Tab 2";
            case 2:
                return "Tab 3";
            case 3:
                return "Tab 4";
            case 4:
                return "Tab 5";
            case 5:
                return "Tab 6";
            default:
                return title;
        }
    }
}
