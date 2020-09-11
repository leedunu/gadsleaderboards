package com.example.gadsboard;
import android.content.Context;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class FragmentAdapter extends FragmentPagerAdapter {

    Context context;
    int totalTabs;

    public FragmentAdapter(Context c, FragmentManager fm, int totalTabs) {
        super(fm);
        context = c;
        this.totalTabs = totalTabs;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                TopLearners topLearners = new TopLearners();
                return topLearners;
            case 1:
                TopIqs topIqs = new TopIqs();
                return topIqs;

            default:
                return null;
        }
    }
    @Override
    public CharSequence getPageTitle(int position) {
        String title = "";
        if (position == 0)
        {
            title = "Top learners";
        }
        else if (position == 1) {
            title = "Top skill iq";
        }
        return title;
    }

    @Override
    public int getCount() {
        return totalTabs;
    }
}
