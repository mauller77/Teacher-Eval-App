package com.deitel.teacherevalapp;


import android.net.Uri;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;

public class CoursesAdapter extends RecyclerView.Adapter<CoursesAdapter.ViewHolder> {

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    //interface implemented by CoursesFragment to respond when the user touches
    //a course in the RecyclerView
    public interface CourseClickListener{
        void onClick(Uri courseUri);
    }


    //implement view-holder pattern in context of RecyclerView
    public class ViewHolder extends RecyclerView.ViewHolder{
       // public final TextView textView;
        private long rowID;

        //configure RecyclerView course's ViewHolder
        public ViewHolder(View courseView){
            super(courseView);
           // textView = courseView.findViewById(android.R.id.text1);


            //attach listener to courseView
            courseView.setOnClickListener(
                    new View.OnClickListener(){
                        public void onClick(View view){
                            //clickListener.onClick(sIDPassword.buildStudentUri(rowID))
                        }
                    }
            );

        }

        //set database row ID for the item in this ViewHolder
        public void setRowID(long rowID){
            this.rowID=rowID;
        }


    }

    //CourseAdapter instance Variables


}
