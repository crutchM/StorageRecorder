package com.example.storage_recorder.DB

import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper

class DbHelper(context: Context?, private val name: String) : SQLiteOpenHelper(context, name, null, 1) {
    override fun onCreate(db: SQLiteDatabase?) {
        db!!.execSQL("CREATE TABLE $name (" +
                "id number primary key autoincrement," +
                "name varchar not null," +
                "count number not null," +
                "type varchar not null" +
                "url varchar" +
                ")")
    }

    override fun onUpgrade(db: SQLiteDatabase?, oldVersion: Int, newVersion: Int) {
    }
}