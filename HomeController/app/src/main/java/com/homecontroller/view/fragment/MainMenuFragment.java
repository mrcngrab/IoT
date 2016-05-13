package com.homecontroller.view.fragment;

import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.homecontroller.R;
import com.homecontroller.adapter.IotItemsAdapter;
import com.homecontroller.component.AppComponent;
import com.homecontroller.component.DaggerAppComponent;
import com.homecontroller.model.Device;

import java.util.LinkedList;
import java.util.List;

import javax.inject.Inject;
import javax.inject.Named;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by gmra on 2016-05-06.
 */
public class MainMenuFragment extends BaseFragment {

    @BindView(R.id.iot_items_recycler_view)
    RecyclerView mRecyclerView;



    @Inject @Named("LightBulb")
    Device bulb;
    @Inject @Named("LedStrip")
    Device ledStrip;
    @Inject
    LinkedList<Device> deviceList;
    @Inject
    IotItemsAdapter adapter;

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_main_menu, container, false);
        ButterKnife.bind(this, view);
        initRecyclerView();

        DaggerAppComponent.builder().build().inject(this);

        deviceList.add(bulb);
        deviceList.add(ledStrip);

        setupAdapter(deviceList);
        return view;
    }

    private void initRecyclerView() {
        mRecyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
    }

    private void setupAdapter(List<Device> deviceList) {

        adapter.setData(deviceList);
        mRecyclerView.setAdapter(adapter);
    }

}
