package com.xontel.testhiltjava.testclasses;

import android.content.Context;
import android.util.Log;

import javax.inject.Inject;

import dagger.hilt.android.qualifiers.ApplicationContext;

public class Meat implements Buffalo{
    private int meatKG;

    @Inject
    public Meat(@ApplicationContext Context context){
        Log.i("TAG", "MeatConstructor: "+context);
    }

    @Override
    public void getFreshMeat() {
        //Log.i("TAG", "getFreshMeatCalled: ");
    }
}
