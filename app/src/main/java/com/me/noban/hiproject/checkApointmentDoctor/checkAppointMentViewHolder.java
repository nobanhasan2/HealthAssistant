package com.me.noban.hiproject.checkApointmentDoctor;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.me.noban.hiproject.R;

public class checkAppointMentViewHolder extends RecyclerView.ViewHolder {
    TextView apName,apCell;

    public checkAppointMentViewHolder(View itemView) {
        super(itemView);
        apCell =itemView.findViewById(com.me.noban.hiproject.R.id.check_ap_cell);
        apName =itemView.findViewById(com.me.noban.hiproject.R.id.check_ap_name);
    }
}
