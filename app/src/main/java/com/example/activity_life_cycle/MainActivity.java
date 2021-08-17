package com.example.activity_life_cycle;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toast.makeText(getApplicationContext(), "onCreate Called", Toast.LENGTH_LONG).show();
        Log.d("lifecycle","onCreate invoked");
    }

    /** Called when the activity is about to become visible. */
    protected void onStart() {
        // It will show a message on the screen
        // then onStart is invoked
        super.onStart();
        Toast.makeText(getApplicationContext(), "onStart Called", Toast.LENGTH_LONG).show();
        Log.d("lifecycle","onStart invoked");
    }

    /** Called when the activity has become visible. */
    protected void onResume() {
        // It will show a message on the screen
        // then onResume is invoked
        super.onResume();
        Toast.makeText(getApplicationContext(), "onResume Called", Toast.LENGTH_LONG).show();
        Log.d("lifecycle","onResume invoked");
    }

    /** Called when another activity is taking focus. */
    protected void onPause() {
        // It will show a message on the screen
        // then onPause is invoked
        super.onPause();
        Toast.makeText(getApplicationContext(), "onPause Called", Toast.LENGTH_LONG).show();
        Log.d("lifecycle","onPause invoked");
    }

    protected void onRestart() {
        // It will show a message on the screen
        // then onRestart is invoked
        super.onRestart();
        Toast.makeText(getApplicationContext(), "onRestart Called", Toast.LENGTH_LONG).show();
        Log.d("lifecycle","onRestart invoked");
    }


    /** Called when the activity is no longer visible. */
    protected void onStop() {
        // It will show a message on the screen
        // then onStop is invoked
        super.onStop();
        Toast.makeText(getApplicationContext(), "onStop Called", Toast.LENGTH_LONG).show();
        Log.d("lifecycle","onStop invoked");
    }

    /** Called just before the activity is destroyed. */
    protected void onDestroy() {
        // It will show a message on the screen
        // then onDestroy is invoked
        super.onDestroy();
        Toast.makeText(getApplicationContext(), "onDestroy Called", Toast.LENGTH_LONG).show();
        Log.d("lifecycle","onDestroy invoked");
    }
}