package com.example.itsoftware.accountbookmanagementsystem.Fragment;

import android.content.Intent;
import android.os.Bundle;

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.itsoftware.accountbookmanagementsystem.Activity.ProfileActivity;
import com.example.itsoftware.accountbookmanagementsystem.R;

/**
 * Created by ITSoftware on 3/23/2019.
 */

public class DetailFragment extends Fragment {

    DrawerLayout drawerLayout;
    AppCompatActivity activity = null;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        activity = (AppCompatActivity) getActivity();
        View view = inflater.inflate(R.layout.fragment_detail, container, false);

        //set toolbar
        Toolbar toolbar = view.findViewById(R.id.toolbar);
        activity.setSupportActionBar(toolbar);

        //set menu
        drawerLayout = view.findViewById(R.id.drawer_layout);

        //look for menu
        view.findViewById(R.id.iv_menu).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                drawerLayout.openDrawer(GravityCompat.START);
            }
        });

        //button click
        view.findViewById(R.id.iv_picture).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                profile();
            }
        });
        view.findViewById(R.id.tv_name).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                profile();
            }
        });


        return view;
    }

    private void profile() {
        Intent intent = new Intent(activity, ProfileActivity.class);
        activity.startActivity(intent);
    }
}
