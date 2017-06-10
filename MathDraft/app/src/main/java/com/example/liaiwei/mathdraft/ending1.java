package com.example.liaiwei.mathdraft;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;


public class ending1 extends AppCompatActivity {
    private ArrayAdapter<String> adapter;
    private String datastr;
    private ListView mainListView ;
    private ArrayAdapter<String> listAdapter ;
    final String[] questionItems = {
            "problem", "another problem"
    };


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listvtest);

    }


    public void reset(View v) {
        Intent intent = new Intent(this, listvtest.class);
        startActivity(intent);
    }
    public void viewSolution(String problem)  {
        ImageView image = new ImageView(this);
        image.setImageResource(R.drawable.gerstinderp);

        DialogInterface.OnClickListener dialogClickListener = new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                switch (which){

                    case DialogInterface.BUTTON_NEGATIVE:
                        //No button clicked
                        break;
                }
            }
        };

        AlertDialog.Builder builder =
                new AlertDialog.Builder(this).
                        setMessage(problem + " solution").
                        setView(image);

        builder.setCancelable(true);
        builder.setNegativeButton("Ok",dialogClickListener);

        builder.create().show();
    }
}
