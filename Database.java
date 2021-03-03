package com.example.dblogin;

import androidx.appcompat.app.AppCompatActivity;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.sql.SQLData;

public class MainActivity extends AppCompatActivity {

    EditText user,pass;
    SQLiteDatabase db;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        user = findViewById(R.id.username);
        pass = findViewById(R.id.password);
        db = openOrCreateDatabase("Test",MODE_PRIVATE,null);
        db.execSQL("CREATE TABLE IF NOT EXISTS login(username VARCHAR,password VARCHAR);");
        db.execSQL("INSERT INTO login VALUES('admin','admin');");


    }


    public void login(View view) {
        String usr = user.getText().toString();
        String pwd = pass.getText().toString();

        Cursor c = db.rawQuery("SELECT * FROM login where username='"+usr+"' and password='"+pwd+"';",null);


        if(c.moveToFirst())
        {
            Toast.makeText(this, "Login Success", Toast.LENGTH_SHORT).show();
        }
        else
        {
            Toast.makeText(this, "Fail", Toast.LENGTH_SHORT).show();
        }
    }
}
