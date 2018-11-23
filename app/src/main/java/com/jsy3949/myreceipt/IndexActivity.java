package com.jsy3949.myreceipt;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class IndexActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_index);

        getFragmentManager().beginTransaction().replace(R.id.main_frame,new Receipt_My()).commit();

        LinearLayout btn1 = (LinearLayout) findViewById(R.id.btn1);
        LinearLayout btn2 = (LinearLayout) findViewById(R.id.btn2);
        LinearLayout btn3 = (LinearLayout) findViewById(R.id.btn3);


        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getFragmentManager().beginTransaction().replace(R.id.main_frame,new Receipt_My()).commit();
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getFragmentManager().beginTransaction().replace(R.id.main_frame,new Receipt_Report()).commit();
            }
        });


        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getFragmentManager().beginTransaction().replace(R.id.main_frame,new Receipt_Point()).commit();
            }
        });

    }

}
