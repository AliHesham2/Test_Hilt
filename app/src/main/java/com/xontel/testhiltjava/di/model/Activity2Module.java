package com.xontel.testhiltjava.di.model;

import android.content.Context;

import com.xontel.testhiltjava.testclasses.Chicken;

import dagger.Module;
import dagger.Provides;
import dagger.hilt.InstallIn;
import dagger.hilt.android.components.ActivityComponent;
import dagger.hilt.android.qualifiers.ActivityContext;
import dagger.hilt.android.scopes.ActivityRetainedScoped;
import dagger.hilt.android.scopes.ActivityScoped;


@Module
@InstallIn(ActivityComponent.class)
public class Activity2Module {

    @ActivityScoped
    @Provides
    public static Chicken provideChickenInstance(@ActivityContext Context context){return  new Chicken(context);}

}
