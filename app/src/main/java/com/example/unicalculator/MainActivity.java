package com.example.unicalculator;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private TextView inpputTV, outputTV;
    private Button zero_btn, one_btn, two_btn, three_btn, four_btn, five_btn, six_btn, seven_btn, eignt_btn, nine_btn, decimal_btn;
    private Button addition_btn, subtraction_btn, multiplication_btn, division_btn, percentage_btn;
    private Button clear_btn, allClear_btn, equals_btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /*-----Hoocks----*/
        inpputTV = findViewById(R.id.Input_TV);
        outputTV = findViewById(R.id.Output_TV);

        zero_btn = findViewById(R.id.Zero_btn);
        one_btn = findViewById(R.id.One_btn);
        two_btn = findViewById(R.id.Two_btn);
        three_btn = findViewById(R.id.Three_btn);
        four_btn = findViewById(R.id.Four_btn);
        five_btn = findViewById(R.id.Five_btn);
        six_btn = findViewById(R.id.Six_btn);
        seven_btn = findViewById(R.id.Seven_btn);
        eignt_btn = findViewById(R.id.Eight_btn);
        nine_btn = findViewById(R.id.Nine_btn);
        decimal_btn = findViewById(R.id.Dpoint_btn);

        addition_btn = findViewById(R.id.Addition_btn);
        subtraction_btn = findViewById(R.id.Subtraction_btn);
        division_btn = findViewById(R.id.Division_btn);
        multiplication_btn = findViewById(R.id.Multiplication_btn);

        clear_btn = findViewById(R.id.Clear_btn);
        allClear_btn = findViewById(R.id.AllClear_btn);
        equals_btn = findViewById(R.id.Equals_btn);

        zero_btn.setOnClickListener(this);
        one_btn.setOnClickListener(this);
        two_btn.setOnClickListener(this);
        three_btn.setOnClickListener(this);
        four_btn.setOnClickListener(this);
        five_btn.setOnClickListener(this);
        six_btn.setOnClickListener(this);
        seven_btn.setOnClickListener(this);
        eignt_btn.setOnClickListener(this);
        nine_btn.setOnClickListener(this);
        decimal_btn.setOnClickListener(this);

        addition_btn.setOnClickListener(this);
        subtraction_btn.setOnClickListener(this);
        division_btn.setOnClickListener(this);
        multiplication_btn.setOnClickListener(this);

        allClear_btn.setOnClickListener(this);
        equals_btn.setOnClickListener(this);
        clear_btn.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {

        switch (v.getId()) {

            case R.id.Zero_btn:
                Toast.makeText(this, "zero pressed", Toast.LENGTH_SHORT).show();
                break;
            case R.id.One_btn:
                break;
            case R.id.Two_btn:
                break;
            case R.id.Three_btn:
                break;
            case R.id.Four_btn:
                break;
            case R.id.Five_btn:
                break;
            case R.id.Six_btn:
                break;
            case R.id.Seven_btn:
                break;
            case R.id.Eight_btn:
                break;
            case R.id.Nine_btn:
                break;
            case R.id.Dpoint_btn:
                break;

            //OPERATORS

            case R.id.Addition_btn:
                break;
            case R.id.Subtraction_btn:
                break;
            case R.id.Division_btn:
                break;
            case R.id.Multiplication_btn:
                break;

            //fUNCTIONS
            case R.id.Clear_btn:
                break;
            case R.id.AllClear_btn:
                break;
            case R.id.Equals_btn:
                break;


        }

    }
}