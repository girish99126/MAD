package com.example.dateandtime;

import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.app.TimePickerDialog;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.DatePicker;
import android.widget.TextView;
import android.widget.TimePicker;

import java.text.DateFormat;
import java.util.Calendar;

public class MainActivity extends AppCompatActivity {
    TextView text_v;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        text_v = findViewById(R.id.time_v);
    }

    public void setdate(View view) {
        Calendar c = Calendar.getInstance();

        TimePickerDialog dp = new TimePickerDialog(this, new TimePickerDialog.OnTimeSetListener() {
            @Override
            public void onTimeSet(TimePicker view, int hourOfDay, int minute) {
                Calendar c1 = Calendar.getInstance();
                c1.set(Calendar.HOUR, hourOfDay);
                c1.set(Calendar.MINUTE,minute);
                int h = c1.get(Calendar.HOUR);
                int m = c1.get(Calendar.MINUTE);
                text_v.setText(h+":"+m);
            }
        }, c.get(Calendar.HOUR), c.get(Calendar.MINUTE), false);
        dp.show();
    }
//    dp.show();

}
