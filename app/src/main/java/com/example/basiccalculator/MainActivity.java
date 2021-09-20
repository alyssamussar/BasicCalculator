package com.example.basiccalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.content.Intent;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    int output = 0;

    public void goToActivity2(int output) {

        Intent intent = new Intent(this, MainActivity2.class);
        String print = String.valueOf(output);
        intent.putExtra("print", print);
        startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button add = (Button) findViewById(R.id.additionButton);
        add.setOnClickListener(this); // calling onClick() method
        Button subtract = (Button) findViewById(R.id.subtractionButton);
        subtract.setOnClickListener(this);
        Button multiply = (Button) findViewById(R.id.multiplicationButton);
        multiply.setOnClickListener(this);
        Button divide = (Button) findViewById(R.id.divisionButton);
        divide.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {

        EditText num1 = (EditText) findViewById(R.id.Num1);
        EditText num2 = (EditText) findViewById(R.id.Num2);

        int int1 = Integer.parseInt(num1.getText().toString());
        int int2 = Integer.parseInt(num2.getText().toString());


        switch(view.getId()) {
            case R.id.additionButton:
                output=(int1+int2);
                break;
            case R.id.subtractionButton:
                output=(int1-int2);
                break;
            case R.id.multiplicationButton:
                output=(int1*int2);
                break;
            case R.id.divisionButton:
                output=(int1/int2);
                break;
        }

        goToActivity2(output);
    }
}
