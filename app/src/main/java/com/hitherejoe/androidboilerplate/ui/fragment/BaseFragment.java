package com.hitherejoe.androidboilerplate.ui.fragment;

import android.support.v4.app.Fragment;

import com.hitherejoe.androidboilerplate.injection.component.DaggerSupportFragmentComponent;
import com.hitherejoe.androidboilerplate.injection.component.SupportFragmentComponent;
import com.hitherejoe.androidboilerplate.injection.module.SupportFragmentModule;
import com.hitherejoe.androidboilerplate.ui.activity.BaseActivity;
import com.hitherejoe.androidboilerplate.util.NetworkUtil;

public class BaseFragment extends Fragment {

    private SupportFragmentComponent supportFragmentComponent;

    public SupportFragmentComponent supportFragmentComponent() {
        if (supportFragmentComponent == null) {
            supportFragmentComponent = DaggerSupportFragmentComponent.builder()
                    .supportFragmentModule(new SupportFragmentModule(this, new NetworkUtil()))
                    .activityComponent(((BaseActivity) getActivity()).activityComponent())
                    .build();
        }
        return supportFragmentComponent;
    }

}
