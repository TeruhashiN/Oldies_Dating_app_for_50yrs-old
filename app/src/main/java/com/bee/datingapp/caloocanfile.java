package com.bee.datingapp;

import androidx.appcompat.app.AppCompatActivity;
import android.widget.ImageButton;
import android.widget.Toast;
import android.content.Intent;
import android.view.View;
import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;

public class caloocanfile extends AppCompatActivity {
    private ImageButton chaty;
    private TextView texty;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_caloocanfile);

        chaty = (ImageButton) findViewById(R.id.messageme);
        chaty.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {chatnatin();}
        });
        texty = (TextView) findViewById(R.id.messageme2);
        texty.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {chatnatin();}
        });
    }
    public void chatnatin() {
        Intent intent = new Intent(this, chatreply.class);
        startActivity(intent);
        Toast.makeText(this, "Let's Chat ", Toast.LENGTH_SHORT).show();
    }
}