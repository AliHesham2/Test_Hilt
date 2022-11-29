package com.xontel.testhiltjava.testclasses;

import android.util.Log;

import javax.inject.Inject;

import dagger.hilt.android.AndroidEntryPoint;

 //@AndroidEntryPoint cant add it.
public class WillBeChecked {
    @Inject River river ;

    public WillBeChecked() {
        Log.i("TAG", "WillBeChecked: "+river);
    }
}
