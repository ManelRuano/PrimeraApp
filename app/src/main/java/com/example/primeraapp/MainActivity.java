package com.example.primeraapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        CharSequence text = "Mi primera app!";
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText( this , text, duration);
        final Button button = findViewById(R.id.boton);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Code here executes on main thread after user presses button

                toast.show();
            }
        });
    }
}