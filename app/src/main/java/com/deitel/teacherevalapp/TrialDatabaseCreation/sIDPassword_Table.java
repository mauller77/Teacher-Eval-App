package com.deitel.teacherevalapp.TrialDatabaseCreation;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;

import com.deitel.teacherevalapp.data.DD;
import com.deitel.teacherevalapp.data.SQLDatabaseHelper;

/**
 * Created by josh on 12/1/16.
 */

public class sIDPassword_Table {

    public sIDPassword_Table(SQLiteDatabase db){

        ContentValues values = new ContentValues();
        values.put(DD.sIDPassword.COLUMN_STUDENT_ID,"1");
        values.put(DD.sIDPassword.COLUMN_PASSWORD,"a");

        db.insert(DD.sIDPassword.TABLE_NAME,null,values);





    }

}
