package com.logistics.alucard.tablayoutsviewpager;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

public class Tab3 extends Fragment {

    private static final String TAG = "Tab3";

    EditText etMessage;
    Button btSend;
    MyInterface myInterface;
    Context ctx;

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        myInterface = (MyInterface) getActivity();
    }

    public Tab3() {
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.fragment_3, container, false);

        etMessage = v.findViewById(R.id.etMessage);
        btSend = v.findViewById(R.id.btSend);

        btSend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String message = etMessage.getText().toString();
                Log.d(TAG, "onClick: data: " + message);
                myInterface.sendData(message);

                CustomDialog dialog = new CustomDialog();
                dialog.showDialog(getActivity(), "Message will be sent to Tab 6");
                Log.d(TAG, "onClick: dialog " + dialog);
            }
        });


        return v;
    }
}
