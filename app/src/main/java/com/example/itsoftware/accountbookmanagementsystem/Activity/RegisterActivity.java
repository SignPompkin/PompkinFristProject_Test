package com.example.itsoftware.accountbookmanagementsystem.Activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.example.itsoftware.accountbookmanagementsystem.Help;
import com.example.itsoftware.accountbookmanagementsystem.R;

public class RegisterActivity extends AppCompatActivity {

    private EditText userName;
    private EditText password;
    private EditText confirmPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        userName = findViewById(R.id.userName);
        password = findViewById(R.id.et);
        confirmPassword = findViewById(R.id.ec);
    }

    public void signUp(View view) {
        if (userName.getText().length() <= 0 || password.getText().length() <= 0 || confirmPassword.getText().length() <= 0) {
            Toast.makeText(this, "请填写全部信息", Toast.LENGTH_SHORT).show();
        } else if (!password.getText().toString().equals(confirmPassword.getText().toString())) {
            Toast.makeText(this, "请确认两次密码一致", Toast.LENGTH_SHORT).show();
        } else {
            //注册
            String sql = "insert into Users(UserName,Password) values('" + userName.getText().toString() + "','" + password.getText().toString() + "')";
            Help.post("Execute?sql=" + sql);

            Toast.makeText(this, "注册成功", Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(RegisterActivity.this, MainActivity.class);
            startActivity(intent);
        }
    }
}
