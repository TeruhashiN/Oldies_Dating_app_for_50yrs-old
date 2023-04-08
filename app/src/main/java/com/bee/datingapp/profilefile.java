package com.bee.datingapp;

import androidx.appcompat.app.AppCompatActivity;
import android.media.Image;
import android.widget.Button;
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

public class profilefile extends AppCompatActivity {
    private static final String FILE_NAME = "profilename.txt";
    private static final String FILE_NAME2 = "profileage.txt";
    private static final String FILE_NAME3 = "profilegender.txt";
    private static final String FILE_NAME4 = "profilephone.txt";
    private static final String FILE_NAME5 = "profilelocation.txt";
    private ImageView menumain3, musicplayer3, chatery3;

    EditText _editprofilename, _editprofileage, _editprofilegender, _editprofilephone, _editprofilelocation;

    private Button profile_editing;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profilefile);

        menumain3 = (ImageView) findViewById(R.id.menu_main3);
        menumain3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {menumainbutton3();}
        });
        musicplayer3 = (ImageView) findViewById(R.id.headphonemusic3);
        musicplayer3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {musicplayerbutton();}
        });
        chatery3 = (ImageView) findViewById(R.id.messageemo3);
        chatery3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {chaterybutton3();}
        });

        profile_editing = (Button) findViewById(R.id.edit_the_profile);
        profile_editing.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {editing_profile();}
        });

        _editprofilename = findViewById(R.id.editprofilename);
        _editprofileage = findViewById(R.id.editprofileage);
        _editprofilegender = findViewById(R.id.editprofilegender);
        _editprofilephone = findViewById(R.id.editprofilephone);
        _editprofilelocation = findViewById(R.id.editprofilelocation);
    }
    public void menumainbutton3() {
        Intent intent = new Intent(this, mainmenu.class);
        startActivity(intent);
        Toast.makeText(this, "Welcome to Main Section ", Toast.LENGTH_SHORT).show();
    }
    public void musicplayerbutton() {
        Intent intent = new Intent(this, musicplayer.class);
        startActivity(intent);
        Toast.makeText(this, "Welcome to Music Section ", Toast.LENGTH_SHORT).show();
    }
    public void chaterybutton3() {
        Intent intent = new Intent(this, chatsection.class);
        startActivity(intent);
        Toast.makeText(this, "Welcome to Chat Section ", Toast.LENGTH_SHORT).show();
    }
    public void editing_profile() {
        Intent intent = new Intent(this, updatingprofile.class);
        startActivity(intent);
        Toast.makeText(this, "Want to update your profile?", Toast.LENGTH_SHORT).show();

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