package com.me.noban.hiproject.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.me.noban.hiproject.R;

public class EmergencyFragment extends Fragment {

    public EmergencyFragment() {}

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(com.me.noban.hiproject.R.layout.fragment_emergency, container, false);
        return view;
    }

}
