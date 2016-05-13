package com.homecontroller.component;

import android.support.v4.app.Fragment;

import com.homecontroller.module.IotDeviceModule;
import com.homecontroller.module.UserModule;
import com.homecontroller.view.activity.MainActivity;
import com.homecontroller.view.fragment.MainMenuFragment;

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
