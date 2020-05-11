package io.github.codessive.ubank;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckedTextView;
import android.widget.TextView;

import com.hover.sdk.actions.HoverAction;
import com.hover.sdk.api.Hover;
import com.hover.sdk.api.HoverParameters;

import java.util.ArrayList;

public class GTB extends AppCompatActivity implements Hover.DownloadListener, View.OnClickListener {
    private final String TAG = "GTB";

    private CheckedTextView buy_airtime,transfer_others,bill_payment,transfer_gtb,gtb_balance;
    private Button proceed_payment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.g_t_b);

        Hover.initialize(getApplicationContext(), this);

        gtb_balance =(CheckedTextView) findViewById(R.id.balance_gtb);
        transfer_gtb =(CheckedTextView) findViewById(R.id.transfer_gtb);
        bill_payment =(CheckedTextView) findViewById(R.id.bill_payment);
        transfer_others =(CheckedTextView) findViewById(R.id.transfer_others_gtbbank);
        buy_airtime =(CheckedTextView) findViewById(R.id.buy_airtime);

        proceed_payment = (Button) findViewById(R.id.btn_proceed_gtb);

        proceed_payment.setOnClickListener(this);

    }


    @Override public void onError(String message) {
//		Toast.makeText(this, "Error while attempting to download actions, see logcat for error", Toast.LENGTH_LONG).show();
        Log.e(TAG, "Error: " + message);
    }

    @Override public void onSuccess(ArrayList<HoverAction> actions) {
//		Toast.makeText(this, "Successfully downloaded " + actions.size() + " actions", Toast.LENGTH_LONG).show();
        Log.d(TAG, "Successfully downloaded " + actions.size() + " actions");
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.balance_gtb){
            Intent i=new HoverParameters.Builder(GTB.this)
                    .request("58d4977a") // Add your action ID here
//                    .extra("YOUR_VARIABLE_NAME", "TEST_VALUE") // Uncomment and add your variables if any
                    .buildIntent();
            startActivityForResult(i,0);
        }
        }
}
