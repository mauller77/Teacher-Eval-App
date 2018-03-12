package com.deitel.teacherevalapp.TrialDatabaseCreation;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;

import com.deitel.teacherevalapp.data.DD;

/**
 * Created by josh on 12/1/16.
 */

public class sIDCID_Table {

    public sIDCID_Table(SQLiteDatabase db){

        ContentValues values = new ContentValues();
        values.put(DD.sIDCID.COLUMN_STUDENT_ID,"1");
        values.put(DD.sIDCID.COLUMN_CID,"123 456 789");


        db.insert(DD.sIDCID.TABLE_NAME,null,values);

        Log.e(DD.sIDCID.TABLE_NAME,"table created with values: " + values);

    }
}
