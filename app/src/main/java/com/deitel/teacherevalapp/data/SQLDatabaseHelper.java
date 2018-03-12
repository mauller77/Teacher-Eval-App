package com.deitel.teacherevalapp.data;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;


public class SQLDatabaseHelper extends SQLiteOpenHelper {
    private static final String DATABASE_NAME = "Students1.db";
    private static final int DATABASE_VERSION = 1;

    // constructor
    public SQLDatabaseHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);

    }

    // creates the student table when the database is created
    @Override
    public void onCreate(SQLiteDatabase db) {


        //SQL for creating the contacts table
        final String CREATE_STUDENT_PASSWORD_TABLE =
                "CREATE TABLE SIDPassword(StudentID TEXT primary key, Password TEXT);";

        final String CREATE_STUDENT_SID_NAME_TABLE =
                "Create Table " + DD.sIDName.TABLE_NAME + "(" +
                        DD.sIDName.COLUMN_STUDENT_ID + " integer, "+
                        DD.sIDName.COLUMN_NAME + " smallint);";

        final String CREATE_SID_CID_TABLE =
                "Create Table "+DD.sIDCID.TABLE_NAME +"(" +
                        DD.sIDCID.COLUMN_STUDENT_ID + " integer,"+
                        DD.sIDCID.COLUMN_CID+" smallint);";

        final String CREATE_CID_COURSES_IID_TABLE =
                "Create Table "+ DD.cIDCoursesIID.TABLE_NAME + "("+
                        DD.cIDCoursesIID.COLUMN_CID + " smallint,"+
                        DD.cIDCoursesIID.COLUMN_COURSE + " varchar(20), " +
                        DD.cIDCoursesIID.COLUMN_IID + " smallint );";

        final String CREATE_IID_NAME_TABLE =
                "Create Table " + DD.iIDName.TABLE_NAME +"("+
                        DD.iIDName.COLUMN_INSTRUCTOR_ID + " smallint ,"+
                        DD.iIDName.COLUMN_NAME + " varchar(20));";

        final String CREATE_EVALUATION_TABLE= "Create Table " + DD.evaluationTable.TABLE_NAME + "(" +
                DD.evaluationTable.SID_COLUMN + " smallint, " +
                DD.evaluationTable.CID_COLUMN + " smallint, " +
                DD.evaluationTable.IID_COLUMN + " smallint, " +
                DD.evaluationTable.EVAL_COLUMN + " integer);";

        db.execSQL(CREATE_STUDENT_PASSWORD_TABLE);
        db.execSQL(CREATE_STUDENT_SID_NAME_TABLE);
        db.execSQL(CREATE_SID_CID_TABLE);
        db.execSQL(CREATE_CID_COURSES_IID_TABLE);
        db.execSQL(CREATE_IID_NAME_TABLE);// create the contacts table
        db.execSQL(CREATE_EVALUATION_TABLE);

        Log.e("sqldbh","on create method" + "Database Version: " + DATABASE_VERSION);


    }

    // normally defines how to upgrade the database when the schema changes
    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {


        //SQL for creating the contacts table
        final String CREATE_STUDENT_PASSWORD_TABLE =
                "CREATE TABLE SIDPassword(StudentID TEXT primary key, Password TEXT);";

        final String CREATE_STUDENT_SID_NAME_TABLE =
                "Create Table " + DD.sIDName.TABLE_NAME + "(" +
                        DD.sIDName.COLUMN_STUDENT_ID + " integer, "+
                        DD.sIDName.COLUMN_NAME + " smallint);";

        final String CREATE_SID_CID_TABLE =
                "Create Table "+DD.sIDCID.TABLE_NAME +"(" +
                        DD.sIDCID.COLUMN_STUDENT_ID + " integer,"+
                        DD.sIDCID.COLUMN_CID+" smallint);";

        final String CREATE_CID_COURSES_IID_TABLE =
                "Create Table "+ DD.cIDCoursesIID.TABLE_NAME + "("+
                        DD.cIDCoursesIID.COLUMN_CID + " smallint,"+
                        DD.cIDCoursesIID.COLUMN_COURSE + " varchar(20), " +
                        DD.cIDCoursesIID.COLUMN_IID + " smallint );";

        final String CREATE_IID_NAME_TABLE =
                "Create Table " + DD.iIDName.TABLE_NAME +"("+
                        DD.iIDName.COLUMN_INSTRUCTOR_ID + " smallint ,"+
                        DD.iIDName.COLUMN_NAME + " varchar(20));";

        final String CREATE_EVALUATION_TABLE= "Create Table " + DD.evaluationTable.TABLE_NAME + "(" +
                DD.evaluationTable.SID_COLUMN + " smallint, " +
                DD.evaluationTable.CID_COLUMN + " smallint, " +
                DD.evaluationTable.IID_COLUMN + " smallint, " +
                DD.evaluationTable.EVAL_COLUMN + " integer);";

        db.execSQL(CREATE_STUDENT_PASSWORD_TABLE);
        db.execSQL(CREATE_STUDENT_SID_NAME_TABLE);
        db.execSQL(CREATE_SID_CID_TABLE);
        db.execSQL(CREATE_CID_COURSES_IID_TABLE);
        db.execSQL(CREATE_IID_NAME_TABLE);// create the contacts table
        db.execSQL(CREATE_EVALUATION_TABLE);



        Log.e("sqldbh","update method " + "Database Version: " + DATABASE_VERSION + " Old Database: " + oldVersion + "New Version: " + newVersion);

    }
}
