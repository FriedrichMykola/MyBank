package com.example.business.friedrich.kuzan.mybank;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button mButtonClient, mButtonEmployee;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mButtonClient = findViewById(R.id.button_client);
        mButtonClient.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, Client_PIN_CODE_Activity.class);
            startActivity(intent);
        });

        mButtonEmployee = findViewById(R.id.button_employee);


    }
}
