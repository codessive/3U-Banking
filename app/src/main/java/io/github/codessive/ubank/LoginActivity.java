package io.github.codessive.ubank;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ContentValues;
import android.content.Intent;
import android.opengl.Visibility;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    private EditText inputEmail, inputPassword;
    private Button loginButton;
    private TextView dontHaveANAccount;
    private ProgressBar loadingbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        inputEmail = findViewById(R.id.login_email);
        inputPassword = findViewById(R.id.login_password);
        loginButton = findViewById(R.id.btn_login);

        dontHaveANAccount = findViewById(R.id.signUpHere);
        dontHaveANAccount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                signUp();
            }
        });

        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                login();
            }
        });

    }

    private void signUp() {
            Intent intent = new Intent(LoginActivity.this, SignUpActivity.class);
            startActivity(intent);

    }

    private void login() {

        String email = inputEmail.getText().toString();
        String password = inputEmail.getText().toString();

        if (TextUtils.isEmpty(email)) {
            Toast.makeText(this, "please input your email", Toast.LENGTH_LONG).show();
        } else if (TextUtils.isEmpty(password)) {
            Toast.makeText(this, "please input your password", Toast.LENGTH_LONG).show();
        } else if (TextUtils.isEmpty(email) && TextUtils.isEmpty(password)) {
            Toast.makeText(this, "please type your email and password", Toast.LENGTH_LONG).show();
        } else{

            Intent i = new Intent(LoginActivity.this, DashboardActivity.class);
            startActivity(i);
        }

    }

}

