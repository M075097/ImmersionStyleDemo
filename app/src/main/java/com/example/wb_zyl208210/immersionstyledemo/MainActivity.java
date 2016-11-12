package com.example.wb_zyl208210.immersionstyledemo;

import android.os.Build;
import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.WindowManager;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private ViewPager mViewPager;
    private FragmentManager mSupportFragmentManager;
    private List<String> mFragmentList;
    private MyViewPagerAdapter mMyViewPagerAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        initEvent();

    }

    private void initView() {
        if (Build.VERSION.SDK_INT > Build.VERSION_CODES.KITKAT) {//KITKAT 之后持透明状态栏
            getWindow().addFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);//透明状态栏
            getWindow().addFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_NAVIGATION);//透明导航栏
        }
        mViewPager = (ViewPager) findViewById(R.id.immersiondemo_viewpager);
    }

    private void initEvent() {
        mFragmentList = new ArrayList<>();
        mFragmentList.add("10000001");
        mFragmentList.add("10000002");
        mFragmentList.add("10000003");
        mFragmentList.add("10000004");
        mSupportFragmentManager = getSupportFragmentManager();
        mMyViewPagerAdapter = new MyViewPagerAdapter(mSupportFragmentManager, mFragmentList);
        mViewPager.setAdapter(mMyViewPagerAdapter);
    }

}
