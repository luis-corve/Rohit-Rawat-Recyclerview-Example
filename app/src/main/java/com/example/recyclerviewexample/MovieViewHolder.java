package com.example.recyclerviewexample;

import android.view.View;
import android.widget.TextView;import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.example.recyclerviewexample.R;

public class MovieViewHolder extends RecyclerView.ViewHolder {
    private TextView txtMovieName;
    private TextView txtDirectorName;
    private TextView txtYear;

    public MovieViewHolder(@NonNull View itemView) {
        super(itemView);
        txtDirectorName = itemView.findViewById(R.id.txt_director_name);
        txtMovieName = itemView.findViewById(R.id.txt_movie_name);
        txtYear = itemView.findViewById(R.id.txt_year);
    }
    public void setMovieName(String movieName) {
        this.txtMovieName.setText(movieName);
    }
    public void setDirectorName(String directorName) {
        this.txtDirectorName.setText(directorName);
    }
    public void setYear(String year) {
        this.txtYear.setText(year);
    }
}
