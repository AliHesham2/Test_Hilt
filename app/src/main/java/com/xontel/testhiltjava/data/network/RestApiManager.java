package com.xontel.testhiltjava.data.network;

import javax.inject.Inject;
import javax.inject.Singleton;

@Singleton
public class RestApiManager implements RestApiHelper {
    NetworkService mService;

    @Inject
    public RestApiManager(NetworkService apiService) {
        mService = apiService;
    }


}
