package com.example.admin.myrecyclerview;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.example.admin.myrecyclerview.adapter.BalanceAdapter;
import com.example.admin.myrecyclerview.adapter.PopularizeAdapter;
import com.example.admin.myrecyclerview.adapter.businessAdapter;
import com.example.admin.myrecyclerview.entity.HomeItem;

import java.util.ArrayList;

public class MainActivity extends Activity {

    private ArrayList<HomeItem> mDataList;
    private ArrayList<HomeItem> mDataList1;
    private String[] TITLE = {"0.1", "0.2", "0.3"};
    private String[] TITLE1 = {"我的推广", "我的团队", "商品订单","我的推广", "我的团队", "商品订单","我的推广", "我的团队", "商品订单","我的推广", "我的团队", "商品订单",};
    private int[] drawables = {R.drawable.c, R.drawable.c, R.drawable.c,R.drawable.c, R.drawable.c, R.drawable.c,R.drawable.c, R.drawable.c, R.drawable.c,R.drawable.c, R.drawable.c, R.drawable.c,};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_my);
        RecyclerView recyclerView = getById(R.id.recycler_blance_integral_liveness);
        RecyclerView recycler_my_popularize = getById(R.id.recycler_my_popularize);
        RecyclerView recycler_business = getById(R.id.recycler_business);

        GridLayoutManager gridManager = new GridLayoutManager(this,3);
        recyclerView.setLayoutManager(gridManager);

        mDataList = new ArrayList<>();
        for(int i = 0; i <TITLE.length;i++){
            HomeItem homeItem = new HomeItem();
            homeItem.setTitle(TITLE[i]);
            mDataList.add(homeItem);
        }

        BaseQuickAdapter homeAdapter = new BalanceAdapter(R.layout.item_balance, mDataList);
        homeAdapter.openLoadAnimation();
        homeAdapter.setOnItemClickListener(new BaseQuickAdapter.OnItemClickListener() {
            @Override
            public void onItemClick(BaseQuickAdapter adapter, View view, int position) {
            }
        });
        recyclerView.setAdapter(homeAdapter);

        //我的推广
        GridLayoutManager gridManager1 = new GridLayoutManager(this,4);
        recycler_my_popularize.setLayoutManager(gridManager1);

        mDataList1 = new ArrayList<>();
        for(int i = 0; i <TITLE1.length;i++){
            HomeItem homeItem = new HomeItem();
            homeItem.setTitle(TITLE1[i]);
            homeItem.setImageResource(drawables[i]);
            mDataList1.add(homeItem);
        }

        BaseQuickAdapter homeAdapter1 = new PopularizeAdapter(R.layout.item_popularrize, mDataList1);
        homeAdapter.openLoadAnimation();
        homeAdapter.setOnItemClickListener(new BaseQuickAdapter.OnItemClickListener() {
            @Override
            public void onItemClick(BaseQuickAdapter adapter, View view, int position) {
            }
        });
        recycler_my_popularize.setAdapter(homeAdapter1);

        //商家入驻
        LinearLayoutManager gridManager2 = new LinearLayoutManager(this);
        recycler_business.setLayoutManager(gridManager2);

        mDataList1 = new ArrayList<>();
        for(int i = 0; i <TITLE1.length;i++){
            HomeItem homeItem = new HomeItem();
            homeItem.setTitle(TITLE1[i]);
            homeItem.setImageResource(drawables[i]);
            mDataList1.add(homeItem);
        }

        BaseQuickAdapter homeAdapter2 = new businessAdapter(R.layout.item_business, mDataList1);
        homeAdapter.openLoadAnimation();
        homeAdapter.setOnItemClickListener(new BaseQuickAdapter.OnItemClickListener() {
            @Override
            public void onItemClick(BaseQuickAdapter adapter, View view, int position) {
            }
        });
        recycler_business.setAdapter(homeAdapter2);
    }


    public <T extends View> T getById(int id) {
        return (T) findViewById(id);
    }
}
