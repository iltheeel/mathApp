package com.example.liaiwei.mathdraft;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ending1 extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ending1);

    }


    public void reset(View v) {
        Intent intent = new Intent(this, OpenPage.class);
        startActivity(intent);
    }


}
