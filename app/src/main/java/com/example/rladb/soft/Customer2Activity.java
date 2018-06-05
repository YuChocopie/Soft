package com.example.rladb.soft;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Customer2Activity extends AppCompatActivity implements View.OnClickListener {

    private Button mbuttonc_PlusButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_customer2);

        Button c_PlusButton= (Button) findViewById(R.id.c_PlusButton);
        c_PlusButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.c_PlusButton:
                Intent intentc_PlusButton = new Intent(this, TranerListActivity.class);
                startActivity(intentc_PlusButton);
                break;
        }
    }
}
