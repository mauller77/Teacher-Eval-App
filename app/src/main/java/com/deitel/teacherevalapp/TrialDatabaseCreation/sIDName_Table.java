package com.deitel.teacherevalapp.TrialDatabaseCreation;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;

import com.deitel.teacherevalapp.data.DD;

/**
 * Created by josh on 12/1/16.
 */

public class sIDName_Table {


    public sIDName_Table(SQLiteDatabase db){

        ContentValues values = new ContentValues();
        values.put(DD.sIDName.COLUMN_STUDENT_ID,"1");
        values.put(DD.sIDName.COLUMN_NAME,"Josh");

        db.insert(DD.sIDName.TABLE_NAME,null,values);





    }



}
