package com.mrcn.homecontroller.component;

import android.support.v4.app.Fragment;

import com.mrcn.homecontroller.module.IotDeviceModule;
import com.mrcn.homecontroller.module.UserModule;
import com.mrcn.homecontroller.view.activity.MainActivity;
import com.mrcn.homecontroller.view.fragment.MainMenuFragment;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by gmra on 2016-05-05.
 */

@Singleton
@Component(modules = {IotDeviceModule.class})
public interface AppComponent {
    void inject(MainMenuFragment mainMenuFragment);
}
