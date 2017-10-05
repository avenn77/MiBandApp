package ama.eeia.a214443.mibandapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.betomaluje.miband.ActionCallback;
import com.betomaluje.miband.MiBand;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MyMiBandApp";
    private MiBand miBand;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
