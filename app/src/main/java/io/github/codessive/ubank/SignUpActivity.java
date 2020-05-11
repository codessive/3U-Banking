package io.github.codessive.ubank;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;

public class SignUpActivity extends AppCompatActivity {
    private ProgressDialog loadingbar;
    private EditText Inputname, Inputemail, Inputphone, Inputpassword;
    private Button signUp;
    private TextView AlreadyHaveAnAccount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        Inputemail = (EditText) findViewById(R.id.login_email);
        Inputpassword = (EditText) findViewById(R.id.login_password);
        Inputname = (EditText) findViewById(R.id.login_password);
        Inputphone = (EditText) findViewById(R.id.login_password);

        AlreadyHaveAnAccount = (TextView) findViewById(R.id.login_here);
        signUp = (Button) findViewById(R.id.btn_create_account);

        AlreadyHaveAnAccount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                LoginHere();

            }
        });

        signUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                signUpUser();

            }
        });


    }

    private void LoginHere() {
        Intent intent = new Intent(new Intent(SignUpActivity.this, LoginActivity.class));
        startActivity(intent);
    }

    private void signUpUser() {
        final String name = Inputname.getText().toString();
        final String email = Inputemail.getText().toString();
        final String phone = Inputphone.getText().toString();
        final String password = Inputpassword.getText().toString();


        if (TextUtils.isEmpty(name)) {
            Toast.makeText(SignUpActivity.this, "please write your name", Toast.LENGTH_SHORT).show();
        } else if (TextUtils.isEmpty(email)) {
            Toast.makeText(SignUpActivity.this, "please type your phone email", Toast.LENGTH_SHORT).show();
        } else if (TextUtils.isEmpty(phone)) {
            Toast.makeText(SignUpActivity.this, "please type your phone number", Toast.LENGTH_SHORT).show();
        } else if (TextUtils.isEmpty(password)) {
            Toast.makeText(SignUpActivity.this, "please insert your password", Toast.LENGTH_SHORT).show();
        } else {
            loadingbar.setMessage("please wait while we are checking credentials.");
            loadingbar.setCanceledOnTouchOutside(false);
            loadingbar.show();
        }
    }

}
