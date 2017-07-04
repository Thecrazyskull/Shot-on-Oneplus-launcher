package anas.com.shotononeplus;

import android.content.ComponentName;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Intent intent = new Intent();
        intent.setComponent(ComponentName.unflattenFromString("cn.oneplus.photos/.ui.MainActivity"));
        try {
            startActivity(intent);
        } catch (Exception e) {
            Toast.makeText(this, "Shot on oneplus app not installed", Toast.LENGTH_LONG).show();
        }
    }
}