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

public class Rau extends AppCompatActivity {
    ViewPager viewPager;
    Button btnback1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rau);



        viewPager = findViewById(R.id.viewPager);
        addTabs(viewPager);
        ((TabLayout)findViewById(R.id.tabLayout)).setupWithViewPager(viewPager);

        Button btnback1 = (Button) findViewById(R.id.btnback1);
        btnback1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myFancyMethod(v);
            }

            private void myFancyMethod(View v) {
                Intent  intent = new Intent(Rau.this,MainActivity.class);
                startActivity(intent);
            }
        });

    }




    public void addTabs (ViewPager viewPager){

        ViewPagerAdapter adapter = new ViewPagerAdapter(getSupportFragmentManager());
        adapter.add(new FragmentRau1(),"RAU 1");
        adapter.add(new FragmentRau2(),"RAU 2");
        adapter.add(new FragmentRau3(),"RAU 3");
        adapter.add(new FragmentRau4(),"RAU 4");
        viewPager.setAdapter(adapter);

    }
}
