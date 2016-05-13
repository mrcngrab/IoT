package com.homecontroller.adapter.viewholder;

import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.homecontroller.model.Device;

import butterknife.ButterKnife;

/**
 * Created by gmra on 2016-05-10.
 */
public class BaseIotItemViewHolder extends RecyclerView.ViewHolder {
    public BaseIotItemViewHolder(View itemView) {
        super(itemView);
        ButterKnife.bind(this, itemView);
    }

    public void setData(Device device) {

    }
}
