package com.example.joe.printedappfirst;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends Activity {

    private Button NewOrderChosen, ReviewOrderChosen;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        NewOrderChosen = (Button) findViewById(R.id.new_order_chosen);
        ReviewOrderChosen = (Button) findViewById(R.id.review_order_chosen);
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

    public void onNewOrderClick(View view) {
        String NewResponse = "You said new order";
        Toast.makeText(this, NewResponse, Toast.LENGTH_SHORT).show();
    }

    public void onReviewOrderClick(View view){
        String ReviewResponse = "You said review order";
        Toast.makeText(this, ReviewResponse, Toast.LENGTH_SHORT).show();
    }
}
