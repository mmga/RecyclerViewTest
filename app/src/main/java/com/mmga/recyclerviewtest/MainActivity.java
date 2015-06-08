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
    private MyAdapter mAdapter;
    private LinearLayoutManager mLayoutManager;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initData();

        mRecyclerView = (RecyclerView) findViewById(R.id.my_recycler_view);

//        固定尺寸的设置为true可以提高性能
        mRecyclerView.setHasFixedSize(true);

//        设置一个LayoutManager:LinearLayoutManager,GridLayoutManager或者StaggeredGridLayoutManager
        mLayoutManager = new LinearLayoutManager(this);
        mRecyclerView.setLayoutManager(mLayoutManager);

//        设置Adapter
        mAdapter = new MyAdapter(mDatas);
        mRecyclerView.setAdapter(mAdapter);

//        自定义分割线
        mRecyclerView.addItemDecoration(new DividerItemDecoration(this,DividerItemDecoration.VERTICAL_LIST));
    }

    private void initData() {
        mDatas = new ArrayList<String>();
        for (int i = 1; i <= 30; i++) {
            mDatas.add("item" + i);
        }
    }


}
