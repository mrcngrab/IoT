package com.homecontroller.adapter.viewholder;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.homecontroller.R;
import com.homecontroller.model.Device;

import butterknife.BindView;

/**
 * Created by gmra on 2016-05-10.
 */
public class IotItemViewHolder extends BaseIotItemViewHolder {

    @BindView(R.id.image_device_preview)
    ImageView devicePreviewImageView;
    @BindView(R.id.text_device_name)
    TextView deviceNameTextView;
    @BindView(R.id.text_device_status)
    TextView deviceStatusTextView;

    public IotItemViewHolder(View itemView) {
        super(itemView);
    }

    @Override
    public void setData(Device device) {
        setupView(device);
    }

    private void setupView(Device device) {
        deviceNameTextView.setText(device.getDeviceName());
        deviceStatusTextView.setText(device.getStatus());
    }
}
