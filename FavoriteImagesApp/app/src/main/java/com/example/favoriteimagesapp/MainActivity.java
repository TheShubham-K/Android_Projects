package com.example.favoriteimagesapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void onButtonClick(View  view){
//        Log.d("DEBUG", "BUTTON CLICKED !");
          displayToast();
    }
    public void displayToast(){
        Toast.makeText(this, "Hello World! How r' You ? ", Toast.LENGTH_LONG).show();
    }
}