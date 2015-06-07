package com.mmga.recyclerviewtest;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

/**
 * Created by mmga on 2015/6/7.
 */
public class HomeAdapter extends RecyclerView.Adapter<HomeAdapter.MyViewHolder> {


    private final List<String> mDatas;

    public HomeAdapter(List<String> mDatas) {
        this.mDatas = mDatas;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item, viewGroup, false);
        MyViewHolder vh = new MyViewHolder(view);
        return vh;
    }

    @Override
    public void onBindViewHolder(MyViewHolder viewHolder, int i) {
        viewHolder.mTextView.setText(mDatas.get(i));
    }

    @Override
    public int getItemCount() {
        return mDatas.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView mTextView;
        public MyViewHolder(View itemView) {
            super(itemView);
            mTextView = (TextView) itemView.findViewById(R.id.id_num);
        }
    }



}
