package com.example.bankapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class AddMoney extends AppCompatActivity {
    int listIndex;
    double money;

    EditText moneyText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_money);
        Bundle extras = getIntent().getExtras();
        moneyText = (EditText) findViewById(R.id.editText);
        if (extras != null) {
            listIndex = extras.getInt("key");
        }
        moneyText.setText("0");
    }
    public void addMoney(View v)    {
        money = Double.parseDouble(moneyText.getText().toString());
        MainActivity.accountArrayList.get(listIndex).depositMoney(money);
        Toast.makeText(this,"Added: "+money+"e to account "+MainActivity.accountArrayList.get(listIndex).getInformation(),Toast.LENGTH_SHORT).show();
    }
}
