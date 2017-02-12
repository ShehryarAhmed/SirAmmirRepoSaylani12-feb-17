package com.saylani.databindingsample;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.widget.Button;

import com.saylani.databindingsample.databinding.MyActivityBinding;

public class MainActivity extends AppCompatActivity {

    private MyActivityBinding binding;

    String[] data = {"Item 1","Item 2","Item 3","Item 4","Item 5","Item 6"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this,R.layout.activity_main);

        binding.myRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        binding.myRecyclerView.setAdapter(new MyRecycleAdapter(this, data));
    }

}
