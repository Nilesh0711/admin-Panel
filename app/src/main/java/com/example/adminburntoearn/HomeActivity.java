package com.example.adminburntoearn;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.example.adminburntoearn.Adapter.ViewPagerAdapter;
import com.example.adminburntoearn.HomeFragment.ActiveFragment;
import com.example.adminburntoearn.HomeFragment.AlluserFragment;
import com.example.adminburntoearn.HomeFragment.InactiveFragment;
import com.example.adminburntoearn.HomeFragment.WithdrawFragment;
import com.google.android.material.tabs.TabLayout;

public class HomeActivity extends AppCompatActivity {

    TabLayout tabLayout;
    ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        tabLayout = findViewById(R.id.idTLHome);
        viewPager = findViewById(R.id.idVPHome);

        tabLayout.setupWithViewPager(viewPager);

        ViewPagerAdapter viewPagerAdapter = new ViewPagerAdapter(getSupportFragmentManager(), FragmentPagerAdapter.BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT);
        viewPagerAdapter.addFragment(new AlluserFragment(), "All");
        viewPagerAdapter.addFragment(new ActiveFragment(), "Active");
        viewPagerAdapter.addFragment(new InactiveFragment(), "Inactive");
        viewPagerAdapter.addFragment(new WithdrawFragment(), "Withdraw");
        viewPager.setAdapter(viewPagerAdapter);

    }

}