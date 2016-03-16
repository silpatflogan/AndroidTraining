package com.example.paty.myapplication;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.paty.myapplication.R;

/**
 * Created by Paty on 08/03/2016.
 */
public class StaticFragment extends Fragment {
    TextView tv = null;
    public StaticFragment(){

    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.static_fragment_layout, container, false);
        tv = (TextView)rootView.findViewById(R.id.textView);
        tv.setText("Hello Settings");
        return rootView;
    }
}
