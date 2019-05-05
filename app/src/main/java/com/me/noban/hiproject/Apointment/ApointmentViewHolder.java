package com.me.noban.hiproject.Apointment;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.me.noban.hiproject.R;

public class ApointmentViewHolder extends RecyclerView.ViewHolder {
    public TextView docName,doclocation,speciality;
    ImageView appointNow;
    public ApointmentViewHolder(View itemView) {
        super(itemView);
        docName =itemView.findViewById(com.me.noban.hiproject.R.id.doc_name_apointment);
        doclocation =itemView.findViewById(com.me.noban.hiproject.R.id.chamber_location_apointment);
        speciality =itemView.findViewById(com.me.noban.hiproject.R.id.apointment_doc_speciality);
        appointNow =itemView.findViewById(com.me.noban.hiproject.R.id.apointNOw);
    }
}
