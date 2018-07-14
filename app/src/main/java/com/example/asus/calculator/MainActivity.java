package com.example.asus.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private TextView tvResultField;
    private EditText etInputField;


    private String operation;
    private double num1, num2, result;
    private Button btnClean, btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btn0, btnPlus, btnMinus, btnMultiply, btnDivision, btnEquals;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        operation = "";
        num1=0; num2=0;

        btnClean = findViewById(R.id.btnClean);
        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
        btn4 = findViewById(R.id.btn4);
        btn5 = findViewById(R.id.btn5);
        btn6 = findViewById(R.id.btn6);
        btn7 = findViewById(R.id.btn7);
        btn8 = findViewById(R.id.btn8);
        btn9 = findViewById(R.id.btn9);
        btn0 = findViewById(R.id.btn0);
        btnPlus = findViewById(R.id.btnPlus);
        btnMinus = findViewById(R.id.btnMinus);
        btnMultiply = findViewById(R.id.btnMultiply);
        btnDivision = findViewById(R.id.btnDivision);
        btnEquals = findViewById(R.id.btnEquals);
        btnClean.setOnClickListener(this);
        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
        btn3.setOnClickListener(this);
        btn4.setOnClickListener(this);
        btn5.setOnClickListener(this);
        btn6.setOnClickListener(this);
        btn7.setOnClickListener(this);
        btn8.setOnClickListener(this);
        btn9.setOnClickListener(this);
        btn0.setOnClickListener(this);
        btnPlus.setOnClickListener(this);
        btnMinus.setOnClickListener(this);
        btnMultiply.setOnClickListener(this);
        btnDivision.setOnClickListener(this);
        btnEquals.setOnClickListener(this);


        tvResultField = findViewById(R.id.resultField);
        etInputField = findViewById(R.id.inputField);
    }


    @Override
    public void onClick(View view) {

        int id = view.getId();
        switch (id) {
            case R.id.btnClean:
                etInputField.setText("");
                break;
            case R.id.btn1:
                etInputField.append("1");
                break;
            case R.id.btn2:
                etInputField.append("2");
                break;
            case R.id.btn3:
                etInputField.append("3");
                break;
            case R.id.btn4:
                etInputField.append("4");
                break;
            case R.id.btn5:
                etInputField.append("5");
                break;
            case R.id.btn6:
                etInputField.append("6");
                break;
            case R.id.btn7:
                etInputField.append("7");
                break;
            case R.id.btn8:
                etInputField.append("8");
                break;
            case R.id.btn9:
                etInputField.append("9");
                break;
            case R.id.btn0:
                etInputField.append("0");
                break;
            case R.id.btnPlus:
                etInputField.append("+");
                break;
            case R.id.btnMinus:
                etInputField.append("-");
                break;
            case R.id.btnMultiply:
                etInputField.append("*");
                break;
            case R.id.btnDivision:
                etInputField.append("/");
                break;

            case R.id.btnEquals:
                parseData();
                break;

        }
    }

    private void parseData() {
        String[] splittedArr = etInputField.getText().toString().split("должно парсить по знакам +-*/");
        num1 = Double.parseDouble(splittedArr[0]);
        num2 = Double.parseDouble(splittedArr[2]);
        operation = splittedArr[1];

        calculate();
    }

    private void calculate() {
        switch (operation) {
            case "+":
                result = num1 + num2;
                break;
            case "-":
                result = num1 - num2;
                break;
            case "*":
                result = num1 * num2;
                break;
            case "/":
                result = num1 / num2;
                break;
                default:
                    System.out.println("error while calculating!");
        }
        tvResultField.setText(String.valueOf(result));
    }
}
