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
double num = 0.0;
String lastop = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        display = findViewById(R.id.editTextNumber);
    }

    private void calculate() {
        text = display.getText().toString();

        if (text.isEmpty())
        {
            return;
        }

        if (lastop.equals("plus"))
        {
            num = num + Double.parseDouble(text);
        }
        else if (lastop.equals("minus"))
        {
            num = num - Double.parseDouble(text);
        }
        else if (lastop.equals("mult"))
        {
            num = num * Double.parseDouble(text);
        }
        else if (lastop.equals("div"))
        {
            if (Double.parseDouble(text) != 0.0)
            {
                num = num / Double.parseDouble(text);
            }
        }

        else
        {
            num = Double.parseDouble(text);
        }
    }

    public void clear(View view) {
        num = 0.0;
        lastop = "";
        display.setText("");
    }

    public void plusnum(View view)
    {
        calculate();
        lastop = "plus";
        display.setText("");
    }

    public void minusnum(View view)
    {
        calculate();
        lastop = "minus";
        display.setText("");
    }

    public void multnum(View view)
    {
        calculate();
        lastop = "mult";
        display.setText("");
    }

    public void divnum(View view)
    {
        calculate();
        lastop = "div";
        display.setText("");
    }

    public void equals(View view)
    {
        calculate();
        display.setText(String.valueOf(num));
        lastop = "";
    }

}