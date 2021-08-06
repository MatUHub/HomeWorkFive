package com.example.homeworkfive;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivitySettings extends AppCompatActivity implements View.OnClickListener {

    static final int theme1 = 1;
    static final int theme2 = 2;

    static final String KEY_THEME = "theme";
    static final String KEY_CURRENT_THEME = "current_theme";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTheme(getRealId(getCurrentTheme()));
        setContentView(R.layout.activity_main_settings);

        init();

        Button buttonReturn = findViewById(R.id.button_return);
        buttonReturn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivitySettings.this, MainActivity.class);
                intent.putExtra(KEY_CURRENT_THEME, getCurrentTheme());
                finish();
            }
        });
    }

    private void init() {
        findViewById(R.id.radio_button_theme1).setOnClickListener(this);
        findViewById(R.id.radio_button_theme2).setOnClickListener(this);
        switch (getCurrentTheme()) {
            case 1:
                ((RadioButton) findViewById(R.id.radio_button_theme1)).setChecked(true);
                break;
            case 2:
                ((RadioButton) findViewById(R.id.radio_button_theme2)).setChecked(true);
                break;
        }
    }

    @Override
    public void onClick(View view) {

        switch (view.getId()) {
            case R.id.radio_button_theme1:
                setCurrentTheme(theme1);
                break;
            case R.id.radio_button_theme2:
                setCurrentTheme(theme2);
                break;
        }
        recreate();

    }

    private void setCurrentTheme(int currentTheme) {
        SharedPreferences sharedPreferences = getSharedPreferences(KEY_THEME, MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putInt(KEY_CURRENT_THEME, currentTheme);
        editor.apply();
    }

    private int getCurrentTheme() {
        SharedPreferences sharedPreferences = getSharedPreferences(KEY_THEME, MODE_PRIVATE);
        return (sharedPreferences.getInt(KEY_CURRENT_THEME, -1));
    }

    private int getRealId(int currentTheme) {
        switch (currentTheme) {
            case theme1:
                return R.style.theme1;
            case theme2:
                return R.style.theme2;
            default:
                return R.style.theme1;
        }
    }
}