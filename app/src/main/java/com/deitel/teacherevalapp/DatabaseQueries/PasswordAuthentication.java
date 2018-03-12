package com.deitel.teacherevalapp.DatabaseQueries;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;

import com.deitel.teacherevalapp.data.DD;

import java.util.ArrayList;

/**
 * Created by josh on 12/1/16.
 */

public class PasswordAuthentication {

    String password;


    public PasswordAuthentication(SQLiteDatabase sql,String id){


        Cursor cursor = sql.rawQuery("select * from " + DD.sIDPassword.TABLE_NAME, null);
        ArrayList<String> idList = new ArrayList<>();
        ArrayList<String> passwordList = new ArrayList<>();



        while(cursor.moveToNext()){

            idList.add(cursor.getString(0));
            passwordList.add(cursor.getString(1));
        }




        for(int i = 0; i < idList.size(); i++){


            if (idList.get(i).equals(id)){

                password=passwordList.get(i);
            }
        }



    }

    public String getPassword(){
        return password;
    }

}
