package com.example.pranavjayaraj.myappportfolio;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button1 = (Button) findViewById(R.id.button);
        Button button2 = (Button) findViewById(R.id.button2);
        Button button3 = (Button) findViewById(R.id.button3);
        Button button4 = (Button) findViewById(R.id.button4);
        Button button5 = (Button) findViewById(R.id.button5);
        Button button6 = (Button) findViewById(R.id.button6);
        button1.setOnClickListener(this);
        button2.setOnClickListener(this);
        button3.setOnClickListener(this);
        button4.setOnClickListener(this);
        button5.setOnClickListener(this);
        button6.setOnClickListener(this);
    }
    @Override
    public void onClick(View v) {
        int id = v.getId();
        final String text;
        Button button;

        switch (id) {
            case R.id.button:
                button = (Button) findViewById(R.id.button);
                text = "This button will launch my spotify streamer app";
                break;
            case R.id.button3:
                button = (Button) findViewById(R.id.button3);
                text = "This button will launch my scores app!";
                break;
            case R.id.button2:
                button = (Button) findViewById(R.id.button2);
                text = "This button will launch my library app!";
                break;
            case R.id.button4:
                button = (Button) findViewById(R.id.button4);
                text = "This button will launch my built It bigger app!";
                break;
            case R.id.button5:
                button = (Button) findViewById(R.id.button5);
                text = "This button will launch my XYZ Reader app!";
                break;
            case R.id.button6:
                button = (Button) findViewById(R.id.button6);
                text = "This button will launch my Capstone app!";
                break;
            default:
                button = (Button) findViewById(R.id.button);

                text = null;
        }
        Toast.makeText(MainActivity.this, text, Toast.LENGTH_LONG).show();

                    }

                        @Override
                        public boolean onCreateOptionsMenu(Menu menu) {
                            // Inflate the menu; this adds items to the action bar if it is present.
                            getMenuInflater().inflate(R.menu.menu_main, menu);
                            return true;
                        }

                        @Override
                        public boolean onOptionsItemSelected(MenuItem item) {
                            // Handle action bar item clicks here. The action bar will
                            // automatically handle clicks on the Home/Up button, so long
                            // as you specify a parent activity in AndroidManifest.xml.
                            int id = item.getItemId();

                            //noinspection SimplifiableIfStatement
                            if (id == R.id.action_settings) {
                                return true;
                            }

                            return super.onOptionsItemSelected(item);
                        }
                    }