package com.haroon.newspointcentennial;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends Activity implements OnClickListener {

	private EditText userName;
	private EditText userPassword;
	private Button loginButton;
	//private Cursor users;
	private NewsPointDatabase db;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_login);
		initializeControls();
		initializeDatabase();
	}

	private void initializeDatabase() {
		db = new NewsPointDatabase(this);
		//users = db.getUsers(); // you would not typically call this on the main thread
	}

	private void initializeControls() {
		userName = (EditText) findViewById(R.id.userName);
		userPassword = (EditText) findViewById(R.id.userPassword);
		loginButton = (Button) findViewById(R.id.loginButton);
		loginButton.setOnClickListener(this);
	}

	@Override
	public void onClick(View v) {
		String enteredName = userName.getText().toString().trim();
		String enteredPassword = userPassword.getText().toString();
		
		Cursor user = db.getUserByUserName(enteredName);
		if (user != null && user.getCount() > 0) {
			String password = user.getString(user.getColumnIndex("password"));
			if (enteredPassword.equals(password)) {
				// Cache the user name 
				SharedPreferences preferences = getSharedPreferences("loginCredentials", MODE_PRIVATE);
				SharedPreferences.Editor editor = preferences.edit();
				editor.putString("userName", enteredName);
				editor.commit();
				
				Intent returnIntent = new Intent();
				returnIntent.putExtra("userName", enteredName);
				
				setResult(RESULT_OK, returnIntent);
				finish(); // close the activity 
			}
			else {
				Toast.makeText(this, "Login Failed: Wrong Password", Toast.LENGTH_SHORT).show();
			}
			user.close();
		}
		else {
			Toast.makeText(this, "Login Failed: User Name not Found", Toast.LENGTH_SHORT).show();
		}
	}
	
	@Override
	protected void onDestroy() {
		super.onDestroy();
		//users.close();
		db.close();
	}	
}
