package com.bee.datingapp;

import static com.bee.datingapp.R.*;
import static com.bee.datingapp.R.array.labels_array;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.Switch;
import android.widget.Toast;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;


public class updatingprofile extends AppCompatActivity implements AdapterView.OnItemSelectedListener{
    private static final String FILE_NAME = "profilename.txt";
    private static final String FILE_NAME2 = "profileage.txt";
    private static final String FILE_NAME3 = "profilegender.txt";
    private static final String FILE_NAME4 = "profilephone.txt";
    private static final String FILE_NAME5 = "profilelocation.txt";

    EditText _editprofilename, _editprofileage, _editprofilegender, _editprofilephone, _editprofilelocation;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(layout.activity_updatingprofile);
        _editprofilename = findViewById(id.editprofilename);
        _editprofileage = findViewById(id.editprofileage);
        _editprofilegender = findViewById(id.editprofilegender);
        _editprofilephone = findViewById(id.editprofilephone);
        _editprofilelocation = findViewById(id.editprofilelocation);

        Spinner spinner = findViewById(id.label_spinner);
        if (spinner != null) {
            spinner.setOnItemSelectedListener(this);
        }

        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, labels_array, android.R.layout.simple_spinner_item);

        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        if (spinner != null) {
            spinner.setAdapter(adapter);
        }



    }

    public void save(View v) {
        String text = _editprofilename.getText().toString();
        String text2 = _editprofileage.getText().toString();
        String text3 = _editprofilegender.getText().toString();
        String text4 = _editprofilephone.getText().toString();
        String text5 = _editprofilelocation.getText().toString();
        FileOutputStream fos = null;

        try {
            fos = openFileOutput(FILE_NAME, MODE_PRIVATE);
            fos.write(text.getBytes());

            _editprofilename.getText().clear();
            Toast.makeText(this, "Saved to" + getFilesDir() + "/" + FILE_NAME, Toast.LENGTH_LONG).show();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fos != null) {
                try {
                    fos.close();
                } catch (IOException e) {
                    throw new RuntimeException();
                }
            }
        }
        try {
            fos = openFileOutput(FILE_NAME2, MODE_PRIVATE);
            fos.write(text2.getBytes());

            _editprofileage.getText().clear();
            Toast.makeText(this, "Saved to" + getFilesDir() + "/" + FILE_NAME2, Toast.LENGTH_LONG).show();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fos != null) {
                try {
                    fos.close();
                } catch (IOException e) {
                    throw new RuntimeException();
                }
            }
        }
        try {
            fos = openFileOutput(FILE_NAME3, MODE_PRIVATE);
            fos.write(text3.getBytes());

            _editprofilegender.getText().clear();
            Toast.makeText(this, "Saved to" + getFilesDir() + "/" + FILE_NAME3, Toast.LENGTH_LONG).show();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fos != null) {
                try {
                    fos.close();
                } catch (IOException e) {
                    throw new RuntimeException();
                }
            }
        }
        try {
            fos = openFileOutput(FILE_NAME4, MODE_PRIVATE);
            fos.write(text4.getBytes());

            _editprofilephone.getText().clear();
            Toast.makeText(this, "Saved to" + getFilesDir() + "/" + FILE_NAME4, Toast.LENGTH_LONG).show();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fos != null) {
                try {
                    fos.close();
                } catch (IOException e) {
                    throw new RuntimeException();
                }
            }
        }
        try {
            fos = openFileOutput(FILE_NAME5, MODE_PRIVATE);
            fos.write(text5.getBytes());

            _editprofilelocation.getText().clear();
            Toast.makeText(this, "Saved to" + getFilesDir() + "/" + FILE_NAME5, Toast.LENGTH_LONG).show();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fos != null) {
                try {
                    fos.close();
                } catch (IOException e) {
                    throw new RuntimeException();
                }
            }
        }
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
//        Spinner spinner = findViewById(id.label_spinner);
//        if (spinner != null) {
//            spinner.setOnItemSelectedListener(this);
//        }
//
//        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, labels_array, android.R.layout.simple_spinner_item);
//
//        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
//
//        if (spinner != null) {
//            spinner.setAdapter(adapter);
//        }

    }



    @Override
    public void onPointerCaptureChanged(boolean hasCapture) {
        super.onPointerCaptureChanged(hasCapture);
    }

    @SuppressLint("ResourceType")
    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
        switch (i) {
            case 0: _editprofilelocation.getText(); break;
            case 1: _editprofilelocation.setText("Abra"); break;
            case 2: _editprofilelocation.setText("Agusan Del Norte"); break;
            case 3: _editprofilelocation.setText("Agusan Del Sur"); break;
            case 4: _editprofilelocation.setText("Aklan"); break;
            case 5: _editprofilelocation.setText("Albay"); break;
            case 6: _editprofilelocation.setText("Antique"); break;
            case 7: _editprofilelocation.setText("Apayao"); break;
            case 8: _editprofilelocation.setText("Aurora"); break;
            case 9: _editprofilelocation.setText("Basilan"); break;
            case 10: _editprofilelocation.setText("Bataan"); break;
            case 11: _editprofilelocation.setText("Batanes"); break;
            case 12: _editprofilelocation.setText("Batangas"); break;
            case 13: _editprofilelocation.setText("Benguet"); break;
            case 14: _editprofilelocation.setText("Biliran"); break;
            case 15: _editprofilelocation.setText("Bohol"); break;
            case 16: _editprofilelocation.setText("Bukidnon"); break;
            case 17: _editprofilelocation.setText("Bulacan"); break;
            case 18: _editprofilelocation.setText("Cagayan"); break;
            case 19: _editprofilelocation.setText("Camarines Norte"); break;
            case 20: _editprofilelocation.setText("Camarines Sur"); break;
            case 21: _editprofilelocation.setText("Camigin"); break;
            case 22: _editprofilelocation.setText("Capis"); break;
            case 23: _editprofilelocation.setText("Catanduanes"); break;
            case 24: _editprofilelocation.setText("Cavite"); break;
            case 25: _editprofilelocation.setText("Cebu"); break;
            case 26: _editprofilelocation.setText("Cotabato"); break;
            case 27: _editprofilelocation.setText("Davao De Oro"); break;
            case 28: _editprofilelocation.setText("Davao Del Norte"); break;
            case 29: _editprofilelocation.setText("Eastern Samar"); break;
            case 30: _editprofilelocation.setText("Isabella"); break;
            case 31: _editprofilelocation.setText("La Union"); break;
            case 32: _editprofilelocation.setText("Leyte"); break;
            case 33: _editprofilelocation.setText("Maguindanao Del Norte"); break;
            case 34: _editprofilelocation.setText("Masbate"); break;
            case 35: _editprofilelocation.setText("Negros Ocidental"); break;
            case 36: _editprofilelocation.setText("Nueva Ecijia"); break;
            case 37: _editprofilelocation.setText("Ocidental Mindoro"); break;
            case 38: _editprofilelocation.setText("Palawan"); break;
            case 39: _editprofilelocation.setText("Pampanga"); break;
            case 40: _editprofilelocation.setText("Quirino"); break;
            case 41: _editprofilelocation.setText("Rizal"); break;
            case 42: _editprofilelocation.setText("Sorsogon"); break;
            case 43: _editprofilelocation.setText("Sulu"); break;
            case 44: _editprofilelocation.setText("Tarlac"); break;
            case 45: _editprofilelocation.setText("Zambales"); break;
            case 46: _editprofilelocation.setText("Zamboanga"); break;
        }
    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {



    }

    public void radioclick(View view) {
        boolean checked = ((RadioButton) view).isChecked();

        switch (view.getId()) {
            case id.radioButton:
                if (checked)
                    _editprofilegender.setText("Male");
                    Toast.makeText(this, "Male", Toast.LENGTH_SHORT).show(); break;
            case id.radioButton2:
                if (checked)
                    _editprofilegender.setText("Female");
                    Toast.makeText(this, "Female", Toast.LENGTH_SHORT).show(); break;
            case id.radioButton3:
                if (checked)
                    _editprofilegender.setText("Non-Binary");
                    Toast.makeText(this, "Non-Binary", Toast.LENGTH_SHORT).show(); break;
            default:
                break;

        }

    }
}
