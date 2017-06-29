package com.example.admin.myrecyclerview.adapter;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.example.admin.myrecyclerview.R;
import com.example.admin.myrecyclerview.entity.HomeItem;

import java.util.List;

public class businessAdapter extends BaseQuickAdapter<HomeItem, BaseViewHolder> {
    public businessAdapter(int layoutResId, List data) {
        super(layoutResId, data);
    }

    @Override
    protected void convert(BaseViewHolder helper, HomeItem item) {
        helper.setText(R.id.text, item.getTitle());
        helper.setImageResource(R.id.business_image, item.getImageResource());
    }
}
