package com.example.interfaceinjava;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    //UI COMPONENTS

   private Button btnthrowjab;
   private Button btnboxercross;
   private Button btnboxerhook;
   private Button btnboxeruppercut;

   //ui components for kickboxer

     private Button btnkickboxerjab;
     private Button btnkickboxerhook;
     private  Button btnkickboxeruppercut;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       final  Boxer boxerA = new Boxer();
       final  Boxer boxerB = new Boxer();
        final  Boxer boxerC = new Boxer();
        final  Boxer boxerD = new Boxer();



        btnthrowjab = findViewById(R.id.throwjab);
        btnboxercross = findViewById(R.id.BoxerCross);
        btnboxerhook = findViewById(R.id.Boxerhook);
        btnboxeruppercut = findViewById(R.id.boxeruppercut);

        boxerA.throwJab();
        Toast.makeText(MainActivity.this,boxerA.throwJab(),Toast.LENGTH_LONG).show();

        boxerB.throwCross();
        Toast.makeText(MainActivity.this,boxerB.throwCross(),Toast.LENGTH_LONG).show();
        boxerC.throwHook();
        Toast.makeText(MainActivity.this,boxerC.throwHook(),Toast.LENGTH_LONG).show();


        btnthrowjab.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {

                Toast.makeText(MainActivity.this,boxerA.throwJab(),Toast.LENGTH_LONG).show();


            }
        } );

    }
}
