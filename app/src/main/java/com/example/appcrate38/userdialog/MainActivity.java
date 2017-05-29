package com.example.appcrate38.userdialog;

import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button but=(Button)findViewById(R.id.but);
        but.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        View dlgV=View.inflate(getApplicationContext(), R.layout.dialog, null);
        AlertDialog.Builder dialog=new AlertDialog.Builder(this);
        setTitle("Input User Information");
        dialog.setIcon(R.drawable.ryujehong2);
        dialog.setView(dlgV);
        dialog.setPositiveButton("OK",null);
        dialog.setNegativeButton("CANCEL",null);
        dialog.show();
    }
}
