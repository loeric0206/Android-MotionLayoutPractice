package com.example.motionlayoutprac;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



    }

    public void basic(View view) {
        Intent intent = new Intent(this, Basic.class);
        startActivity(intent);

    }

    public void second(View view) {
        Intent intent = new Intent(this, Second.class);
        startActivity(intent);
    }

    public void third(View view) {
        Intent intent = new Intent(this, Third.class);
        startActivity(intent);
    }

    public void four(View view) {
    }
}
