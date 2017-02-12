package com.saylani.databindingsample;

import android.content.Context;
import android.databinding.DataBindingUtil;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.saylani.databindingsample.databinding.RecycleSingleItemBind;

/**
 * Created by MT-2016 on 12-Feb-17.
 */
public class MyRecycleAdapter extends RecyclerView.Adapter<MyRecycleAdapter.MyViewHolder>{

    private Context context;
    private String[] data;

    public MyRecycleAdapter(Context context, String[] data){
        this.context = context;
        this.data = data;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        RecycleSingleItemBind bind =
                DataBindingUtil.inflate(LayoutInflater.from(context),R.layout.recyler_single_item,parent,false);

        return new MyViewHolder(bind);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        holder.setData(position);
    }

    @Override
    public int getItemCount() {
        return data.length;
    }

    class MyViewHolder extends RecyclerView.ViewHolder{

        RecycleSingleItemBind bind;


        public MyViewHolder(RecycleSingleItemBind bind){
            super(bind.getRoot());
            this.bind = bind;
        }


        void setData(int position){
            bind.singleRecycleBtn.setText("");
        }
    }
}
