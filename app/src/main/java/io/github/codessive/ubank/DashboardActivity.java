package io.github.codessive.ubank;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class DashboardActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);
    }

    public void openFirstbank(View view) {
        Intent intent = new Intent(this, FirstBank.class);
        startActivity(intent);
    }

    public void openFcmb(View view) {
        Intent intent = new Intent(this, FCMB.class);
        startActivity(intent);
    }

    public void openEcobank(View view) {
        Intent intent = new Intent(this, EcoBank.class);
        startActivity(intent);
    }

    public void openAccess(View view) {
        Intent intent = new Intent(this, AccessBank.class);
        startActivity(intent);
    }

    public void openFidelity(View view) {
        Intent intent = new Intent(this,FidelityBank.class);
        startActivity(intent);
    }

    public void openGTB(View view) {
        Intent intent = new Intent(this, GTB.class);
        startActivity(intent);
    }

    public void openPolaris(View view) {
        Intent intent = new Intent(this, PolarisBank.class);
        startActivity(intent);
    }

    public void openStanbic(View view) {
        Intent intent = new Intent(this, Stanbic.class);
        startActivity(intent);
    }

    public void openSterling(View view) {
        Intent intent = new Intent(this, Sterling.class);
        startActivity(intent);
    }

    public void openUBA(View view) {
        Intent intent = new Intent(this, UBA.class);
        startActivity(intent);
    }

    public void openUnion(View view) {
        Intent intent = new Intent(this, UnionBank.class);
        startActivity(intent);
    }

    public void openZenith(View view) {
        Intent intent = new Intent(this, ZenithBank.class);
        startActivity(intent);
    }

}
