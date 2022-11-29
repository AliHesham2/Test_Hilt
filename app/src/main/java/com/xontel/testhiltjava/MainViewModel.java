package com.xontel.testhiltjava;

import android.app.Application;
import android.util.Log;
import androidx.lifecycle.AndroidViewModel;

import com.xontel.testhiltjava.data.room.AppDatabase;
import com.xontel.testhiltjava.testclasses.Buffalo;
import com.xontel.testhiltjava.testclasses.River;
import com.xontel.testhiltjava.testclasses.Water;
import javax.inject.Inject;
import dagger.hilt.android.lifecycle.HiltViewModel;


@HiltViewModel
public class MainViewModel extends AndroidViewModel {
    @Inject
    public MainViewModel(Application app, River river, Water water, Buffalo buffalo, AppDatabase appDatabase) {
        super(app);
       // Log.i("TAG", "Context: "+app.getApplicationContext());
      //  Log.i("TAG", "River: "+river);
      //  Log.i("TAG", "Water: "+water);
      //  Log.i("TAG", "Buffalo: "+buffalo);
      //  Log.i("TAG", "db: "+appDatabase);
    }
}
