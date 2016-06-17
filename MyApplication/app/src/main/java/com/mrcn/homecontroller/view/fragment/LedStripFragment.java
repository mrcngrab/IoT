package com.mrcn.homecontroller.view.fragment;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.larswerkman.holocolorpicker.ColorPicker;
import com.larswerkman.holocolorpicker.SaturationBar;
import com.mrcn.homecontroller.R;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Created by gmra on 2016-05-09.
 */
public class LedStripFragment extends BaseFragment {
    @BindView(R.id.color_picker)
    public ColorPicker colorPickerView;
    @BindView(R.id.saturation_bar)
    public SaturationBar saturationBar;
    @BindView(R.id.button_set_color)
    public Button buttonSetColor;

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_led_strip_options, container, false);
        ButterKnife.bind(this, view);
        initColorPicker();

        return view;
    }

    private void initColorPicker() {
        colorPickerView.addSaturationBar(saturationBar);
        colorPickerView.setShowOldCenterColor(false);
    }

    @OnClick(R.id.button_set_color)
    public void setColor() {
        buttonSetColor.setBackgroundColor(colorPickerView.getColor());
        String hexColor = String.format("#%06X", (0xFFFFFF & colorPickerView.getColor()));
        hexColor = hexColor.substring(1,7);
        int r = Integer.parseInt(hexColor.substring(0, 2), 16);
        int g = Integer.parseInt(hexColor.substring(2, 4), 16);
        int b = Integer.parseInt(hexColor.substring(4, 6), 16);
        Log.d("colorR", String.valueOf(r));
        Log.d("colorG", String.valueOf(g));
        Log.d("colorB", String.valueOf(b));
    }
}
