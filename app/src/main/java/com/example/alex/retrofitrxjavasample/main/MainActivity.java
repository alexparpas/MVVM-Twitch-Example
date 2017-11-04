package com.example.alex.retrofitrxjavasample.main;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.example.alex.retrofitrxjavasample.R;
import com.example.alex.retrofitrxjavasample.databinding.MainActivityBinding;


public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";
    private MainActivityBinding mBinding;
    private MainViewModel mMainViewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        mBinding = DataBindingUtil.setContentView(this, R.layout.main_activity);
        mMainViewModel = new MainViewModel(this);
        mBinding.setMainViewModel(mMainViewModel);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        mMainViewModel.destroy();
    }
}