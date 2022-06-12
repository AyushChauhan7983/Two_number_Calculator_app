package com.example.ayush3;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;


public class screen2 extends AppCompatActivity
{

    EditText number1;
    EditText number2;
    Button Generate;
    TextView result;

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen2);
        number1= findViewById(R.id.editText_first_no);
        number2= findViewById(R.id.editText_second_no);
        Generate= findViewById((R.id.generate));
        result= findViewById((R.id.textView_answer));

        Generate.setOnClickListener(v ->
        {
            if(TextUtils.isEmpty(number1.getText().toString()) && TextUtils.isEmpty(number2.getText().toString()))
            {
                Toast.makeText(screen2.this, "Enter two numbers!!", Toast.LENGTH_SHORT).show();
            }
            else if(TextUtils.isEmpty(number1.getText().toString()))
            {
                Toast.makeText(screen2.this, "Enter first number!!", Toast.LENGTH_SHORT).show();
            }
            else if(TextUtils.isEmpty(number2.getText().toString()))
            {
                Toast.makeText(screen2.this, "Enter second number!!", Toast.LENGTH_SHORT).show();

            }
            else
            {
                double num1 = Double.parseDouble(number1.getText().toString());
                double num2 = Double.parseDouble(number2.getText().toString());

                double sum = num1 - num2;

                result.setText(Double.toString(sum));
            }
        });
    }
}