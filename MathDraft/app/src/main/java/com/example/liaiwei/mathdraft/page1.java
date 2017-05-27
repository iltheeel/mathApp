package com.example.liaiwei.mathdraft;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class page1 extends AppCompatActivity {

    private Button gobackHome;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page1);

        gobackHome = (Button) findViewById(R.id.goHome);
        gobackHome.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                launchActivity();
            }
        });


    }
    private void launchActivity() {
        Intent intent = new Intent(this, OpenPage.class);
        startActivity(intent);
    }


}
