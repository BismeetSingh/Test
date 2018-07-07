package com.app.bissudroid.test1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toast.makeText(this, "Hey this is test1 file changed by backuptest1", Toast.LENGTH_SHORT).show();
        Toast.makeText(this, "Hey this is a test2toast", Toast.LENGTH_SHORT).show();
    }
}