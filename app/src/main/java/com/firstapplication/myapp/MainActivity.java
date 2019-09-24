package com.firstapplication.myapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.textclassifier.TextClassificationSessionFactory;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText first, second;
    private Button btnadd;
    private Button btnsub;
    private TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //binding

        first = findViewById(R.id.etfirstnumber);
        second = findViewById(R.id.etsecondnumber);
        btnadd = findViewById(R.id.btnadd);
        btnsub = findViewById(R.id.btnsub);
        result = findViewById(R.id.result);

        btnadd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String a = first.getText().toString();
                String b = second.getText().toString();
                int firstnumber = Integer.parseInt(a);
                int secondnumber = Integer.parseInt(b);

                int c = firstnumber + secondnumber;

                result.setText(String.valueOf(c));

            }

        });

        // button ko click listner
        btnsub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String a = first.getText().toString();
                String b = second.getText().toString();
                int firstnumber = Integer.parseInt(a);
                int secondnumber = Integer.parseInt(b);

                int s = firstnumber - secondnumber;
                
                // for output toast
                Toast.makeText(MainActivity.this, "The sub of two no is", Toast.LENGTH_SHORT).show();

                result.setText(String.valueOf(s));
            }
        });

    }
}
