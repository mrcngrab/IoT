package com.mrcn.homecontroller.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.mrcn.homecontroller.R;
import com.mrcn.homecontroller.adapter.viewholder.BaseIotItemViewHolder;
import com.mrcn.homecontroller.adapter.viewholder.IotItemViewHolder;
import com.mrcn.homecontroller.model.Device;

import java.util.List;

import javax.inject.Inject;

/**
 * Created by gmra on 2016-05-10.
 */
public class IotItemsAdapter extends RecyclerView.Adapter<BaseIotItemViewHolder> {

    private List<Device> deviceList;
    private IotItemsAdapterListener listener;

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

    public void setListener(IotItemsAdapterListener listener){
        this.listener = listener;
    }

    private IotItemViewHolder createIotItemViewHolder(View view) {
        IotItemViewHolder viewHolder = new IotItemViewHolder(view);
        viewHolder.setListener(new IotItemViewHolder.IotItemViewHolderListener() {
            @Override
            public void onItemClick() {
                listener.onItemClick();
            }
        });
        return viewHolder;
    }

    public void setData(List<Device> deviceList) {
        this.deviceList = deviceList;
    }

    public interface IotItemsAdapterListener {
        public void onItemClick();

    }
}
