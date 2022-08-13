package com.uas_akb_if7_10119283.Presenter;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

import java.util.List;

// selasa 13 Agustus 2022, 1011983, Rahmatullah Rizki, IF7
public class ListFragmentAdapter extends FragmentStatePagerAdapter {


    private List<Fragment> listfrag;
    public ListFragmentAdapter(@NonNull FragmentManager fm, List<Fragment> listfrag) {
        super(fm, BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT);
        this.listfrag= listfrag;
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        return listfrag.get(position);
    }

    @Override
    public int getCount() {
        return listfrag.size();
    }

}

