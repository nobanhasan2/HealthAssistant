package com.me.noban.hiproject.Ambulence.ViewHolder;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.me.noban.hiproject.BloodBank.ViewHolder.donerViewholder;
import com.me.noban.hiproject.R;
import com.me.noban.hiproject.BloodBank.ViewHolder.donerViewholder;

public class AmbulenceContactViewholder extends RecyclerView.ViewHolder {

    public TextView Name, location,contactnumber;
    public donerViewholder itemclicklistener;
    public ImageView callNow;

    public AmbulenceContactViewholder(View itemView) {
        super(itemView);

      Name = itemView.findViewById(R.id.Ambulence_name);
      location=itemView.findViewById(R.id.Ambulence_location);
      contactnumber = itemView.findViewById(R.id.phoneNum_ambulence);
      callNow =itemView.findViewById(R.id.callnowAmbulence);
    //  contactnumber=itemView.findViewById(R.id.Ambulence_num);


    }
}
