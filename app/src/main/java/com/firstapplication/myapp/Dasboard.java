package com.firstapplication.myapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Dasboard extends AppCompatActivity implements View.OnClickListener {
    Button Calcualtor, Conveter, SI;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dasboard);

        //Binding
        Calcualtor = findViewById(R.id.btncalc);
        Conveter = findViewById(R.id.btntemp);
        SI = findViewById(R.id.btnsi);

        Calcualtor.setOnClickListener(this);
        Conveter.setOnClickListener(this);


    }
    //SetOnclickEvent

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.btncalc) {
            Intent intent = new Intent(Dasboard.this, MainActivity.class);
            startActivity(intent);
        } else if (v.getId() == R.id.btntemp) {
            Intent intent = new Intent(Dasboard.this, MainActivity.class);

        }
    }

}
}
