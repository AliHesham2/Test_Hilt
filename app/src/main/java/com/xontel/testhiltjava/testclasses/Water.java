package com.xontel.testhiltjava.testclasses;

import javax.inject.Inject;

public class Water {

    private int waterScope ;

    @Inject
    public Water(){}

    public int getWaterScope(){
        waterScope = 1;
        return waterScope;
    }

}
