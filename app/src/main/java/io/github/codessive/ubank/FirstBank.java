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

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.first_bank);


        Hover.initialize(getApplicationContext(), this);


        TextView checkBalance = findViewById(R.id.fbn_balance);
        checkBalance.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new HoverParameters.Builder(FirstBank.this)
                        .request("1d9ae9ca") // Add your action ID here
//                    .extra("YOUR_VARIABLE_NAME", "TEST_VALUE") // Uncomment and add your variables if any
                        .buildIntent();
                startActivityForResult(i, 0);
            }
        });

        TextView getStatement = findViewById(R.id.fbn_statement);
        getStatement.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new HoverParameters.Builder(FirstBank.this)
                        .request("1a4f87bd") // Add your action ID here
//                    .extra("YOUR_VARIABLE_NAME", "TEST_VALUE") // Uncomment and add your variables if any
                        .buildIntent();
                startActivityForResult(i, 0);
            }
        });

        /**    TextView loadAirtime = findViewById(R.id.fbn_airtime_self);
        loadAirtime.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new HoverParameters.Builder(FirstBank.this)
                        .request("37e501de") // Add your action ID here
 //                  .extra("YOUR_VARIABLE_NAME", "TEST_VALUE") // Uncomment and add your variables if any
                        .buildIntent();
                startActivityForResult(i, 0);
            }
       });

        TextView sendMoney = findViewById(R.id.fbn_send_money);
        sendMoney.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new HoverParameters.Builder(FirstBank.this)
                        .request("1d9ae9ca") // Add your action ID here
                   .extra("YOUR_VARIABLE_NAME", "TEST_VALUE") // Uncomment and add your variables if any
                        .buildIntent();
*                startActivityForResult(i, 0);
*            }
*        });
*/
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
