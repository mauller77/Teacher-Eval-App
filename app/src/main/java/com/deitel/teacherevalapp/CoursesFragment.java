package com.deitel.teacherevalapp;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import com.deitel.teacherevalapp.DatabaseQueries.CourseNameAndInstructor;
import com.deitel.teacherevalapp.DatabaseQueries.GetCourses;
import com.deitel.teacherevalapp.data.SQLDatabaseHelper;

import java.util.ArrayList;

public class CoursesFragment extends Fragment{

    public String studentID;
    private ListView coursesView;
    private String courseString;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        super.onCreateView(inflater,container,savedInstanceState);

        View view = inflater.inflate(R.layout.courses_fragment,container,false);


        SQLDatabaseHelper sqlDatabaseHelper = new SQLDatabaseHelper(getActivity());
        SQLiteDatabase db = sqlDatabaseHelper.getReadableDatabase();

        Bundle b = this.getArguments();
        studentID = b.getString("0");

        GetCourses getCourses= new GetCourses(db,studentID);
        String courses = getCourses.getCourseID();

        Log.e("CF","Courses String: " + courses);

        String[] coursesStringList = courses.split(" ");


        CourseNameAndInstructor courseNameAndTeacherList = new CourseNameAndInstructor(coursesStringList,db);
        ArrayList<String> c = courseNameAndTeacherList.getDisplayCourses();


        CoursesFragmentAdapter coursesFragmentAdapter = new CoursesFragmentAdapter(getActivity(),android.R.layout.simple_list_item_1,c);



        coursesView =(ListView) view.findViewById(R.id.coursesListView);

        coursesView.setAdapter(coursesFragmentAdapter);

        coursesView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
                Object o = coursesView.getItemAtPosition(position);
                courseString = (String)o;

                String[] cString = courseString.split(" ");
                Bundle bundle = new Bundle();
                bundle.putString("CID",cString[0]);

                EvalFragment evalFragment = new EvalFragment();
                FragmentTransaction fragmentTransaction = getActivity().getSupportFragmentManager().beginTransaction();
                evalFragment.setArguments(bundle);
                fragmentTransaction.replace(R.id.courses_fragment,evalFragment);
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();

            }
        });




        return view;
    }



}
