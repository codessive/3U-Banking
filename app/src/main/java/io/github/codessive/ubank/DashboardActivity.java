package io.github.codessive.ubank;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.hover.sdk.api.Hover;
import com.hover.sdk.actions.HoverAction;

import java.util.ArrayList;


public class DashboardActivity extends AppCompatActivity implements Hover.DownloadListener {
    private final String TAG = "DashboardActiviy";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        Hover.initialize(DashboardActivity.this);

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

    @Override public void onError(String message) {
//		Toast.makeText(this, "Error while attempting to download actions, see logcat for error", Toast.LENGTH_LONG).show();
        Log.e(TAG, "Error: " + message);
    }

    @Override public void onSuccess(ArrayList<HoverAction> actions) {
//		Toast.makeText(this, "Successfully downloaded " + actions.size() + " actions", Toast.LENGTH_LONG).show();
        Log.d(TAG, "Successfully downloaded " + actions.size() + " actions");
    }
}
