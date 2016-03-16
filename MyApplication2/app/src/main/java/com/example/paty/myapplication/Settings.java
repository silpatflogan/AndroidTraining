package com.example.paty.myapplication;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

public class Settings extends AppCompatActivity implements MyFragment.OnFragmentInteractionListener {
    MyFragment myFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        initUI();

    }

    private void initUI() {
        setContentView(R.layout.activity_settings);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        FragmentManager fg = getFragmentManager();
        FragmentTransaction txn = fg.beginTransaction();
        myFragment = MyFragment.getInstance(R.color.maroon, "Maroon 5");
        txn.replace(R.id.fragmentToRemove, myFragment);
        txn.commit();
    }

    public void onFragmentInteraction(String sub){
        Toolbar toolBar = (Toolbar) findViewById(R.id.toolbar);
        toolBar.setSubtitle(sub);
    }
}
