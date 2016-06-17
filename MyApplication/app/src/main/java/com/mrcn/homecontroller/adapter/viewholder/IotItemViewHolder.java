package com.mrcn.homecontroller.adapter.viewholder;

import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;


import com.mrcn.homecontroller.R;
import com.mrcn.homecontroller.model.Device;

import butterknife.BindView;
import butterknife.OnClick;

/**
 * Created by gmra on 2016-05-10.
 */
public class IotItemViewHolder extends BaseIotItemViewHolder{

    @BindView(R.id.card_view_device)
    CardView deviceView;
    @BindView(R.id.image_device_preview)
    ImageView devicePreviewImageView;
    @BindView(R.id.text_device_name)
    TextView deviceNameTextView;
    @BindView(R.id.text_device_status)
    TextView deviceStatusTextView;

    private IotItemViewHolderListener listener;

    public IotItemViewHolder(View itemView) {
        super(itemView);
    }

    public void setListener (IotItemViewHolderListener listener) {
        this.listener = listener;
    }

    @Override
    public void setData(Device device) {
        setupView(device);
    }

    private void setupView(Device device) {
        deviceNameTextView.setText(device.getDeviceName());
        deviceStatusTextView.setText(device.getStatus());
    }

    @OnClick(R.id.card_view_device)
    public void onDeviceClick() {listener.onItemClick();}

    public interface IotItemViewHolderListener {
        void onItemClick();
    }
}
