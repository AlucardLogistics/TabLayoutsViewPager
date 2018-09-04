package com.logistics.alucard.tablayoutsviewpager;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class Tab6 extends Fragment {

    private static final String TAG = "Tab6";

    TextView tvMessage;

    public Tab6() {
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.fragment_6, container, false);

        tvMessage = v.findViewById(R.id.tvMessage);


        return v;
    }

    @Override
    public void onResume() {
        super.onResume();
        MainActivity mainActivity = new MainActivity();
        String message = MainActivity.myMessage;
        Log.d(TAG, "onResume: message" + message);


        tvMessage.setText(message);
    }

//    public void getData(String data) {
//        Log.d(TAG, "getData: data: " + data);
//
//    }
}
