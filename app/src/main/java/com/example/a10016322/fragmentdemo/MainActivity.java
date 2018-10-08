package com.example.a10016322.fragmentdemo;

import android.support.v4.app.FragmentManager; //REMEMBER SUPPORT V4 - this makes it able to run on all APIs
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button replace;
    FragmentManager fragmentManager;
    FragmentTransaction fragmentTransaction;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        replace = (Button)(findViewById(R.id.replace_id));
        fragmentManager = getSupportFragmentManager();
        fragmentTransaction = fragmentManager.beginTransaction(); //you have to begin transaction and commit it
        final TopFragment top = new TopFragment();
        fragmentTransaction.add(R.id.layout_top, top); //adds fragment to xml file where ever you want. if there is an error, look for support.v4 in imports
        final BottomFragment bottom = new BottomFragment();
        fragmentTransaction.add(R.id.layout_bottom, bottom);
        fragmentTransaction.commit();

        replace.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                BottomFragment bottom2 = new BottomFragment();
                fragmentTransaction = fragmentManager.beginTransaction();
                replace.setText("Replaced");
                fragmentTransaction.replace(R.id.layout_top, bottom2);
                fragmentTransaction.commit();
            }
        });

    }
}
