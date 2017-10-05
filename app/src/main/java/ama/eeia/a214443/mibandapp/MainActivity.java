package ama.eeia.a214443.mibandapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.betomaluje.miband.ActionCallback;
import com.betomaluje.miband.MiBand;
import com.betomaluje.miband.model.VibrationMode;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MyMiBandApp";
    private MiBand miBand;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setMiBand();
        connectMiBand();
        vibrate();
    }

    void setMiBand() {
        miBand = MiBand.getInstance(MainActivity.this);
    }

    void connectMiBand() {
        if (!miBand.isConnected()) {
            miBand.connect(new ActionCallback() {
                @Override
                public void onSuccess(Object data) {
                    Log.d(TAG, "Connected with Mi Band!");
                    //show SnackBar/Toast or something
                }

                @Override
                public void onFail(int errorCode, String msg) {
                    Log.d(TAG, "Connection failed: " + msg);
                }
            });
        } else {
            miBand.disconnect();
        }
    }

    void vibrate() {
        miBand.startVibration(VibrationMode.VIBRATION_WITH_LED);
    }
}
