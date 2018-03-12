package com.deitel.teacherevalapp.TrialDatabaseCreation;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;

import com.deitel.teacherevalapp.data.DD;

/**
 * Created by josh on 12/1/16.
 */

public class cIDCoursesIID_Table {
    public cIDCoursesIID_Table(SQLiteDatabase db){
        ContentValues values = new ContentValues();

        values.put(DD.cIDCoursesIID.COLUMN_CID,"123");
        values.put(DD.cIDCoursesIID.COLUMN_COURSE,"Calculus");
        values.put(DD.cIDCoursesIID.COLUMN_IID,"0");

        db.insert(DD.cIDCoursesIID.TABLE_NAME,null,values);

        ContentValues values1 = new ContentValues();
        values1.put(DD.cIDCoursesIID.COLUMN_CID,"456");
        values1.put(DD.cIDCoursesIID.COLUMN_COURSE,"Psychology");
        values1.put(DD.cIDCoursesIID.COLUMN_IID,"1");

        db.insert(DD.cIDCoursesIID.TABLE_NAME,null,values1);

        ContentValues values2 = new ContentValues();
        values2.put(DD.cIDCoursesIID.COLUMN_CID,"789");
        values2.put(DD.cIDCoursesIID.COLUMN_COURSE,"English");
        values2.put(DD.cIDCoursesIID.COLUMN_IID,"2");


        db.insert(DD.cIDCoursesIID.TABLE_NAME,null,values2);
    }
}
