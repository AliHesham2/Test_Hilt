package com.xontel.testhiltjava.testclasses;

import android.content.Context;
import android.util.Log;
import dagger.hilt.android.qualifiers.ActivityContext;


public class Chicken {
    public Chicken(@ActivityContext Context context) {
        Log.i("TAG", "ChickenConstructor: "+context);
    }
}
