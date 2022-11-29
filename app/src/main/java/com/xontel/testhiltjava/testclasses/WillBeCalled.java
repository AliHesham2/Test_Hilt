package com.xontel.testhiltjava.testclasses;

import android.util.Log;


import dagger.hilt.android.AndroidEntryPoint;

@AndroidEntryPoint
public class WillBeCalled {

    public WillBeCalled(River river) {
        Log.i("TAG", "WillBeCalled: "+river);
    }
}
