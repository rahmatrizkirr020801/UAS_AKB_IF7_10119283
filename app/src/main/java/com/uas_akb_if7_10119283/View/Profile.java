package com.uas_akb_if7_10119283.View;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;

import com.uas_akb_if7_10119283.R;


// selasa 13 Agustus 2022, 1011983, Rahmatullah Rizki, IF7
public class Profile extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        ViewGroup profile = (ViewGroup) inflater.inflate(R.layout.profile, container, false);
        return profile;
    }
}
