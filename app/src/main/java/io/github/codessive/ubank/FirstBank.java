package io.github.codessive.ubank;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.hover.sdk.api.Hover;
import com.hover.sdk.actions.HoverAction;
import com.hover.sdk.api.HoverParameters;

import java.util.ArrayList;

public class FirstBank extends AppCompatActivity implements Hover.DownloadListener {
    private final String TAG = "FirstBank";
    private TextView checkBalance;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.first_bank);


        Hover.initialize(getApplicationContext(), this);


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
