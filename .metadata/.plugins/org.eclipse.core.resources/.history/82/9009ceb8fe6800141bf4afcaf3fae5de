package com.example.intentexample;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;


public class MainActivity extends Activity {
	
	private  final String TAG = "MainActivity";
	private EditText searchEt;
	private EditText startActivityEt;
	private final  String baseSearchUrl = "http://www.google.com/#q=%s";
	public final static String EXTRA_MESSAGE = "il.ac.shenkar.MESSAGE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        searchEt  = (EditText) findViewById(R.id.editTextSearch);
        startActivityEt = (EditText) findViewById(R.id.editTextStartActivity);
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
    
    public void  searchClicked(View v) 
    {
    	Log.i(TAG, "searchClicked was called");
		String toSerach = String.format(baseSearchUrl,searchEt.getText());
		Uri uri = Uri.parse(toSerach);
		//Implicit intent 
		startActivity(new Intent(Intent.ACTION_VIEW, uri));
	}
    
    public void  startAcivityClicked(View v) 
    {
    	Log.i(TAG, "startAcivityClicked was called");
		String dataToPass = startActivityEt.getText().toString();
		//Explicit intent.
		Intent  i = new Intent(this,SecondActivity.class);
		i.putExtra(EXTRA_MESSAGE, dataToPass);
		//Start the activity
		startActivity(i);
	} 
}
