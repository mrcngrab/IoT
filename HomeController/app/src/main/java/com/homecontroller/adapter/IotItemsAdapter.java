package com.homecontroller.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.homecontroller.R;
import com.homecontroller.adapter.viewholder.BaseIotItemViewHolder;
import com.homecontroller.adapter.viewholder.IotItemViewHolder;
import com.homecontroller.model.Device;

import java.util.List;

import javax.inject.Inject;

/**
 * Created by gmra on 2016-05-10.
 */
public class IotItemsAdapter extends RecyclerView.Adapter<BaseIotItemViewHolder> {

    private List<Device> deviceList;

    @Override
    public BaseIotItemViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_connected_device,parent,false);
        return createIotItemViewHolder(view);
    }

    @Override
    public void onBindViewHolder(BaseIotItemViewHolder holder, int position) {
        holder.setData(deviceList.get(position));
    }

    @Override
    public int getItemCount() {
        return deviceList.size();
    }

    private IotItemViewHolder createIotItemViewHolder(View view) {
        IotItemViewHolder viewHolder = new IotItemViewHolder(view);
        return viewHolder;
    }

    public void setData(List<Device> deviceList) {
        this.deviceList = deviceList;
    }
}
