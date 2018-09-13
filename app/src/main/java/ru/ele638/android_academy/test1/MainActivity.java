package ru.ele638.android_academy.test1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public static final String BTC_TAG = "BTC_TAG";
    TextView valueBtc;
    Button addButton;
    int value;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        valueBtc = findViewById(R.id.btc_value_tv);
        addButton = findViewById(R.id.btc_add_btn);
        if (savedInstanceState == null) {
            value = Integer.parseInt(valueBtc.getText().toString());
        } else {
            value = savedInstanceState.getInt("value");
            valueBtc.setText(value+"");
        }
    }

    public void addBtc(View view) {
        value++;
        valueBtc.setText(value+"");
        if(value % 5 == 0 && value != 0){
            Intent myIntent = new Intent(this, SecondActivity.class);
            myIntent.putExtra(BTC_TAG, value);
            startActivity(myIntent);
        }
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putInt("value", value);
    }
}
