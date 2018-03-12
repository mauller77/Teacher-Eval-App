package com.deitel.teacherevalapp.DatabaseQueries;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import com.deitel.teacherevalapp.data.DD;

import java.util.ArrayList;

/**
 * Created by josh on 12/1/16.
 */

public class GetCourses {


    String cID;

    public GetCourses(SQLiteDatabase db,String studentID){


        Cursor cursor = db.rawQuery("select * from [" + DD.sIDCID.TABLE_NAME + "]",null);
        ArrayList<String> studentIDList = new ArrayList<>();
        ArrayList<String> coursesList = new ArrayList<>();

        while(cursor.moveToNext()){

            studentIDList.add(cursor.getString(0));
            coursesList.add(cursor.getString(1));

        }




        for(int i = 0; i < studentIDList.size(); i++){


            if (studentIDList.get(i).equals(studentID)){

                cID=coursesList.get(i);
            }
        }






    }

    public String getCourseID(){


        return cID;
    }



}
