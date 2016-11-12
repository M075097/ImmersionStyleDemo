package com.example.wb_zyl208210.immersionstyledemo;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.List;

/**
 * Created by wb-zyl208210 on 2016/10/27.
 */
public class MyViewPagerAdapter extends FragmentPagerAdapter {

    private List<String> fragmentIDList;

    public MyViewPagerAdapter(FragmentManager fm, List<String> fragmentIDList) {
        super(fm);
        this.fragmentIDList = fragmentIDList;
    }

    @Override
    public int getCount() {
        return fragmentIDList == null ? 0 : fragmentIDList.size();
    }

    @Override
    public Fragment getItem(int position) {
        return fragmentIDList == null ? null : FragmentDemo.newInstance(fragmentIDList.get(position),fragmentIDList.get(position));
    }
}
