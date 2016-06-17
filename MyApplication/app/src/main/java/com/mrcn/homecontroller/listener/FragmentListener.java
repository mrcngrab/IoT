package com.mrcn.homecontroller.listener;

import android.support.v4.app.Fragment;

/**
 * Created by gmra on 2016-05-19.
 */
public interface FragmentListener {
    void changeFragment(Fragment fragment, Boolean shouldRemoveStack);
}