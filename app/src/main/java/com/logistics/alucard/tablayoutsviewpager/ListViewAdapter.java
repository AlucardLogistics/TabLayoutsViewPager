package com.logistics.alucard.tablayoutsviewpager;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

public class ListViewAdapter extends BaseAdapter  {

    String myCountry[];
    Context ctx;

    LayoutInflater layoutInflater;

    public ListViewAdapter(String[] myCountry, Context ctx) {
        this.myCountry = myCountry;
        this.ctx = ctx;

        layoutInflater =  (LayoutInflater) ctx.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        return myCountry.length;
    }

    @Override
    public Object getItem(int position) {
        return position;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {


        View v = layoutInflater.inflate(R.layout.item_list, parent, false);

        TextView tvCountry = v.findViewById(R.id.tvCountry);

        tvCountry.setText(myCountry[position]);

        return v;
    }
}
