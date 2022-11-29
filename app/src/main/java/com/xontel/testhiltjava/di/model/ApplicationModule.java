package com.xontel.testhiltjava.di.model;

import android.content.Context;
import android.util.Log;

import androidx.lifecycle.ViewModelProvider;

import com.xontel.testhiltjava.ViewModelProviderFactory;
import com.xontel.testhiltjava.data.room.AppDatabase;
import com.xontel.testhiltjava.testclasses.Chicken;
import com.xontel.testhiltjava.testclasses.River;

import javax.inject.Singleton;

import dagger.Binds;
import dagger.Module;
import dagger.Provides;
import dagger.hilt.InstallIn;
import dagger.hilt.android.qualifiers.ActivityContext;
import dagger.hilt.android.qualifiers.ApplicationContext;
import dagger.hilt.android.scopes.ActivityScoped;
import dagger.hilt.components.SingletonComponent;
import hilt_aggregated_deps._dagger_hilt_android_flags_FragmentGetContextFix_FragmentGetContextFixEntryPoint;

@Module
@InstallIn(SingletonComponent.class)
public abstract class ApplicationModule {

    @Singleton
    @Binds
    public abstract ViewModelProvider.Factory bindViewModelFactory(ViewModelProviderFactory modelProviderFactory);

    @Singleton
    @Provides
    public static AppDatabase provideDB(@ApplicationContext Context context){
        return  AppDatabase.getDatabaseInstance(context);}

    @Singleton
    @Provides
    public static River provideRiverInstance(){return  new River();}


}
