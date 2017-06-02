package com.example.liaiwei.mathdraft;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class OpenPage extends AppCompatActivity {
    private Button buttonmcbuttony;
    private String datastr;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_open_page);

        datastr = "hi";

        buttonmcbuttony = (Button) findViewById(R.id.enter);
        buttonmcbuttony.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                launchActivity();
            }
        });
    }


    private void launchActivity() {
        Intent intent = new Intent(this, page1.class);
        intent.putExtra("datastr", datastr);
        startActivity(intent);
    }

}
