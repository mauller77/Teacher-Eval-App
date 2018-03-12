package com.deitel.teacherevalapp;

import android.database.sqlite.SQLiteDatabase;
import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;

import com.deitel.teacherevalapp.data.SQLDatabaseHelper;

/**
 * Created by Josh on 12/4/2016.
 */

public class EvalRecyclerViewAdapter extends RecyclerView.Adapter<adapter.ViewHolder>{

    private SQLiteDatabase adapterDatabase;


    public EvalRecyclerViewAdapter(SQLiteDatabase db){
        adapterDatabase = db;
    }


    @Override
    public adapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(adapter.ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }
}
