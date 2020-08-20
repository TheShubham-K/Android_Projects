package com.example.currencyconverterapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText mEtValue;
    TextView mTvValue;
    Button mBtnCad;
    Button mBtnInr;
    Button mBtnEur;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mEtValue = findViewById(R.id.et_value);
        mTvValue = findViewById(R.id.tv_value);
        mBtnCad = findViewById(R.id.btn_cad);
        mBtnEur = findViewById(R.id.btn_eur);
        mBtnInr = findViewById(R.id.btn_inr);
    }

    public void onBtnCadClicked(View view){
        double initialvalue = getEnteredvalue();
        double ConvertedValue = initialvalue * 1.36;
        mTvValue.setText(String.format("= %.2f CAD", ConvertedValue));
    }

    public void onBtnInrClicked(View view){
        double initialvalue = getEnteredvalue();
        double ConvertedValue = initialvalue * 74.96;
        mTvValue.setText(String.format("= %.2f INR", ConvertedValue));
    }
    public void onBtnEurClicked(View view){
        double initialvalue = getEnteredvalue();
        double ConvertedValue = initialvalue * 0.86;
        mTvValue.setText(String.format("= %.2f EURO", ConvertedValue));
    }
    public double getEnteredvalue(){
        String enteredvalue = mEtValue.getText().toString();
        if(enteredvalue.equals("")){
            return 0;
        }else{
            return Double.parseDouble(enteredvalue);
        }
    }
}