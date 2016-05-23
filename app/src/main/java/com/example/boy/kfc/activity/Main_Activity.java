package com.example.boy.kfc.activity;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager;

import com.example.boy.kfc.R;
import com.example.boy.kfc.adapter.MyFragmentPagerAdapter;

import java.util.List;

public class Main_Activity extends FragmentActivity{

    private List<Fragment> fragList;
    private ViewPager pager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_viewpager);
        pager=(ViewPager) findViewById(R.id.main_viewpager);

        MyFragmentPagerAdapter adapter=new MyFragmentPagerAdapter(getSupportFragmentManager(),fragList);
        pager.setAdapter(adapter);
    }

}
