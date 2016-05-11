package com.bignerdranch.android.criminalintent;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;

/**
 * Created by leon on 5/5/16.
 */
public class Crime {
    private UUID mId;
    private String mTitle;
    private Date mDate;
    private boolean mSolved;

    public UUID getId() {
        return mId;
    }

    public String getTitle() {

        return mTitle;
    }

    public void setTitle(String title) {
        mTitle = title;
    }

    public boolean isSolved() {
        return mSolved;
    }

    public void setSolved(boolean solved) {
        mSolved = solved;
    }

    public Date getDate() {

        return mDate;
    }

    public void setDate(Date date) {
        mDate = date;
    }

    public String getDateString() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy年MM月dd日 hh:mm:ss");
        return dateFormat.format(mDate);
//        java.text.DateFormat df = DateFormat.getLongDateFormat(MyApplication.getAppContext());
//        String dateString = df.format(mDate);
//        return dateString;
    }

    public Crime() {
        mTitle = "New Criminal";
        mId = UUID.randomUUID();
        mDate = new Date();
//        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
//        try {
//            mDate = dateFormat.parse("1979-02-07");
//        } catch (ParseException e) {
//            e.printStackTrace();
//        }
    }
}
