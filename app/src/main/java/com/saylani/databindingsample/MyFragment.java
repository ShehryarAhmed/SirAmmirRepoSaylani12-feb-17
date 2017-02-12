package com.saylani.databindingsample;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.saylani.databindingsample.databinding.MyFragBinding;

/**
 * Created by MT-2016 on 29-Jan-17.
 */
public class MyFragment extends Fragment {

    private MyFragBinding binding;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        binding = DataBindingUtil.inflate(inflater,R.layout.my_frag, container, false);

        binding.myTextViewOnFragment.setText("");
        return binding.getRoot();
    }
}
