package com.rahmatullahrizki.uas_akb_10119283.View;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.rahmatullahrizki.uas_akb_10119283.R;

// selasa 7 juni 2022, 1011983, Rahmatullah Rizki, IF7
public class PageFragment2 extends Fragment {
    ViewGroup viewGroup;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        viewGroup = (ViewGroup) inflater.inflate(R.layout.page_dua, container, false);
        return viewGroup;
    }
}
