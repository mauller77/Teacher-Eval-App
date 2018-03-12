package com.deitel.teacherevalapp.data;

import android.content.ContentUris;
import android.net.Uri;
import android.provider.BaseColumns;

import static android.R.attr.id;

public class DD {


    // nested class defines contents of the items table
    public static final class sIDPassword implements BaseColumns {
        public static final String TABLE_NAME = "SIDPassword"; // table's name

        // column names for items table's columns
        public static final String COLUMN_STUDENT_ID = "StudentID";
        public static final String COLUMN_PASSWORD = "Password";



    }

    public static final class sIDName implements BaseColumns {
        public static final String TABLE_NAME = "SIDName"; // table's name


        // column names for items table's columns
        public static final String COLUMN_STUDENT_ID = "StudentID";
        public static final String COLUMN_NAME = "Name";


    }

    public static final class sIDCID implements BaseColumns {
        public static final String TABLE_NAME = "SIDCID"; // table's name

        // column names for items table's columns
        public static final String COLUMN_STUDENT_ID = "StudentID";
        public static final String COLUMN_CID = "CID";


    }
    public static final class cIDCoursesIID implements BaseColumns {
        public static final String TABLE_NAME = "CIDCourseandIID"; // table's name


        // column names for items table's columns
        public static final String COLUMN_CID = "CID";
        public static final String COLUMN_COURSE = "Course";
        public static final String COLUMN_IID = "IID";

    }

    public static final class iIDName implements BaseColumns {
        public static final String TABLE_NAME = "IIDandName"; // table's name

        // column names for items table's columns
        public static final String COLUMN_INSTRUCTOR_ID = "InstructorID";
        public static final String COLUMN_NAME = "Name";


    }

    public static final class evaluationTable implements BaseColumns{
        public static final String TABLE_NAME = "evalTable";
        public static final String SID_COLUMN = "SID";
        public static final String CID_COLUMN = "CID";
        public static final String IID_COLUMN = "IID";

        public static final String EVAL_COLUMN = "EC";



    }
}
