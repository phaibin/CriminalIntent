package com.bignerdranch.android.criminalintent;

import android.app.Application;
import android.content.Context;

/**
 * Created by leon on 5/6/16.
 */
public class MyApplication extends Application {
    private static Context context;

    @Override
    public void onCreate() {
        super.onCreate();
        MyApplication.context = getApplicationContext();
    }

    public static Context getAppContext() {
        return MyApplication.context;
    }
}
