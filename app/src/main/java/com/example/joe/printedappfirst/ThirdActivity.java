package com.example.joe.printedappfirst;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;

import java.util.ArrayList;


public class ThirdActivity extends Activity {

    private static EditText NumberOfGarments;
    private static CheckBox GarmentChecker;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);

        final ArrayList[] NoOfGarmentTexts = {};

        NumberOfGarments = (EditText) findViewById(R.id.number_of_garments);
        final Integer NoOfGarments = Integer.parseInt(String.valueOf(NumberOfGarments)); //This is to convert input from string to an int
        GarmentChecker.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        for (int GarmentCount = 1; GarmentCount <= NoOfGarments; GarmentCount++) {
                            NoOfGarmentTexts[GarmentCount] = new ArrayList(); // This doesn't work
                        }
                    }
                }
        );

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_third, menu);
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
