package ex14.stories2.com.ex14.FragmentPackage;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by stories2 on 2016. 11. 28..
 */

public class SectionsPagerAdapter extends FragmentPagerAdapter {

    PlaceholderFragment placeholderFragment;

    public SectionsPagerAdapter(FragmentManager fm, PlaceholderFragment placeholderFragment) {
        super(fm);
        this.placeholderFragment = placeholderFragment;
    }

    @Override
    public Fragment getItem(int position) {
        // getItem is called to instantiate the fragment for the given page.
        // Return a PlaceholderFragment (defined as a static inner class below).
        return placeholderFragment.newInstance(position + 1);
    }

    @Override
    public int getCount() {
        // Show 3 total pages.
        return 2;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        switch (position) {
            case 0:
                return "Stamp";
            case 1:
                return "Notice";
            case 2:
                return "SECTION 3";
        }
        return null;
    }
}