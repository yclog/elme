package com.example.boy.kfc.activity;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.View;
import com.example.boy.kfc.R;

public class Home_Activity extends FragmentActivity implements View.OnClickListener{


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        init();
        setListener();
    }

    void init(){

    }

    void setListener(){

    }

    @Override
    public void onClick(View v) {

    }
}
