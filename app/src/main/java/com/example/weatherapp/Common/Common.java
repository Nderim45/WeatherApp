package com.example.weatherapp.Common;

import android.location.Location;

import com.example.weatherapp.Model.Sys;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Common {

    public static final String APP_ID="16e8fafa31b0b88a9736eca65e5305e9";
    public static Location current_location=null;

    public static String convertUnixToDate(long dt) {

        Date date = new Date(dt*1000L);
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm dd EEE MM yyyy");
        String formatted = sdf.format(date);
        return formatted;
    }

    public static String convertUnixToHour(long sunrise) {
        Date date = new Date(sunrise*1000L);
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm");
        String formatted = sdf.format(date);
        return formatted;
    }
}
