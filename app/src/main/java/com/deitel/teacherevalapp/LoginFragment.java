package com.deitel.teacherevalapp;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.v4.app.FragmentTransaction;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


//import database creation classes
import com.deitel.teacherevalapp.DatabaseQueries.PasswordAuthentication;


import com.deitel.teacherevalapp.TrialDatabaseCreation.EvaluationTable;
import com.deitel.teacherevalapp.TrialDatabaseCreation.cIDCoursesIID_Table;
import com.deitel.teacherevalapp.TrialDatabaseCreation.iIDName_Table;
import com.deitel.teacherevalapp.TrialDatabaseCreation.sIDCID_Table;
import com.deitel.teacherevalapp.TrialDatabaseCreation.sIDName_Table;
import com.deitel.teacherevalapp.TrialDatabaseCreation.sIDPassword_Table;
import com.deitel.teacherevalapp.data.SQLDatabaseHelper;



public class LoginFragment extends Fragment implements View.OnClickListener{

    Bundle bundle;

    private EditText sIDEditText;
    private EditText passwordEditText;
    private Button s;
    private CoursesFragment coursesFragment;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        super.onCreateView(inflater,container,savedInstanceState);

        View view = inflater.inflate(R.layout.login_fragment,container,false);
        s = (Button)view.findViewById(R.id.submitButton);
        s.setOnClickListener(this);

        sIDEditText = (EditText) view.findViewById(R.id.netIDEditText);
        passwordEditText = (EditText) view.findViewById(R.id.passwordEditText);



        SQLDatabaseHelper sqlDatabaseHelper = new SQLDatabaseHelper(getContext());
        SQLiteDatabase sqLiteDatabase = sqlDatabaseHelper.getWritableDatabase();

        //create the example tables
        new EvaluationTable(sqLiteDatabase);
        new sIDPassword_Table(sqLiteDatabase);
        new iIDName_Table(sqLiteDatabase);
        new sIDCID_Table(sqLiteDatabase);
        new cIDCoursesIID_Table(sqLiteDatabase);
        new sIDName_Table(sqLiteDatabase);


        Cursor c = sqLiteDatabase.rawQuery("SELECT name FROM sqlite_master WHERE type='table'", null);

        if (c.moveToFirst()) {
            while ( !c.isAfterLast() ) {
                Log.e("LF",c.getString(0));
                c.moveToNext();
            }
        }




        return view;
    }


    @Override
    public void onClick(View v) {


        bundle = new Bundle();

        String studentID =sIDEditText.getText().toString();
        String password = passwordEditText.getText().toString();



        SQLDatabaseHelper databaseHelper = new SQLDatabaseHelper(getContext());

        SQLiteDatabase db = databaseHelper.getReadableDatabase();

        PasswordAuthentication passwordAuthentication = new PasswordAuthentication(db,studentID);

        String dbPassword = passwordAuthentication.getPassword();


        if (password.equals(dbPassword)){

            FragmentTransaction fragmentTransaction = getFragmentManager().beginTransaction();


            bundle.putString("0",studentID);

            coursesFragment = new CoursesFragment();
            coursesFragment.setArguments(bundle);
            fragmentTransaction.remove(this);
            fragmentTransaction.add(this.getId(),coursesFragment);
            fragmentTransaction.addToBackStack(null);
            fragmentTransaction.commit();


        }else{

            Toast.makeText(getActivity(),"Wrong Password",Toast.LENGTH_LONG).show();
        }



    Log.e("LF","logged and got through the click view");


    }





}
