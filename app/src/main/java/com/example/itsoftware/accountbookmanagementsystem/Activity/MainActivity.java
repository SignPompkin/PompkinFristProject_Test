package com.example.itsoftware.accountbookmanagementsystem.Activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.example.itsoftware.accountbookmanagementsystem.Help;
import com.example.itsoftware.accountbookmanagementsystem.R;

public class MainActivity extends AppCompatActivity {

    private EditText userName;
    private EditText password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        userName = findViewById(R.id.uid);
        password = findViewById(R.id.pwd);
    }

    public void login(View view) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                String sql = "select * from Users where UserName = '" + userName.getText().toString() + "' and Password = '" + password.getText().toString() + "'";
                if (Boolean.valueOf(Help.get("Judge?sql=" + sql)) == true) {
                    Intent intent = new Intent(MainActivity.this, ManagementActivity.class);
                    startActivity(intent);
                }
            }
        }).start();
    }

    public void register(View view) {
        Intent intent = new Intent(MainActivity.this, RegisterActivity.class);
        startActivity(intent);
    }
}
