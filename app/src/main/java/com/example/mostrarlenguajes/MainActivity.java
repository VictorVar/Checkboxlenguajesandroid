package com.example.mostrarlenguajes;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    CheckBox java,javascript,go,kotlin,python,cshard,cmasmas,scala,ruby,swift,dart;
    Button mostrar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        java= findViewById(R.id.java);
        javascript= findViewById(R.id.javascript);
        go= findViewById(R.id.go);
        kotlin= findViewById(R.id.kotlin);
        python= findViewById(R.id.python);
        cshard= findViewById(R.id.cshard);
        cmasmas= findViewById(R.id.cmasmas);
        scala= findViewById(R.id.scala);
        ruby= findViewById(R.id.ruby);
        swift= findViewById(R.id.swift);
        dart= findViewById(R.id.dart);
        mostrar= findViewById(R.id.mostrar);
    }
    public void Accionar(View view){
        String texto="";
        if(java.isChecked()){
            texto=java.getText().toString();
        }
        Toast.makeText(this,texto,Toast.LENGTH_SHORT).show();
        if(javascript.isChecked()){
            texto=javascript.getText().toString();
        }
        Toast.makeText(this,texto,Toast.LENGTH_SHORT).show();
        if(go.isChecked()){
            texto=go.getText().toString();
        }
        Toast.makeText(this,texto,Toast.LENGTH_SHORT).show();
        if(kotlin.isChecked()){
            texto=kotlin.getText().toString();
        }
        Toast.makeText(this,texto,Toast.LENGTH_SHORT).show();
        if(python.isChecked()){
            texto=python.getText().toString();
        }
        Toast.makeText(this,texto,Toast.LENGTH_SHORT).show();
        if(cshard.isChecked()){
            texto=cshard.getText().toString();
        }
        Toast.makeText(this,texto,Toast.LENGTH_SHORT).show();
        if(cmasmas.isChecked()){
            texto=cmasmas.getText().toString();
        }
        Toast.makeText(this,texto,Toast.LENGTH_SHORT).show();
        if(scala.isChecked()){
            texto=scala.getText().toString();
        }
        Toast.makeText(this,texto,Toast.LENGTH_SHORT).show();
        if(ruby.isChecked()){
            texto=swift.getText().toString();
        }
        Toast.makeText(this,texto,Toast.LENGTH_SHORT).show();
        if(dart.isChecked()){
            texto=dart.getText().toString();
        }
        Toast.makeText(this,texto,Toast.LENGTH_SHORT).show();
        if(swift.isChecked()){
            texto=swift.getText().toString();
        }
        Toast.makeText(this,texto,Toast.LENGTH_SHORT).show();

    }
}