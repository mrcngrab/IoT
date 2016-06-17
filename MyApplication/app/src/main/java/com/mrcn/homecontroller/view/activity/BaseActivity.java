package com.mrcn.homecontroller.view.activity;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.mrcn.homecontroller.R;
import com.mrcn.homecontroller.listener.FragmentListener;

/**
 * Created by gmra on 2016-05-05.
 */
public class BaseActivity extends AppCompatActivity implements FragmentListener {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragment);
        addFragmentToLayout();
    }

    private void addFragmentToLayout() {
        FragmentManager fragmentManager = getSupportFragmentManager();
        Fragment fragment = fragmentManager.findFragmentById(R.id.fragment_container);
        if (fragment == null) {
            fragment = createFragment();
            fragmentManager.beginTransaction().add(R.id.fragment_container, fragment).commit();
        }
    }
    protected void replaceFragmentWith(Fragment fragment, Boolean shouldRemoveStack) {
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction transaction = fragmentManager.beginTransaction();
        if (shouldRemoveStack){
            transaction.replace(R.id.fragment_container, fragment);

        }
        else{
            transaction.replace(R.id.fragment_container, fragment)
                    .addToBackStack(null);

        }

        transaction.commit();

    }

    protected Fragment createFragment() {
        return new Fragment();
    }

    @Override
    public void changeFragment(Fragment fragment, Boolean shouldRemoveStack) {
        replaceFragmentWith(fragment,shouldRemoveStack);
    }


}
