package com.saylani.databindingsample;

import android.content.Context;
import android.databinding.DataBindingUtil;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;

import com.saylani.databindingsample.databinding.SingleItemBind;

/**
 * Created by MT-2016 on 29-Jan-17.
 */
public class MyAdapter extends ArrayAdapter<String> {

    private Context context;
    public MyAdapter(Context context, int resource) {
        super(context, resource);
        this.context = context;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        SingleItemBind bind = DataBindingUtil.inflate(LayoutInflater.from(context),R.layout.single_item,parent,false);


        return bind.getRoot();
    }
}
