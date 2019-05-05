package com.me.noban.hiproject.preferences;

import android.content.Context;
import android.content.SharedPreferences;

import com.me.noban.hiproject.config.Constant;
import com.me.noban.hiproject.model.Patient;
import com.google.gson.Gson;import com.me.noban.hiproject.model.Patient;

public class UserTypePreference {

    private static UserTypePreference myPreferences;
    private static SharedPreferences sharedPreferences;
    private static SharedPreferences.Editor editor;

    private UserTypePreference(Context context) {
        sharedPreferences = context.getSharedPreferences(Constant.SHARED_PREFERENCES_NAME, Context.MODE_PRIVATE);
        editor = sharedPreferences.edit();
        editor.apply();
    }

    public static UserTypePreference getPreferences(Context context) {
        if (myPreferences == null) myPreferences = new UserTypePreference(context);
        return myPreferences;
    }

    public void setUserType(String userType){
        editor.putString(Constant.USER_TYPE, userType);
        editor.apply();
    }

    public String getUserType(){
        return sharedPreferences.getString(Constant.USER_TYPE, "Name not found");
    }

    public void setUserInfo(Patient patient) {
        Gson gson = new Gson();
        String patientObject = gson.toJson(patient);
        editor.putString(Constant.USER_INFO, patientObject);
        editor.apply();
    }

    public Patient getUserInfo() {
        Gson gson = new Gson();
        String patientObject = sharedPreferences.getString(Constant.USER_INFO, "null");
        Patient patient = gson.fromJson(patientObject, Patient.class);

        return patient;
    }
}
