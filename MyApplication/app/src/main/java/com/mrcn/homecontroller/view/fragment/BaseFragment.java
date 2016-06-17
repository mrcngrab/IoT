package com.mrcn.homecontroller.view.fragment;

import android.app.Activity;
import android.content.Context;
import android.support.v4.app.Fragment;

import com.mrcn.homecontroller.listener.FragmentListener;

/**
 * Created by gmra on 2016-05-06.
 */
public class BaseFragment extends Fragment {

    protected FragmentListener fragmentListener;

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);

        if(context instanceof FragmentListener) {
            fragmentListener = (FragmentListener) context;
        }
    }
}
