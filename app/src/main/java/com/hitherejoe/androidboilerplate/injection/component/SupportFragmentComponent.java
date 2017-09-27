package com.hitherejoe.androidboilerplate.injection.component;

import com.hitherejoe.androidboilerplate.injection.PerFragment;
import com.hitherejoe.androidboilerplate.injection.module.SupportFragmentModule;
import com.hitherejoe.androidboilerplate.ui.fragment.DetailFragment;

import dagger.Component;

@PerFragment
@Component(dependencies = ActivityComponent.class, modules = SupportFragmentModule.class)
public interface SupportFragmentComponent {

    void inject(DetailFragment detailFragment);

}
