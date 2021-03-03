
package com.example.mad4;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.content.DialogInterface;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void dialogAlert(View view){
        AlertDialog.Builder myalert = new AlertDialog.Builder(MainActivity.this);
        myalert.setTitle("Alert");
        myalert.setMessage("Okay to continue,Cancel to Stop");
        myalert.setPositiveButton("Okay", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(MainActivity.this,"Clicked Okay",Toast.LENGTH_SHORT).show();
            }
        });
        myalert.setNegativeButton("cancel", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(MainActivity.this,"Clicked on Cancel",Toast.LENGTH_SHORT).show();
            }
        });
        myalert.show();
    }
}
