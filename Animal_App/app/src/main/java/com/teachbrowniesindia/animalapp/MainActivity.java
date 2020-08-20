package com.teachbrowniesindia.animalapp;

import androidx.appcompat.app.AppCompatActivity;

import android.Manifest;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView textView;
    EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = findViewById(R.id.txt2);
        editText = findViewById(R.id.edtInput);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater  inflater = getMenuInflater();
        inflater.inflate(R.menu.activity_main_drawer,menu);
        return true;
    }

    private void goTOSecondActivity(){
        Intent intent = new Intent(MainActivity.this, SecondActivity.class);
        intent.putExtra("Some_input",editText.getText().toString());
        startActivity(intent);

    }

    public void animate(View view){
        textView.animate().rotationXBy(180).start();
        textView.animate().rotationBy(180).start();
        textView.animate().scaleX(1.2f).scaleY(1.2f).setDuration(500).start();
        textView.animate().translationXBy(3).translationYBy(-25).start();
          goTOSecondActivity();
    }

}