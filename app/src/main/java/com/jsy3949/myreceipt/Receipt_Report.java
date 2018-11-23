package com.jsy3949.myreceipt;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

public class Receipt_Report extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.receipt_report, container,false);

        getFragmentManager().beginTransaction().replace(R.id.main_framelayout,new Receipt_Receiptext1()).commit();

        final ImageView imageView1 = (ImageView) view.findViewById(R.id.color_btn1);
        final ImageView imageView2 = (ImageView) view.findViewById(R.id.color_btn2);
        final ImageView imageView3 = (ImageView) view.findViewById(R.id.color_btn3);
        final ImageView imageView4 = (ImageView) view.findViewById(R.id.color_btn4);

        imageView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getFragmentManager().beginTransaction().replace(R.id.main_framelayout,new Receipt_Receiptext1()).commit();
                imageView1.setImageResource(R.drawable.ic_clickball_on);
                imageView2.setImageResource(R.drawable.ic_clickball_off);
                imageView3.setImageResource(R.drawable.ic_clickball_off);
                imageView4.setImageResource(R.drawable.ic_clickball_off);
            }
        });

        imageView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getFragmentManager().beginTransaction().replace(R.id.main_framelayout,new Receipt_Receiptext2()).commit();
                imageView1.setImageResource(R.drawable.ic_clickball_off);
                imageView2.setImageResource(R.drawable.ic_clickball_on);
                imageView3.setImageResource(R.drawable.ic_clickball_off);
                imageView4.setImageResource(R.drawable.ic_clickball_off);
            }
        });
        imageView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getFragmentManager().beginTransaction().replace(R.id.main_framelayout,new Receipt_Receiptext3()).commit();
                imageView1.setImageResource(R.drawable.ic_clickball_off);
                imageView2.setImageResource(R.drawable.ic_clickball_off);
                imageView3.setImageResource(R.drawable.ic_clickball_on);
                imageView4.setImageResource(R.drawable.ic_clickball_off);
            }
        });
        imageView4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getFragmentManager().beginTransaction().replace(R.id.main_framelayout,new Receipt_Receiptext4()).commit();
                imageView1.setImageResource(R.drawable.ic_clickball_off);
                imageView2.setImageResource(R.drawable.ic_clickball_off);
                imageView3.setImageResource(R.drawable.ic_clickball_off);
                imageView4.setImageResource(R.drawable.ic_clickball_on);
            }
        });

        return view;
    }
}
