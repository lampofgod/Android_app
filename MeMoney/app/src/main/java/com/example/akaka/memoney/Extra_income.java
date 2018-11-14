package com.example.akaka.memoney;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import uk.co.chrisjenx.calligraphy.CalligraphyConfig;
import uk.co.chrisjenx.calligraphy.CalligraphyContextWrapper;

public class Extra_income extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_extra_income);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        CalligraphyConfig.initDefault(new CalligraphyConfig.Builder().setDefaultFontPath("EkkamaiStandardLight.ttf").setFontAttrId(R.attr.fontPath).build());
    }
    protected void attachBaseContext(Context newBase) {
        super.attachBaseContext(CalligraphyContextWrapper.wrap(newBase));
    }
}
