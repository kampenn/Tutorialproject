package com.example.nickvankampen.tutorialproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button beginbutton = (Button) findViewById(R.id.beginbutton);
        beginbutton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {


            Intent intent = new Intent(MainActivity.this, Main2Activity.class);

            startActivity(intent);
        }
        });
    }

}


