package com.example.e010;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

EditText display;
String text;
int num = 0;
String lastop = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        display = findViewById(R.id.editTextNumber);
    }

    private void calculate() {
        text = display.getText().toString();

        if (lastop.equals("plus"))
        {
            num = num + Integer.parseInt(text);
        }
        else
        {
            num = Integer.parseInt(text);
        }
    }

    public void plusnum(View view)
    {
        calculate();
        lastop = "plus";
        display.setText("");
    }

    public void equals(View view)
    {
        calculate();
        display.setText(String.valueOf(num));
        lastop = "";
    }

}