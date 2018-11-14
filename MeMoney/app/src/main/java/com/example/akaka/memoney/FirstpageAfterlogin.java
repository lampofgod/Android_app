package com.example.akaka.memoney;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import uk.co.chrisjenx.calligraphy.CalligraphyConfig;
import uk.co.chrisjenx.calligraphy.CalligraphyContextWrapper;

public class FirstpageAfterlogin extends AppCompatActivity {

    private String[] Menu  = new String[]{
            "รายรับ-รายจ่าย",
            "Exchange",
            "Exchange (btc,น้ำมัน,etc...)",
            "News"
    };
    private ListView MenuList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_firstpage_afterlogin);
        CalligraphyConfig.initDefault(new CalligraphyConfig.Builder().setDefaultFontPath("EkkamaiStandardLight.ttf").setFontAttrId(R.attr.fontPath).build());
        MenuList = (ListView) findViewById(R.id.ListviewMenu);
        ArrayAdapter<String> apformenu = new ArrayAdapter <String> (this,android.R.layout.simple_list_item_1,Menu);
        MenuList.setAdapter(apformenu);
        MenuList.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
                if(position == 0){
                    Intent go_MainIncome_expend = new Intent(FirstpageAfterlogin.this,MainIncome_expend.class);
                    startActivity(go_MainIncome_expend);
                }

            }
        });




    }
    protected void attachBaseContext(Context newBase) {
        super.attachBaseContext(CalligraphyContextWrapper.wrap(newBase));
    }
}