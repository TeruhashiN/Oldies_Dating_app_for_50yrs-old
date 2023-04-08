package com.bee.datingapp;

import androidx.appcompat.app.AppCompatActivity;
import android.media.Image;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Toast;
import android.content.Intent;
import android.view.View;
import android.os.Bundle;

public class chatsection extends AppCompatActivity {
    private ImageView menumain4, musicplayer4, profilery4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chatsection);

        menumain4 = (ImageView) findViewById(R.id.menu_main4);
        menumain4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {menumainbutton4();}
        });
        musicplayer4 = (ImageView) findViewById(R.id.headphonemusic4);
        musicplayer4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {musicplayerbutton4();}
        });
        profilery4 = (ImageView) findViewById(R.id.profile4);
        profilery4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {profilerybutton4();}
        });
    }
    public void menumainbutton4() {
        Intent intent = new Intent(this, mainmenu.class);
        startActivity(intent);
        Toast.makeText(this, "Welcome to Main Section ", Toast.LENGTH_SHORT).show();
    }
    public void musicplayerbutton4() {
        Intent intent = new Intent(this, musicplayer.class);
        startActivity(intent);
        Toast.makeText(this, "Welcome to Music Section ", Toast.LENGTH_SHORT).show();
    }
    public void profilerybutton4() {
        Intent intent = new Intent(this, profilefile.class);
        startActivity(intent);
        Toast.makeText(this, "Welcome to Profile Section ", Toast.LENGTH_SHORT).show();
    }
}