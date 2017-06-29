package com.example.admin.myrecyclerview.adapter;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.example.admin.myrecyclerview.R;
import com.example.admin.myrecyclerview.entity.HomeItem;

import java.util.List;

public class BalanceAdapter extends BaseQuickAdapter<HomeItem, BaseViewHolder> {
    public BalanceAdapter(int layoutResId, List data) {
        super(layoutResId, data);
    }

    @Override
    protected void convert(BaseViewHolder helper, HomeItem item) {
        helper.setText(R.id.text, item.getTitle());
    }
}
