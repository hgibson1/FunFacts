package com.example.vegilicious.funfacts;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;
//primitive data types begin with lowercase, Objects with uppercase


public class MainActivity extends Activity {

    public static final String TAG = MainActivity.class.getSimpleName();
    //returns the string class mane of MainActivity and saves in unchangeable String value

    private FactList factList = new FactList();
    //new class creates a default constuctor
    private ColorWheel colorWheel = new ColorWheel();

    @Override
    protected void onCreate(Bundle savedInstanceState) { //method format
        super.onCreate(savedInstanceState); //breakpoint
        setContentView(R.layout.activity_main); //how to call a method

        //declaring view varibles and assign views from layout file. "Final" means textview can't be reassigned
        final TextView factLabel = (TextView) findViewById(R.id.textView2); //must refer to ID through generated resource class
        final Button showFactButton = (Button) findViewById(R.id.button); //returns view must be downcast
        final RelativeLayout layout = (RelativeLayout) findViewById(R.id.layoutID);
        View.OnClickListener buttonPressed = new View.OnClickListener() {
            @Override
            public void onClick(View view){ //code needed to create a new clickListener object
            //code that runs when a click is detected. Changes the text in the fact label
            String fact = factList.returnFact();
            int color = colorWheel.returnColor();
            layout.setBackgroundColor(color);
            showFactButton.setTextColor(color);
            factLabel.setText(fact);
            Log.d(TAG, "Button was pressed"); //android log
            }
        };

        showFactButton.setOnClickListener(buttonPressed); //sets button to respond to clicks. Accepts a
        //ClickListener as a parameter
        Toast.makeText(this, "Activity successfully created!", Toast.LENGTH_LONG).show(); //this = "This activity" or context
        //Toast.LENGTH_LONG is a system constant/standard representing duration toast int value miliseconds
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}

/*DDMS:  Delvic Debug Monitor Server. Debugger that is run along with app to monitor. Set breakpoints
* where the DDMS will break out of normal computation and wait for instructions. Use bug
* icon instead of run button. Will stop running at breakpoint. Step over = steps to next line
* step into = goes into method (ex. into "onCreate" method of "Super" class.
* Step out = automatically go to end of current method.
To enable USB Debugging on andriod tablet:
phone settings -> about phone -> developer outions -> check usb debugging*/