package com.example.steivew.databindinghoho;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.steivew.databindinghoho.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityMainBinding hoho = DataBindingUtil.setContentView(this, R.layout.activity_main);
        User user = new User("Stevie", "Wong");
        hoho.setUser(user);
    }
}
