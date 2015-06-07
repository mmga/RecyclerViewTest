package com.mmga.recyclerviewtest;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;


public class MainActivity extends Activity {

    private List<String> mDatas;
    private RecyclerView mRecyclerView;
    private HomeAdapter mAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initData();

        mRecyclerView = (RecyclerView) findViewById(R.id.my_recycler_view);
        mRecyclerView.setHasFixedSize(true);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        mAdapter = new HomeAdapter(mDatas);
        mRecyclerView.setAdapter(mAdapter);
//        添加分割线
        mRecyclerView.addItemDecoration(new DividerItemDecoration(this,DividerItemDecoration.VERTICAL_LIST));
    }

    private void initData() {
        mDatas = new ArrayList<String>();
        for (int i = 1; i <= 30; i++) {
            mDatas.add("item" + i);
        }
    }


}
