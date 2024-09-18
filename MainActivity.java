package com.example.disablebuttonapp;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private Button buttonReset;
    private Button buttonDisable;
    private TextView textView;
    private int clickCount = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonReset = findViewById(R.id.buttonReset);
        buttonDisable = findViewById(R.id.buttonDisable);
        textView = findViewById(R.id.textView);
        textView.setText("Liczba kliknięć: " + clickCount);

        buttonDisable.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clickCount++;
                textView.setText("Liczba kliknięć: " + clickCount);
                buttonDisable.setEnabled(false);
            }
        });

        buttonReset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText("Liczba kliknięć: " + clickCount);
                buttonDisable.setEnabled(true);
            }
        });
    }
}