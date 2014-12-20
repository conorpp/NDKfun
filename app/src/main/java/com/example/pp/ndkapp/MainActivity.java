package com.example.pp.ndkapp;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

public class MainActivity extends ActionBarActivity {

    String libName = "singer"; // the module name of the library, without .so
    public native String stringFromJNI();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        System.loadLibrary( libName );
        Log.d("Test", stringFromJNI());
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView tit = (TextView)findViewById(R.id.textTitle);
        tit.setText(stringFromJNI());
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
