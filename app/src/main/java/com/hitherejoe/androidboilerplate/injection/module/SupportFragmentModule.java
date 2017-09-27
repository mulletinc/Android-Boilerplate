package com.hitherejoe.androidboilerplate.injection.module;

import android.content.Context;
import android.support.v4.app.Fragment;

import com.hitherejoe.androidboilerplate.injection.ActivityContext;
import com.hitherejoe.androidboilerplate.util.NetworkUtil;

import dagger.Module;
import dagger.Provides;

@Module
public class SupportFragmentModule {

    private Fragment fragment;
    private NetworkUtil networkUtil;

    public SupportFragmentModule(Fragment fragment, NetworkUtil networkUtil) {
        this.fragment = fragment;
        this.networkUtil = networkUtil;
    }

    @Provides
    Fragment provideFragment() {
        return fragment;
    }

    @Provides
    @ActivityContext
    Context providesContext() {
        return fragment.getContext();
    }

    @Provides
    NetworkUtil provideNetworkUtil() {
        return networkUtil;
    }

}
