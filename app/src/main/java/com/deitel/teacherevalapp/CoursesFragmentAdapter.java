package com.deitel.teacherevalapp;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

import java.util.ArrayList;

/**
 * Created by josh on 12/2/16.
 */

public class CoursesFragmentAdapter extends ArrayAdapter<String> implements View.OnClickListener {


    public CoursesFragmentAdapter(Context context, int resource, ArrayList<String> objects) {

        super(context, resource, objects);

    }

    @Override
    public void onClick(View view) {

    }
}


