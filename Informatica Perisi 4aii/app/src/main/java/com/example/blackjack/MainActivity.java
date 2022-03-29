package com.example.blackjack;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
public class MainActivity extends AppCompatActivity {
    String Nome;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void gioca(View view){
        Intent intent= new Intent(this, PlayerSetup.class);
        startActivity(intent);
        //Nome = getString("nomePlayer");

    }
}