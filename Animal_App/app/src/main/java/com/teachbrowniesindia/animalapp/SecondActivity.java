package com.teachbrowniesindia.animalapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SwitchCompat;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.MenuItem;
import android.widget.CompoundButton;
import android.widget.Switch;
import android.widget.TextView;

import java.util.Objects;

public class SecondActivity extends AppCompatActivity {

    Switch swNotification;
    TextView textView;
    SharedPreferences sharedPrefences;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        textView = findViewById(R.id.txtSecond);

        String someInput = getIntent().getStringExtra("Some_input");
        textView.setText(someInput);
        setupActionBar();

        swNotification = findViewById(R.id.switch1);
        sharedPrefences = PreferenceManager.getDefaultSharedPreferences(this);

        boolean isNotifierTurnedOn = sharedPrefences.getBoolean("notification",true);
        swNotification.setChecked(isNotifierTurnedOn);

        swNotification.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked){
                    sharedPrefences.edit().putBoolean("notification",true).apply();
                }else{
                    sharedPrefences.edit().putBoolean("notification",false).apply();
                }
            }
        });
    }

    private void setupActionBar(){
        ActionBar actionBar = getSupportActionBar();
        Objects.requireNonNull(actionBar).setDisplayHomeAsUpEnabled(true);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if (item.getItemId() == android.R.id.home){
            finish();
        }
        return true;
    }
}