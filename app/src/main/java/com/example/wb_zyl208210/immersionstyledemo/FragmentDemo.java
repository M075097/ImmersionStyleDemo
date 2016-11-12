package com.example.wb_zyl208210.immersionstyledemo;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

/**
 * Created by wb-zyl208210 on 2016/10/27.
 */
public class FragmentDemo extends Fragment {

    private View mView;
    private LinearLayout mPullableArea;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        //false和true区别
        mView = inflater.inflate(R.layout.fragment_view, container, false);
        mPullableArea = (LinearLayout) mView.findViewById(R.id.pullablearea);
        return mView;
    }

    public static FragmentDemo newInstance(String name, String id) {
        Bundle args = new Bundle();
        args.putString("name", name);
        args.putString("id", id);
        FragmentDemo fragment = new FragmentDemo();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        String idStr = getArguments().getString("id");
        //        String idStr = savedInstanceState.getString("id");
        int id = Integer.parseInt(idStr);
        switch (id) {
            case 10000001:
                mPullableArea.setBackgroundResource(R.drawable.bg1);
                break;
            case 10000002:
                mPullableArea.setBackgroundResource(R.drawable.bg2);
                break;
            case 10000003:
                mPullableArea.setBackgroundResource(R.drawable.bg3);
                break;
            case 10000004:
                mPullableArea.setBackgroundResource(R.drawable.bg4);
                break;
            default:
                break;
        }
    }
}
