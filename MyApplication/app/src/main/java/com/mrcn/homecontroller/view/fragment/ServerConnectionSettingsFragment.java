package com.mrcn.homecontroller.view.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.mrcn.homecontroller.R;
import com.mrcn.homecontroller.component.DaggerAppComponent;

import butterknife.ButterKnife;

/**
 * Created by gmra on 2016-05-20.
 */
public class ServerConnectionSettingsFragment extends BaseFragment {

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_server_settings, container, false);
        ButterKnife.bind(this, view);

        return view;
    }
}
