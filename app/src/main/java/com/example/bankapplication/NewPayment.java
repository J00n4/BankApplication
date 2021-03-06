package com.example.bankapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class NewPayment extends AppCompatActivity {
    int listIndex;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_payment);
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            listIndex = extras.getInt("key");
        }
    }

    public void selfPay(View v) {
        Intent i = new Intent(NewPayment.this,SelfPayment.class);
        i.putExtra("key", listIndex);
        startActivity(i);
    }

    public void transferPay(View v) {
        Intent i = new Intent(NewPayment.this, TransferPayment.class);
        i.putExtra("key", listIndex);
        startActivity(i);
    }
}
