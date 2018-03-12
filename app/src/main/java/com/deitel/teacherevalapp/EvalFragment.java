package com.deitel.teacherevalapp;

import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.deitel.teacherevalapp.data.SQLDatabaseHelper;

/**
 * Created by josh on 11/18/16.
 */

public class EvalFragment extends Fragment {

    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager layoutManager;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        super.onCreateView(inflater,container,savedInstanceState);


        recyclerView = (RecyclerView) getActivity().findViewById(R.id.evalRecyclerView);
        layoutManager = new LinearLayoutManager(getContext());
        recyclerView.setLayoutManager(layoutManager);
        SQLDatabaseHelper sdh = new SQLDatabaseHelper(getContext());
        SQLiteDatabase db = sdh.getReadableDatabase();
        adapter = new EvalRecyclerViewAdapter(db);
        recyclerView.setAdapter(adapter);



        View view = inflater.inflate(R.layout.eval_layout,container,false);

        return view;
    }



}
