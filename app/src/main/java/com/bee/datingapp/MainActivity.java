package com.bee.datingapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    private Button login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        login = (Button) findViewById(R.id.Login);
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {mainbutton();}
        });
    }
    public void mainbutton() {
        Intent intent = new Intent(this, mainmenu.class);
        startActivity(intent);
        Toast.makeText(this, "Login Successfully ", Toast.LENGTH_SHORT).show();
    }
}