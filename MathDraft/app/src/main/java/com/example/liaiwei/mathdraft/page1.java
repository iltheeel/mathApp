package com.example.liaiwei.mathdraft;

/*
*
*    THIS CODE IS FOR SHOW
*    DO NOT EDIT ANYTHING PLEASE
*
* */


import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class page1 extends AppCompatActivity {

    private Button goToNext;
    private boolean gotanswer = false;
    private String datastr;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page1);
        datastr = getIntent().getStringExtra("datastr");
        Log.d("page1", datastr);

        goToNext = (Button) findViewById(R.id.NEXTPAGE);
        goToNext.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                if(!gotanswer) {
                    Toast.makeText(getApplicationContext(), "Please choose an answer first", Toast.LENGTH_SHORT).show();
                } else {
                    launchActivity();
                }
            }
        });

    }

    public void pickc(View v) {
        gotanswer = true;
        datastr = datastr+ "1";
        Toast.makeText(getApplicationContext(), "right answer", Toast.LENGTH_SHORT).show();
    }
    public void pick(View v) {
        gotanswer = true;
        datastr = datastr+ "0";
        Toast.makeText(getApplicationContext(), "wrong answer", Toast.LENGTH_SHORT).show();
    }
    private void launchActivity() {
        Intent intent = new Intent(this, ending1.class);
        intent.putExtra("datastr", datastr);
        startActivity(intent);
    }


}
