package com.example.rladb.soft;


import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TableLayout;


public class CustomerActivity extends AppCompatActivity implements View.OnClickListener {

    private Button mbuttonc_timetableButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_customer);

      //  TableLayout tableLayout= (TableLayout)findViewById(R.id.ac)
        Button  c_timetableButton= (Button) findViewById(R.id.c_timetableButton);
        c_timetableButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.c_timetableButton:
                Intent intentc_timetableButton = new Intent(this, Customer2Activity.class);
                startActivity(intentc_timetableButton);
                break;
        }
    }
}



