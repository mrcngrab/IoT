package com.mrcn.homecontroller.view.activity;

import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.widget.Toolbar;
import android.view.Gravity;
import android.view.MenuItem;
import android.view.View;

import com.mrcn.homecontroller.R;
import com.mrcn.homecontroller.view.fragment.MainMenuFragment;
import com.mrcn.homecontroller.view.fragment.ServerConnectionSettingsFragment;


import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by gmra on 2016-05-05.
 */
public class MainActivity extends BaseActivity {

    @BindView(R.id.drawer_layout) DrawerLayout mDrawerLayout;
    @BindView(R.id.left_drawer) NavigationView mDrawerList;
    @BindView(R.id.toolbar) Toolbar toolbar;
    private ActionBarDrawerToggle toggle;
    private MenuItem currentMenuItem;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        setSupportActionBar(toolbar);
        initDrawerToggleButton();
        initNavigationView();

    }

    @Override
    protected Fragment createFragment() {
        return new MainMenuFragment();
    }

    private void  initDrawerToggleButton() {
        toggle = new ActionBarDrawerToggle(this, mDrawerLayout, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close) {

            @Override
            public void onDrawerOpened(View drawerView) {
                super.onDrawerOpened(drawerView);
            }

            @Override
            public void onDrawerClosed(View drawerView) {
                super.onDrawerClosed(drawerView);
            }
        };
        mDrawerLayout.addDrawerListener(toggle);
        toggle.syncState();

    }

    private void  initNavigationView() {
        currentMenuItem = mDrawerList.getMenu().getItem(0);
        currentMenuItem.setChecked(true);

        mDrawerList.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(MenuItem item) {
                if(currentMenuItem != item)
                {
                    currentMenuItem = item;

                    switch (item.getItemId()) {
                        case R.id.settings:
                            ServerConnectionSettingsFragment serverConnectionSettingsFragment = new ServerConnectionSettingsFragment();
                            changeFragment(serverConnectionSettingsFragment,true);
                            onBackPressed();
                            return true;

                        case R.id.start:
                            MainMenuFragment mainMenuFragment = new MainMenuFragment();
                            changeFragment(mainMenuFragment,true);
                            onBackPressed();
                            return true;

                        default:
                            return true;
                    }
                }
                else {
                    return false;
                }
            }
        });
    }

    @Override
    public void onBackPressed() {
        if(mDrawerLayout.isDrawerOpen(mDrawerList)) {
            mDrawerLayout.closeDrawer(Gravity.LEFT);
            return;
        }
        super.onBackPressed();
    }
}
