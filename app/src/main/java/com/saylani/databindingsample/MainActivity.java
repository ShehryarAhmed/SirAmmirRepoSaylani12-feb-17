package com.saylani.databindingsample;

import android.databinding.DataBindingUtil;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.saylani.databindingsample.databinding.MyActivityBinding;

public class MainActivity extends AppCompatActivity {

    private MyActivityBinding binding;

    String[] data = {"Item 1","Item 2","Item 3","Item 4","Item 5","Item 6"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this,R.layout.activity_main);


        setSupportActionBar(binding.toolbar);


        binding.simpleToast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this,"Simple Toast",Toast.LENGTH_SHORT).show();
            }
        });

        binding.materialToast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(binding.materialToast.getRootView(),"Deleted Successfully",Snackbar.LENGTH_SHORT)
                        .setAction("UNDO", new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                Toast.makeText(MainActivity.this,"Restored",Toast.LENGTH_SHORT).show();
                            }
                        })
                        .show();
            }
        });

        binding.myRecyclerView.setLayoutManager(new GridLayoutManager(this,2));
        binding.myRecyclerView.setAdapter(new MyRecycleAdapter(this, data));
    }



}
