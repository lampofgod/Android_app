package com.example.akaka.memoney;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import uk.co.chrisjenx.calligraphy.CalligraphyConfig;
import uk.co.chrisjenx.calligraphy.CalligraphyContextWrapper;

public class MainIncome_expend extends AppCompatActivity {
    private Button extra_income,add_income,add_expend;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_income_expend);
        CalligraphyConfig.initDefault(new CalligraphyConfig.Builder().setDefaultFontPath("EkkamaiStandardLight.ttf").setFontAttrId(R.attr.fontPath).build());
        //button go to Extra-income
        extra_income = (Button)findViewById(R.id.button2);
        extra_income.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent b = new Intent(MainIncome_expend.this,Extra_income.class);
                startActivity(b);
            }
        });
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        //button go to add_income
        add_income = (Button)findViewById(R.id.button);
        add_income.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent add_income_intent = new Intent(MainIncome_expend.this,add_Income.class);
                startActivity(add_income_intent);
            }
        });
        //button go to  add_expend
        add_expend = (Button)findViewById(R.id.button4);
        add_expend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent add_expend_intent = new Intent(MainIncome_expend.this,add_Expend.class);
                startActivity(add_expend_intent);
            }
        });
    }
    protected void attachBaseContext(Context newBase) {
        super.attachBaseContext(CalligraphyContextWrapper.wrap(newBase));
    }
}