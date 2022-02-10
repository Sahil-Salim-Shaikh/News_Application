package com.example.newsapp;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class PagerAdapter extends FragmentPagerAdapter {

int tabcount;

    public PagerAdapter(@NonNull FragmentManager fm, int behavior) {
        super(fm, behavior);
        tabcount =behavior;
    }


    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position)
        {
           case  0:
               return  new HomeFragement();

            case  1:
                return  new SportsFragement();

            case  2:
                return  new HealthFragement();

            case  3:
                return  new scienceFragement();

            case  4:
                return  new EntertainmentFragement();

            case  5:
                return  new TechnologyFragement();

            default:
                return null;



        }
    }

    @Override
    public int getCount() {
        return tabcount;
    }
}
