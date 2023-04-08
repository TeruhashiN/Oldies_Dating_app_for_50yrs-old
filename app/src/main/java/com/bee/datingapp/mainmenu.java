package com.bee.datingapp;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.media.Image;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Toast;
import android.content.Intent;
import android.view.View;
import android.os.Bundle;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;


public class mainmenu extends AppCompatActivity {
    private ImageButton caloocanboyet;
    private ImageView musicplayery, profilery, chatery;

    private static final String FILE_NAME = "profilename.txt";
    private static final String FILE_NAME2 = "profileage.txt";
    private static final String FILE_NAME3 = "profilegender.txt";
    private static final String FILE_NAME4 = "profilephone.txt";
    private static final String FILE_NAME5 = "profilelocation.txt";

    EditText _editprofilename, _editprofileage, _editprofilegender, _editprofilephone, _editprofilelocation;


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mainmenu);

        caloocanboyet = (ImageButton) findViewById(R.id.caloocanboy);
        caloocanboyet.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {caloocanbutton();}
        });

        musicplayery = (ImageView) findViewById(R.id.headphonemusic);
        musicplayery.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {musicplayerbutton();}
        });
        profilery = (ImageView) findViewById(R.id.profile);
        profilery.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {profilebutton();}
        });
        chatery = (ImageView) findViewById(R.id.messageemo);
        chatery.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {chaterybutton();}
        });
        _editprofilename = findViewById(R.id.editprofilename);
        _editprofileage = findViewById(R.id.editprofileage);
        _editprofilegender = findViewById(R.id.editprofilegender);
        _editprofilephone = findViewById(R.id.editprofilephone);
        _editprofilelocation = findViewById(R.id.editprofilelocation);
    }
    public void caloocanbutton() {
        Intent intent = new Intent(this, caloocanfile.class);
        startActivity(intent);
        Toast.makeText(this, "Welcome to Ocan Boyet Profile ", Toast.LENGTH_SHORT).show();
    }
    public void musicplayerbutton() {
        Intent intent = new Intent(this, musicplayer.class);
        startActivity(intent);
        Toast.makeText(this, "Welcome to Music Section ", Toast.LENGTH_SHORT).show();
    }
    public void profilebutton() {
        Intent intent = new Intent(this, profilefile.class);
        startActivity(intent);
        Toast.makeText(this, "Welcome to Profile Section ", Toast.LENGTH_SHORT).show();
    }
    public void chaterybutton() {
        Intent intent = new Intent(this, chatsection.class);
        startActivity(intent);
        Toast.makeText(this, "Welcome to Chat Section ", Toast.LENGTH_SHORT).show();
    }
    public void load(View v) {
        FileInputStream fis = null;

        try {
            fis = openFileInput(FILE_NAME);
            InputStreamReader isr = new InputStreamReader(fis);
            BufferedReader br = new BufferedReader(isr);
            StringBuilder sb = new StringBuilder();
            String text;

            while ((text = br.readLine()) != null) {
                sb.append(text).append("\n");
            }

            _editprofilename.setText(sb.toString());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fis != null) {
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        try {
            fis = openFileInput(FILE_NAME2);
            InputStreamReader isr = new InputStreamReader(fis);
            BufferedReader br = new BufferedReader(isr);
            StringBuilder sb = new StringBuilder();
            String text2;

            while ((text2 = br.readLine()) != null) {
                sb.append(text2).append("\n");
            }

            _editprofileage.setText(sb.toString());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fis != null) {
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        try {
            fis = openFileInput(FILE_NAME3);
            InputStreamReader isr = new InputStreamReader(fis);
            BufferedReader br = new BufferedReader(isr);
            StringBuilder sb = new StringBuilder();
            String text3;

            while ((text3 = br.readLine()) != null) {
                sb.append(text3).append("\n");
            }

            _editprofilegender.setText(sb.toString());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fis != null) {
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        try {
            fis = openFileInput(FILE_NAME4);
            InputStreamReader isr = new InputStreamReader(fis);
            BufferedReader br = new BufferedReader(isr);
            StringBuilder sb = new StringBuilder();
            String text4;

            while ((text4 = br.readLine()) != null) {
                sb.append(text4).append("\n");
            }

            _editprofilephone.setText(sb.toString());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fis != null) {
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        try {
            fis = openFileInput(FILE_NAME5);
            InputStreamReader isr = new InputStreamReader(fis);
            BufferedReader br = new BufferedReader(isr);
            StringBuilder sb = new StringBuilder();
            String text5;

            while ((text5 = br.readLine()) != null) {
                sb.append(text5).append("\n");
            }

            _editprofilelocation.setText(sb.toString());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fis != null) {
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }

}