package com.deitel.teacherevalapp.TrialDatabaseCreation;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import com.deitel.teacherevalapp.data.DD;

/**
 * Created by Josh on 12/4/2016.
 */

public class EvaluationTable {

    public EvaluationTable(SQLiteDatabase sqLiteDatabase){

        Cursor c = sqLiteDatabase.rawQuery("SELECT * FROM " + DD.evaluationTable.TABLE_NAME,null);






    }



}
