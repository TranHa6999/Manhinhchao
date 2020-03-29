package com.poly.admin.manhinhchao.Activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.material.tabs.TabLayout;
import com.poly.admin.manhinhchao.Adapter.ViewPagerAdapter;
import com.poly.admin.manhinhchao.Fragment.FragmentRau1;
import com.poly.admin.manhinhchao.Fragment.FragmentRau2;
import com.poly.admin.manhinhchao.Fragment.FragmentRau3;
import com.poly.admin.manhinhchao.Fragment.FragmentRau4;
import com.poly.admin.manhinhchao.R;

public class MainActivity extends AppCompatActivity {
    Button btnRau,btnThit;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnRau = (Button) findViewById(R.id.btnRau);
        Button btnThit = (Button) findViewById(R.id.btnThit);






        btnRau.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myFancyMethod(v);
            }

            private void myFancyMethod(View v) {
                Intent  intent = new Intent(MainActivity.this,Rau.class);
                startActivity(intent);
            }
        });

        btnThit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myFancyMethod(v);
            }

            private void myFancyMethod(View v) {
                Intent  intent = new Intent(MainActivity.this,Thit.class);
                startActivity(intent);
            }
        });



    }
}
