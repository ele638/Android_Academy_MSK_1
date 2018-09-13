package ru.ele638.android_academy.test1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        textView = findViewById(R.id.got_text_id);
        textView.setText(String.format(getString(R.string.got_btc_text), getIntent().getExtras().getInt("BTC_TAG", 0)));
    }
}
