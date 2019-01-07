package com.example.business.friedrich.kuzan.mybank;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.Toast;

public class Client_PIN_CODE_Activity extends AppCompatActivity {

    private EditText mEditCode;
    private String mCode;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_client__pin__code_);

        mEditCode = findViewById(R.id.edit_code);
        mCode = mEditCode.getText().toString();

    }
}
