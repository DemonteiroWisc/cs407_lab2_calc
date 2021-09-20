package com.example.lab2_calc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    public void clickFunctionPlus(View view) {
        EditText myTextField = (EditText) findViewById(R.id.firstNumber);
        int int1 = Integer.parseInt(myTextField.getText().toString());
        EditText myTextField2 = (EditText) findViewById(R.id.secondNumber);
        int int2= Integer.parseInt(myTextField2.getText().toString());

        int result = int1 + int2;
        goToActivity2(result);
    }

    public void clickFunctionMinus(View view) {
        EditText myTextField = (EditText) findViewById(R.id.firstNumber);
        int int1 = Integer.parseInt(myTextField.getText().toString());
        EditText myTextField2 = (EditText) findViewById(R.id.secondNumber);
        int int2= Integer.parseInt(myTextField2.getText().toString());

        int result = int1 - int2;
        goToActivity2(result);
    }

    public void clickFunctionMultiply(View view) {
        EditText myTextField = (EditText) findViewById(R.id.firstNumber);
        int int1 = Integer.parseInt(myTextField.getText().toString());
        EditText myTextField2 = (EditText) findViewById(R.id.secondNumber);
        int int2= Integer.parseInt(myTextField2.getText().toString());

        int result = int1 * int2;
        goToActivity2(result);
    }

    public void clickFunctionDivide(View view) {
        EditText myTextField = (EditText) findViewById(R.id.firstNumber);
        int int1 = Integer.parseInt(myTextField.getText().toString());
        EditText myTextField2 = (EditText) findViewById(R.id.secondNumber);
        int int2= Integer.parseInt(myTextField2.getText().toString());

        int result = int1 / int2;
        goToActivity2(result);
    }

    public void goToActivity2(int i) {
        Intent intent = new Intent(this, MainActivity2.class);
        intent.putExtra("result", i);
        startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}