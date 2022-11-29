package com.xontel.testhiltjava;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.ViewModelProvider;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.xontel.testhiltjava.databinding.ActivityMainBinding;
import com.xontel.testhiltjava.testclasses.Buffalo;
import com.xontel.testhiltjava.testclasses.Chicken;
import com.xontel.testhiltjava.testclasses.Meat;
import com.xontel.testhiltjava.testclasses.River;
import com.xontel.testhiltjava.testclasses.WillBeCalled;

import javax.inject.Inject;

import dagger.hilt.android.AndroidEntryPoint;

@AndroidEntryPoint
public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding;
    private MainViewModel viewModel;
    @Inject
    River river;
    @Inject
    Buffalo buffalo;

    // even if its constructor require application context but no error
    @Inject
    Meat meat;

    //Injected from activity so pass this activity to there only if u use it with inject on constructor
    // or Injected in activity module scope with
    @Inject
    Chicken chicken;

    @Inject
    WillBeCalled willBeCalled;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this,R.layout.activity_main);
        Log.i("TAG", "WILL BE CALLED"+willBeCalled);
        //Log.i("TAG", "RiverInstance: "+river);
        //Log.i("TAG", "BuffaloInstance: "+buffalo);
       // Log.i("TAG", "ChickenInstance: "+chicken);
      //  Log.i("TAG", "MeatInstance: "+meat);
        buffalo.getFreshMeat();
        viewModel = new ViewModelProvider(this).get(MainViewModel.class);
        binding.b1.setOnClickListener(view -> startActivity(new Intent(MainActivity.this,MainActivity2.class)));
    }

}