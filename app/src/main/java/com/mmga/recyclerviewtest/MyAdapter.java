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
public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder> {


    private final List<String> mDatas;

//      Provide a suitable constructor (depends on the kind of dataset)
    public MyAdapter(List<String> mDatas) {
        this.mDatas = mDatas;
    }

//      Provide a reference to the views for each data item
//      Complex data items may need more than one view per item, and
//      you provide access to all the views for a data item in a view holder
    public static class MyViewHolder extends RecyclerView.ViewHolder {
//      each data item is just a string in this case
        public TextView mTextView;
        public MyViewHolder(View itemView) {
            super(itemView);
            mTextView = (TextView) itemView.findViewById(R.id.id_num);
        }
    }

    // Create new views (invoked by the layout manager)
    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        // create a new view
        View view = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.item, viewGroup, false);
// set the view's size, margins, paddings and layout parameters



        MyViewHolder vh = new MyViewHolder(view);
        return vh;
    }

    // Replace the contents of a view (invoked by the layout manager)
    @Override
    public void onBindViewHolder(MyViewHolder viewHolder, int i) {
        viewHolder.mTextView.setText(mDatas.get(i));
    }

    // Return the size of your dataset (invoked by the layout manager)
    @Override
    public int getItemCount() {
        return mDatas.size();
    }



}
