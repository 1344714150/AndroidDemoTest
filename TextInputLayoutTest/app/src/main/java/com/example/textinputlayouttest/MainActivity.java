package com.example.textinputlayouttest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final EditText usernameEditText = findViewById(R.id.et_hint_username);
        final EditText passwordEditText = findViewById(R.id.et_hint_password);
        Button loginButton  = findViewById(R.id.login_button);
        final TextInputLayout usernameTextInputLayout = findViewById(R.id.til_hint_username);
        final TextInputLayout passwordTextInputLayout = findViewById(R.id.til_hint_password);

        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String username = usernameEditText.getText().toString();
                if(!username.equals("admin")){
                    usernameTextInputLayout.setErrorEnabled(true);
                    usernameTextInputLayout.setError("用户名错误");
                    return ;
                }
                usernameTextInputLayout.setErrorEnabled(false);
                String password = passwordEditText.getText().toString();
                if(!password.equals("12345")){
                    passwordTextInputLayout.setErrorEnabled(true);
                    passwordTextInputLayout.setError("密码错误");
                    return ;
                }
                passwordTextInputLayout.setErrorEnabled(false);
                Toast.makeText(MainActivity.this,"登录成功！",Toast.LENGTH_SHORT).show();
            }
        });
    }
}
