package com.example.ashra.myproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Second extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Intent i = getIntent();
        String code = i.getExtras().getString("code");
        TextView text_code=findViewById(R.id.textView);
        text_code.setText("BarCode Is :  "+code);
    }
}
