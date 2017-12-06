package com.enable.android.interact;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by SAHAJA on 15-09-2017.
 */

public class MainFragment extends Fragment implements View.OnClickListener{


    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_main, container, false);

        FloatingActionButton bt = (FloatingActionButton) getView().findViewById(R.id.bluetooth);
        FloatingActionButton cam = (FloatingActionButton) getView().findViewById(R.id.camera);
        FloatingActionButton write = (FloatingActionButton) getView().findViewById(R.id.write);
        FloatingActionButton voice = (FloatingActionButton) getView().findViewById(R.id.voice);


        bt.setOnClickListener(this);
        cam.setOnClickListener(this);
        write.setOnClickListener(this);
        voice.setOnClickListener(this);

        return view;
    }
    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.bluetooth:
                Fragment b = new Bluetooth();
                moveToFragment(b);
                break;
            case R.id.camera:
                Fragment c = new Camera();
                moveToFragment(c);
                break;
            case R.id.write:
                Fragment w= new WriteText();
                moveToFragment(w);
                break;
            case R.id.voice:
                Fragment vo= new Voice();
                moveToFragment(vo);
                break;

        }
    }

    private void moveToFragment(Fragment fragment) {

        getFragmentManager().beginTransaction().replace(R.id.fragment_frame, fragment, fragment.getClass().getSimpleName()).addToBackStack(null).commit();

    }
}