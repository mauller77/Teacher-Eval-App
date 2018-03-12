package com.deitel.teacherevalapp.TrialDatabaseCreation;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;

import com.deitel.teacherevalapp.data.DD;

/**
 * Created by josh on 12/1/16.
 */

public class iIDName_Table {

    public iIDName_Table(SQLiteDatabase db){

        ContentValues values = new ContentValues();
        values.put(DD.iIDName.COLUMN_INSTRUCTOR_ID,"0");
        values.put(DD.iIDName.COLUMN_NAME,"Zach");
        db.insert(DD.iIDName.TABLE_NAME,null,values);

        ContentValues values1 = new ContentValues();
        values1.put(DD.iIDName.COLUMN_INSTRUCTOR_ID,"1");
        values1.put(DD.iIDName.COLUMN_NAME,"Jeff");
        db.insert(DD.iIDName.TABLE_NAME,null,values1);

        ContentValues values2 = new ContentValues();
        values2.put(DD.iIDName.COLUMN_INSTRUCTOR_ID,"2");
        values2.put(DD.iIDName.COLUMN_NAME,"Juan");
        db.insert(DD.iIDName.TABLE_NAME,null,values2);



    }

}
