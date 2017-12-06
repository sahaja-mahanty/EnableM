package com.enable.android.interact;

import android.content.Intent;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import static com.enable.android.interact.R.id.write;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_main);

        /*Fragment fragment = new MainFragment();
        getFragmentManager().beginTransaction()
                .replace(R.id.fragment_frame,fragment, fragment.getClass().getSimpleName()).addToBackStack(null).commit();*/


        /*FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager
                .beginTransaction();
        MainFragment fragment = new MainFragment();
        fragmentTransaction.replace(R.id.fragment_frame,fragment);
        fragmentTransaction.commit();*/


        FloatingActionButton bt = (FloatingActionButton) findViewById(R.id.bluetooth);
        FloatingActionButton cam = (FloatingActionButton) findViewById(R.id.camera);
        FloatingActionButton write = (FloatingActionButton) findViewById(R.id.write);
        FloatingActionButton voice = (FloatingActionButton) findViewById(R.id.voice);


        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(MainActivity.this,Bluetooth1.class) ;
                startActivity(i);
            }
        });

        cam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(MainActivity.this,Camera1.class) ;
                startActivity(i);
            }
        });

        write.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(MainActivity.this,WriteText1.class) ;
                startActivity(i);
            }
        });

        voice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(MainActivity.this,Voice1.class) ;
                startActivity(i);
            }
        });

    }

   /* @Override
    public void onBackPressed() {
        if (getFragmentManager().getBackStackEntryCount() > 1) {
            getFragmentManager().popBackStack();
        } else {
            super.onBackPressed();
        }
    }*/


}




