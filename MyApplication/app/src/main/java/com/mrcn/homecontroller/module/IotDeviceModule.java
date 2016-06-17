package com.mrcn.homecontroller.module;

import com.mrcn.homecontroller.adapter.IotItemsAdapter;
import com.mrcn.homecontroller.model.Device;

import java.util.LinkedList;

import javax.inject.Named;
import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by gmra on 2016-05-10.
 */
@Module
public class IotDeviceModule {

    @Provides
    @Singleton
    @Named("LedStrip")
    public Device getLedStrip(){
        return new Device("Led Strip","Connected");
    }

    @Provides
    @Singleton
    @Named("LightBulb")
    public Device getLightBulb() {
        return new Device("Light Bulb","Disconnected");
    }

    @Provides
    @Singleton
    public LinkedList<Device> getDeviceList() {
        return new LinkedList<>();
    }

    @Provides
    @Singleton
    public IotItemsAdapter getIotItemsAdapter() {
        return new IotItemsAdapter();
    }
}
