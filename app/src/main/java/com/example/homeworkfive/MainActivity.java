package com.example.homeworkfive;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    static String TAG = "displayText";
    private static int REQ = 1;
    TextView textView;

    Button buttonOne;
    Button buttonTwo;
    Button buttonThree;
    Button buttonFour;
    Button buttonFive;
    Button buttonSix;
    Button buttonSeven;
    Button buttonEight;
    Button buttonNine;
    Button buttonZero;
    Button buttonPlus;
    Button buttonSubtract;
    Button buttonMultiply;
    Button buttonDivision;
    Button buttonComma;
    Button buttonDot;
    Button buttonEquals;
    Button buttonSettings;

    com.example.homeworkfive.DisplayText displayText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initView();
        initListener();
        displayText = new com.example.homeworkfive.DisplayText();
    }

    @Override
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putParcelable(TAG, displayText);
    }

    @Override
    protected void onRestoreInstanceState(@NonNull Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        displayText = savedInstanceState.getParcelable(TAG);
        textView.setText(displayText.getText());
    }

    private void initListener() {
        buttonSettings.setOnClickListener(this);
        buttonOne.setOnClickListener(this);
        buttonTwo.setOnClickListener(this);
        buttonThree.setOnClickListener(this);
        buttonFour.setOnClickListener(this);
        buttonFive.setOnClickListener(this);
        buttonSix.setOnClickListener(this);
        buttonSeven.setOnClickListener(this);
        buttonEight.setOnClickListener(this);
        buttonNine.setOnClickListener(this);
        buttonZero.setOnClickListener(this);
        buttonPlus.setOnClickListener(this);
        buttonSubtract.setOnClickListener(this);
        buttonMultiply.setOnClickListener(this);
        buttonDivision.setOnClickListener(this);
        buttonComma.setOnClickListener(this);
        buttonDot.setOnClickListener(this);
        buttonEquals.setOnClickListener(this);
    }

    private void initView() {
        textView = findViewById(R.id.text_view);

        buttonSettings = findViewById(R.id.button_settings);
        buttonOne = findViewById(R.id.button_one);
        buttonTwo = findViewById(R.id.button_two);
        buttonThree = findViewById(R.id.button_three);
        buttonFour = findViewById(R.id.button_four);
        buttonFive = findViewById(R.id.button_five);
        buttonSix = findViewById(R.id.button_six);
        buttonSeven = findViewById(R.id.button_seven);
        buttonEight = findViewById(R.id.button_eight);
        buttonNine = findViewById(R.id.button_nine);
        buttonZero = findViewById(R.id.button_zero);
        buttonPlus = findViewById(R.id.button_plus);
        buttonSubtract = findViewById(R.id.button_subtract);
        buttonMultiply = findViewById(R.id.button_multiply);
        buttonDivision = findViewById(R.id.button_division);
        buttonComma = findViewById(R.id.button_comma);
        buttonDot = findViewById(R.id.button_dot);
        buttonEquals = findViewById(R.id.button_equals);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.button_one:
                displayText.setText("1");
                textView.setText(displayText.getText());
                break;
            case R.id.button_two:
                displayText.setText("2");
                textView.setText(displayText.getText());
                break;
            case R.id.button_three:
                displayText.setText("3");
                textView.setText(displayText.getText());
                break;
            case R.id.button_four:
                displayText.setText("4");
                textView.setText(displayText.getText());
                break;
            case R.id.button_five:
                displayText.setText("5");
                textView.setText(displayText.getText());
                break;
            case R.id.button_six:
                displayText.setText("6");
                textView.setText(displayText.getText());
                break;
            case R.id.button_seven:
                displayText.setText("7");
                textView.setText(displayText.getText());
                break;
            case R.id.button_eight:
                displayText.setText("8");
                textView.setText(displayText.getText());
                break;
            case R.id.button_nine:
                displayText.setText("9");
                textView.setText(displayText.getText());
                break;
            case R.id.button_zero:
                displayText.setText("0");
                textView.setText(displayText.getText());
                break;
            case R.id.button_plus:
                displayText.setText("+");
                textView.setText(displayText.getText());
                break;
            case R.id.button_subtract:
                displayText.setText("-");
                textView.setText(displayText.getText());
                break;
            case R.id.button_multiply:
                displayText.setText("*");
                textView.setText(displayText.getText());
                break;
            case R.id.button_division:
                displayText.setText("/");
                textView.setText(displayText.getText());
                break;
            case R.id.button_comma:
                displayText.setText(",");
                textView.setText(displayText.getText());
                break;
            case R.id.button_dot:
                displayText.setText(".");
                textView.setText(displayText.getText());
                break;
            case R.id.button_equals:
                displayText.setText("=");
                textView.setText(displayText.getText());
                break;
            case R.id.button_settings:
                Intent runSettings = new Intent(MainActivity.this, MainActivitySettings.class
                );
                startActivityForResult(runSettings, REQ);
                break;
            default:
                break;
        }

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        switch (requestCode) {
            case 1:
                setTheme(R.style.theme1);
                break;
            case 2:
                setTheme(R.style.theme2);
                break;
        }
    }
}