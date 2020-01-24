package com.example.thinkdoapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView textView  = findViewById(R.id.textView);
        textView.setText("Hello world");
        int x = 1;
        double x=1;
    }
private void testUpload(){
        int i = 1+1;
    int j = i+1;
}
}
