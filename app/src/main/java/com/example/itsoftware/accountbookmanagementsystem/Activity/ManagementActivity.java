package com.example.itsoftware.accountbookmanagementsystem.Activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.itsoftware.accountbookmanagementsystem.Fragment.ChartFragment;
import com.example.itsoftware.accountbookmanagementsystem.Fragment.CommunityFragment;
import com.example.itsoftware.accountbookmanagementsystem.Fragment.DetailFragment;
import com.example.itsoftware.accountbookmanagementsystem.Fragment.WalletFragment;
import com.example.itsoftware.accountbookmanagementsystem.R;

public class ManagementActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_management);
    }

    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.tv_detail:
                getSupportFragmentManager().beginTransaction().replace(R.id.fl_content, new DetailFragment()).commitAllowingStateLoss();
                break;
            case R.id.tv_chart:
                getSupportFragmentManager().beginTransaction().replace(R.id.fl_content, new ChartFragment()).commitAllowingStateLoss();
                break;
            case R.id.tv_add:
                break;
            case R.id.tv_wallet:
                getSupportFragmentManager().beginTransaction().replace(R.id.fl_content, new WalletFragment()).commitAllowingStateLoss();
                break;
            case R.id.tv_community:
                getSupportFragmentManager().beginTransaction().replace(R.id.fl_content, new CommunityFragment()).commitAllowingStateLoss();
                break;
        }
    }
}
