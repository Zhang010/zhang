package bwie.com.newsinfo.util;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.List;

import bwie.com.newsinfo.fragment.Fragment1;

/**
 * Created by 13435 on 2017/9/13.
 */

public class UtilFragment extends FragmentPagerAdapter{

    List<String> titleList;
    List<Fragment> listFragment;

    public UtilFragment(FragmentManager fm, List<String> titleList, List<Fragment> listFragment) {
        super(fm);
        this.titleList = titleList;
        this.listFragment = listFragment;
    }

    @Override
    public Fragment getItem(int position) {

        return listFragment.get(position);
    }

    @Override
    public int getCount() {
        return titleList.size();
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return titleList.get(position);
    }
}
