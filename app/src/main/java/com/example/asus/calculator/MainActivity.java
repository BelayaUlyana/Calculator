package com.example.asus.calculator;

import android.annotation.SuppressLint;
import android.renderscript.ScriptGroup;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView resultField;
    private EditText inputField;
    private Button multiplication, divisiona, adition, subtraction, equality;
    private char oper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        resultField = findViewById(R.id.resultField);
        inputField = findViewById(R.id.inputField);

        multiplication = findViewById(R.id.b_multiplication); //умножение
        divisiona = findViewById(R.id.b_division);  //деление
        adition = findViewById(R.id.b_adition);  //сложение
        subtraction = findViewById(R.id.b_subtraction);  //вычитание
        equality = findViewById(R.id.b_equality);  // равенство
    }

    public void onNumberClick(View view) {
        int result = 0;

        Button button = (Button) view;
        inputField.append(button.getText());
        String input = inputField.getText().toString();
//        String oper = "";

        switch (view.getId()) {
            case R.id.b_equality:
                int variable1 ;
                int variable2 ;

//                switch () {
//                    case "*":
//                        result = variable1 * variable2;
//                        break;
//                    case "/":
//                        result = variable1 / variable2;
//                        break;
//                    case "+":
//                        result = variable1 + variable2;
//                        break;
//                    case "-":
//                        result = variable1 - variable2;
//                        break;
//                }
//                resultField.setText(result);
//                break;
        }
    }
    public void splitString(String s){
        char ch [] = s.toCharArray();
        String var [] = new String[ch.length];
        for (int i = 0; i<ch.length;i++){
            if (!Character.isDigit(ch[i])) {
                for (int j = 0;j<var.length;j++){
                }
            }
        }
    }
}
