package com.bee.datingapp;

import androidx.appcompat.app.AppCompatActivity;
import android.media.Image;
import android.widget.ImageButton;
import android.media.MediaPlayer;
import android.widget.ImageView;
import android.widget.Toast;
import android.content.Intent;
import android.view.View;
import android.os.Bundle;

public class musicplayer extends AppCompatActivity {
    private ImageView menumain2, profilery2, chatery2;
    MediaPlayer onemusic, twomusic, threemusic, fourmusic, fivemusic, sixmusic, sevenmusic, eightmusic, ninemusic ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_musicplayer);

        menumain2 = (ImageView) findViewById(R.id.menu_main2);
        menumain2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {menumainbutton2();}
        });
        profilery2 = (ImageView) findViewById(R.id.profile2);
        profilery2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {profilebutton2();}
        });
        chatery2 = (ImageView) findViewById(R.id.messageemo2);
        chatery2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {chaterybutton2();}
        });
    }
    public void menumainbutton2() {
        Intent intent = new Intent(this, mainmenu.class);
        startActivity(intent);
        Toast.makeText(this, "Welcome to Main Section ", Toast.LENGTH_SHORT).show();
    }
    public void profilebutton2() {
        Intent intent = new Intent(this, profilefile.class);
        startActivity(intent);
        Toast.makeText(this, "Welcome to Profile Section ", Toast.LENGTH_SHORT).show();
    }
    public void chaterybutton2() {
        Intent intent = new Intent(this, chatsection.class);
        startActivity(intent);
        Toast.makeText(this, "Welcome to Chat Section ", Toast.LENGTH_SHORT).show();
    }
    public void play(View view) {
        if (onemusic == null) {
            onemusic = MediaPlayer.create(this, R.raw.panalangin);
            onemusic.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                @Override
                public void onCompletion(MediaPlayer mp) {
                    stopPlayer();

                }
            });
        }
        onemusic.start();
    }
    public void play2(View view) {
        if (twomusic == null) {
            twomusic = MediaPlayer.create(this, R.raw.carpenters_yesterday_once_more);
            twomusic.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                @Override
                public void onCompletion(MediaPlayer mp) {
                    stopPlayer();
                }
            });
        }
        twomusic.start();
    }
    public void play3(View view) {
        if (threemusic == null) {
            threemusic = MediaPlayer.create(this, R.raw.bee_gees_how_deep_is_your_love);
            threemusic.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                @Override
                public void onCompletion(MediaPlayer mp) {
                    stopPlayer();
                }
            });
        }
        threemusic.start();
    }
    public void play4(View view) {
        if (fourmusic == null) {
            fourmusic = MediaPlayer.create(this, R.raw.i_need_to_be_in_love);
            fourmusic.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                @Override
                public void onCompletion(MediaPlayer mp) {
                    stopPlayer();
                }
            });
        }
        fourmusic.start();
    }
    public void play5(View view) {
        if (fivemusic == null) {
            fivemusic = MediaPlayer.create(this, R.raw.when_i_met_you);
            fivemusic.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                @Override
                public void onCompletion(MediaPlayer mp) {
                    stopPlayer();
                }
            });
        }
        fivemusic.start();
    }
    public void play6(View view) {
        if (sixmusic == null) {
            sixmusic = MediaPlayer.create(this, R.raw.eternal_plegm);
            sixmusic.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                @Override
                public void onCompletion(MediaPlayer mp) {
                    stopPlayer();
                }
            });
        }
        sixmusic.start();
    }
    public void play7(View view) {
        if (sevenmusic == null) {
            sevenmusic = MediaPlayer.create(this, R.raw.too_much_heaven);
            sevenmusic.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                @Override
                public void onCompletion(MediaPlayer mediaPlayer) {
                    stopPlayer();
                }
            });
        }
        sevenmusic.start();
    }
    public void play8(View view) {
        if (eightmusic == null) {
            eightmusic = MediaPlayer.create(this, R.raw.carpenters);
            eightmusic.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                @Override
                public void onCompletion(MediaPlayer mediaPlayer) {
                    stopPlayer();
                }
            });
        }
        eightmusic.start();
    }
    public void play9(View view) {
        if (ninemusic == null) {
            ninemusic = MediaPlayer.create(this, R.raw.stayin_alive);
            ninemusic.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                @Override
                public void onCompletion(MediaPlayer mediaPlayer) {
                    stopPlayer();
                }
            });
        }
    }

    public void pause(View view) {
        if (onemusic != null) {
            onemusic.pause();
        } else if (twomusic != null) {
            twomusic.pause();
        } else if (threemusic != null) {
            threemusic.pause();
        } else if (fourmusic != null) {
            fourmusic.pause();
        } else if (fivemusic != null) {
            fivemusic.pause();
        } else if (sixmusic != null) {
            sixmusic.pause();
        } else if (sevenmusic != null) {
            sevenmusic.pause();
        } else if (eightmusic != null) {
            eightmusic.pause();
        } else if (ninemusic != null) {
            ninemusic.pause();
        }
    }
    public void stop(View view) {
        stopPlayer();

    }
    private void stopPlayer() {
        if (onemusic != null) {
            onemusic.release();
            onemusic = null;
            Toast.makeText(this, "MediaPlayer One has been released", Toast.LENGTH_SHORT).show();
        } else if (twomusic != null) {
            twomusic.release();
            twomusic = null;
            Toast.makeText(this, "Mediaplayer Two has been released", Toast.LENGTH_SHORT).show();

        } else if (threemusic != null) {
            threemusic.release();
            threemusic = null;
            Toast.makeText(this, "Mediaplayer Three has been released", Toast.LENGTH_SHORT).show();

        } else if (fourmusic != null) {
            fourmusic.release();
            fourmusic = null;
            Toast.makeText(this, "Mediaplayer Four has been released", Toast.LENGTH_SHORT).show();
        } else if (fivemusic != null) {
            fivemusic.release();
            fivemusic = null;
            Toast.makeText(this, "Mediaplayer Five has been released", Toast.LENGTH_SHORT).show();

        } else if (sixmusic != null) {
            sixmusic.release();
            sixmusic = null;
            Toast.makeText(this, "Mediaplayer Six has been released", Toast.LENGTH_SHORT).show();
        } else if (sevenmusic != null) {
            sevenmusic.release();
            sevenmusic = null;
            Toast.makeText(this, "Mediaplayer Seven has been released", Toast.LENGTH_SHORT).show();
        } else if (eightmusic != null) {
            eightmusic.release();
            eightmusic = null;
            Toast.makeText(this, "Mediaplayer Eight has been released", Toast.LENGTH_SHORT).show();
        } else if (ninemusic != null) {
            ninemusic.release();
            ninemusic = null;
            Toast.makeText(this, "Mediaplayer Nine has been released", Toast.LENGTH_SHORT).show();
        }
    }

    @Override
    protected void onStop() {
        super.onStop();
        stopPlayer();
    }

}