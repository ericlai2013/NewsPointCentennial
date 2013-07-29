package com.haroon.newspointcentennial;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteQueryBuilder;

import com.readystatesoftware.sqliteasset.SQLiteAssetHelper;


///////////////////////////////////////////////////////////////////
// SQLiteAssetHelper Class
// see https://github.com/jgilfelt/android-sqlite-asset-helper
///////////////////////////////////////////////////////////////////

public class NewsPointDatabase extends SQLiteAssetHelper {
	
	private static final String DATABASE_NAME = "newspoint";
	private static final int DATABASE_VERSION = 1;
	
	public NewsPointDatabase(Context context) {
		super(context, DATABASE_NAME, null, DATABASE_VERSION);
		
		// you can use an alternate constructor to specify a database location 
		// (such as a folder on the sd card)
		// you must ensure that this folder is available and you have permission
		// to write to it
		//super(context, DATABASE_NAME, context.getExternalFilesDir(null).getAbsolutePath(), null, DATABASE_VERSION);
	}

	public Cursor getUsers() {

		SQLiteDatabase db = getReadableDatabase();
		SQLiteQueryBuilder qb = new SQLiteQueryBuilder();

		String [] sqlSelect = {"0 _id", "username", "password"}; 
		String sqlTables = "user";

		qb.setTables(sqlTables);
		Cursor c = qb.query(db, sqlSelect, null, null,
				null, null, null);

		if (c != null) {
			c.moveToFirst();
		}
		return c;

	}
	
	public Cursor getUserByUserName(String userName) {
	
		SQLiteDatabase db = getReadableDatabase();
		String sql = "SELECT * FROM user WHERE username='" + userName + "'";
		Cursor c = db.rawQuery(sql, null);
		
		if (c != null) {
			c.moveToFirst();
		}
		
		return c;
	}
}
