package com.logistics.alucard.tablayoutsviewpager;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class Tab2 extends Fragment {

    public Tab2() {
    }

    SubViewPagerAdapter adapter;
    TabLayout tabLayout;
    ViewPager viewPager;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.fragment_2, container, false);

        tabLayout = v.findViewById(R.id.fragOnetabs);
        viewPager = v.findViewById(R.id.fragOneviewpager);

        adapter = new SubViewPagerAdapter(getChildFragmentManager());

        viewPager.setAdapter(adapter);
        tabLayout.setupWithViewPager(viewPager);



        return v;
    }
}
