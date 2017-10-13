package com.example.minhaj.intentpractice;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClick(View view)
    {
        Intent i = new Intent(this,OtherActivity.class);    //This is how it swtiches between pages as we have tell it to go to otherAcitivty class and we
                                                            //its intance i to start the activty and View to show up the activty
        startActivity(i);
    }
}
