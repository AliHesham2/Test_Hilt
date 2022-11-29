package com.xontel.testhiltjava;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.ViewModelProvider;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

import com.xontel.testhiltjava.databinding.ActivityMain2Binding;
import com.xontel.testhiltjava.testclasses.Buffalo;
import com.xontel.testhiltjava.testclasses.Chicken;
import com.xontel.testhiltjava.testclasses.River;

import javax.inject.Inject;

import dagger.hilt.android.AndroidEntryPoint;

@AndroidEntryPoint
public class MainActivity2 extends AppCompatActivity {
    private ActivityMain2Binding binding;
    private MainViewModel viewModel;
    @Inject
    River river;
    @Inject
    Buffalo buffalo;
    @Inject
    Chicken chicken;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this,R.layout.activity_main2);
       // Log.i("TAG", "RiverInstance2: "+river);
       // Log.i("TAG", "BuffaloInstance2: "+buffalo);
        Log.i("TAG", "ChickenInstance2: "+chicken);
        binding.b1.setOnClickListener(view -> startActivity(new Intent(MainActivity2.this,MainActivity.class)));
        viewModel = new ViewModelProvider(this).get(MainViewModel.class);
    }
    public void callMainActivity(){
        Log.i("TAG", "callMainActivity2: ");
    }
}