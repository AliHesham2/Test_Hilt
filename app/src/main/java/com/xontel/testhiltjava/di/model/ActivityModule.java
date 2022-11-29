package com.xontel.testhiltjava.di.model;

import android.content.Context;

import com.xontel.testhiltjava.testclasses.Buffalo;
import com.xontel.testhiltjava.testclasses.Chicken;
import com.xontel.testhiltjava.testclasses.Meat;
import com.xontel.testhiltjava.testclasses.River;

import javax.inject.Singleton;

import dagger.Binds;
import dagger.Module;
import dagger.Provides;
import dagger.hilt.InstallIn;
import dagger.hilt.android.components.ActivityComponent;
import dagger.hilt.android.components.ActivityRetainedComponent;
import dagger.hilt.android.qualifiers.ActivityContext;
import dagger.hilt.android.scopes.ActivityRetainedScoped;
import dagger.hilt.android.scopes.ActivityScoped;
import dagger.hilt.components.SingletonComponent;

@Module
@InstallIn(ActivityRetainedComponent.class)
public abstract class ActivityModule {
    // @Binds for interface instance .. @provide for android class instance

    @ActivityRetainedScoped
    @Binds
    public abstract Buffalo bindBuffalo(Meat meat);

}
