package com.example.admin.myrecyclerview.adapter;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.example.admin.myrecyclerview.R;
import com.example.admin.myrecyclerview.entity.HomeItem;

import java.util.List;

public class PopularizeAdapter extends BaseQuickAdapter<HomeItem, BaseViewHolder> {
    public PopularizeAdapter(int layoutResId, List data) {
        super(layoutResId, data);
    }

    @Override
    protected void convert(BaseViewHolder helper, HomeItem item) {
        helper.setText(R.id.text, item.getTitle());
        helper.setImageResource(R.id.popularize_image, item.getImageResource());
    }
}
