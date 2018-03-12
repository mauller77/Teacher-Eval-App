package com.deitel.teacherevalapp.DatabaseQueries;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.support.annotation.NonNull;
import android.util.Log;

import com.deitel.teacherevalapp.data.DD;
import com.deitel.teacherevalapp.data.SQLDatabaseHelper;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/**
 * Created by Josh on 12/2/2016.
 */

public class CourseNameAndInstructor {

    String displayCourseID;
    String displayCourseName;
    String displayCourseProfessor;
    String instructorID;
    ArrayList<String> display = new ArrayList<>();


    public CourseNameAndInstructor(String [] courses,SQLiteDatabase db){


        //searching to find the course name and the instructor id
        Cursor cursor = db.rawQuery("SELECT * FROM " + DD.cIDCoursesIID.TABLE_NAME,null);
        ArrayList<String> cid = new ArrayList<>();
        ArrayList<String> courseName = new ArrayList<>();
        ArrayList<String> iid = new ArrayList<>();
       cursor.moveToFirst();

        while (!cursor.isAfterLast()){
            cid.add(cursor.getString(0));
            courseName.add(cursor.getString(1));
            iid.add(cursor.getString(2));
            cursor.moveToNext();
        }

        Log.e("CNAI","cid size is  " + cid.size());



        //searching to find the instructor name
        Cursor instructorCursor = db.rawQuery("SELECT * FROM "+ DD.iIDName.TABLE_NAME,null);
        ArrayList<String> instructorNameArrayList = new ArrayList<>();
        ArrayList<String> instructorIdentification = new ArrayList<>();
        instructorCursor.moveToFirst();

        while (!instructorCursor.isAfterLast()){
            instructorIdentification.add(instructorCursor.getString(0));
            instructorNameArrayList.add(instructorCursor.getString(1));
            instructorCursor.moveToNext();
        }




        int displayCounter=0;
        for (int k = 0;k<3;k++) {

            String c = courses[k];
            Log.e("CNAI",c);



            for (int i = 0; i < cid.size(); i++) {

                Log.e("CNAI",c + " is being compared to " + cid.get(i));
                if (c.equals(cid.get(i))){



                    displayCourseID = cid.get(i);
                    displayCourseName = courseName.get(i);
                    instructorID = iid.get(i);

                    Log.e("CNAI",displayCourseID + " equals " + cid.get(i));
                    Log.e("CNAI",displayCourseName + " equals " + courseName.get(i));
                    Log.e("CNAI",instructorID + " equals " + iid.get(i));


                    for (int j=0;j<instructorIdentification.size();j++){
                        if (instructorID.equals(instructorIdentification.get(j))){
                            displayCourseProfessor = instructorNameArrayList.get(j);
                            Log.e("CNAI",displayCourseProfessor +" equals " +instructorNameArrayList.get(j));

                        }
                    }

                    String displayString = displayCourseID + " " + displayCourseName + " " + displayCourseProfessor;
                    Log.e("CNAI","At position " + displayCounter + "the value is " + displayString);

                    display.add(displayCounter,displayString);



                }

                Log.e("CNAI","through the first course id");

            }

            Log.e("CNAI",Integer.toString(displayCounter));
            displayCounter++;
        }











    }

   public ArrayList<String> getDisplayCourses(){

       return display;
   }


}
