package com.sabututxp.bcspreparationassistant.Database;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import com.sabututxp.bcspreparationassistant.Model.SubjectsCatagory;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by s on 8/20/17.
 */

public class DatabaseHelper extends SQLiteOpenHelper{

    public static final String DBNAME = "bcsstudies.db";
    public static final String DBLOCATION = "/data/data/com.sabututxp.bcspreparationassistant/databases/";
    private Context mContext;
    private SQLiteDatabase mDatabase;
    public DatabaseHelper(Context context) {
        super(context, DBNAME, null, 1);
        this.mContext = context;
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }

    public void openDatabase() {
        String dbPath = mContext.getDatabasePath(DBNAME).getPath();
        if (mDatabase != null && mDatabase.isOpen()) {
            return;
        }
        mDatabase = SQLiteDatabase.openDatabase(dbPath, null, SQLiteDatabase.OPEN_READWRITE);
    }

    public void closeDatabase() {
        if (mDatabase != null) {
            mDatabase.close();
        }
    }

    public List<SubjectsCatagory> getAllCategoryList(){
        SubjectsCatagory subjectsCatagory = null;
        List<SubjectsCatagory> subjectsCatagoryList = new ArrayList<>();
        openDatabase();
        Cursor cursor = mDatabase.rawQuery("SELECT * FROM subjects",null);
        cursor.moveToFirst();
        while (!cursor.isAfterLast()){
            subjectsCatagory = new SubjectsCatagory(cursor.getInt(0),cursor.getString(1));
            subjectsCatagoryList.add(subjectsCatagory);
            cursor.moveToNext();
        }
        cursor.close();
        closeDatabase();
        return subjectsCatagoryList;
    }

}

