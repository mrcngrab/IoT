package com.homecontroller.view.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.homecontroller.R;

import butterknife.ButterKnife;

/**
 * Created by gmra on 2016-05-09.
 */
public class LedStripFragment extends BaseFragment {
    //    @BindView(R.id.color_picker_view)
//    ColorPickerView colorPickerView;

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_main_menu, container, false);
        ButterKnife.bind(this, view);
//        initListeners();
        return view;
    }

    //    private void initListeners() {
//        colorPickerView.addOnColorSelectedListener(new OnColorSelectedListener() {
//            @Override
//            public void onColorSelected(int i) {
//                String hexColor = String.format("#%06X", (0xFFFFFF & i));
//                hexColor = hexColor.substring(1,7);
//                int r = Integer.parseInt(hexColor.substring(0, 2), 16);
//                int g = Integer.parseInt(hexColor.substring(2, 4), 16);
//                int b = Integer.parseInt(hexColor.substring(4, 6), 16);
//                Log.d("colorR", String.valueOf(r));
//                Log.d("colorG", String.valueOf(g));
//                Log.d("colorB", String.valueOf(b));
//            }
//        });
//
//    }
}
