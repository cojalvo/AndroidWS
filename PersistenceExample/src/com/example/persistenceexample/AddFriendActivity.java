package com.example.persistenceexample;

import Common.AppConst;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.text.Editable;
import android.view.View;
import android.widget.EditText;

public class AddFriendActivity extends Activity
{
	
	private EditText nameEt;
	private EditText phoneEt;
	@Override
	public void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_add);
		nameEt = (EditText) findViewById(R.id.editTextName);
		phoneEt = (EditText) findViewById(R.id.editTextPhone);
	}
	
    public void okClicked(View v)
    {
    	if(nameEt == null || phoneEt == null) return;
    	String name = nameEt.getText().toString();
    	String phone = phoneEt.getText().toString();
    	// Prepare data intent 
    	  Intent data = new Intent();
    	  data.putExtra(AppConst.ExtrasFriendName, name);
    	  data.putExtra(AppConst.ExtrasFriendPhone,phone);
    	  // Activity finished ok, return the data
    	  setResult(RESULT_OK, data);
    	  finish(); 
    }
	

}
