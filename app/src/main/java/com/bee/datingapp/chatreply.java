package com.bee.datingapp;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.os.Bundle;

public class chatreply extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chatreply);
    }

    public void sendbutton (View view) {
        TextView reply_ko = findViewById(R.id.replyko);
        EditText type_message = findViewById(R.id.typemessage);
        String _typemessage = type_message.getText().toString();
        reply_ko.setText(_typemessage);
        TextView reply_niya = findViewById(R.id.replyna);
        reply_niya.setVisibility(View.VISIBLE);


    }
}