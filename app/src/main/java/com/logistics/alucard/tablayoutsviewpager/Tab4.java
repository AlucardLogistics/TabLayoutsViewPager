package com.logistics.alucard.tablayoutsviewpager;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

public class Tab4 extends Fragment {

    String[] myCountries = {"China", "India", "USA", "Japan","China", "India", "USA", "Japan"};
    ListView listView;

    public Tab4() {
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.fragment_4, container, false);

        listView = v.findViewById(R.id.listViewFrag4);
        ListViewAdapter myAdapter = new ListViewAdapter(myCountries, getActivity());
        listView.setAdapter(myAdapter);



        return v;
    }
}
