package intiproject.project;

import java.util.Date;
import java.util.UUID;

/**
 * Created by user on 21/7/2017.
 */

public class PInfo {
    private static UUID mID;
    private static String mTitle;
    private Date mDate;
    private static boolean mSolved;

    public PInfo(){
        //Generate unique indentifier
        mID = UUID.randomUUID();
        mDate = new Date();
    }

    public Date getDate() {
        return mDate;
    }

    public void setDate(Date date) {
        mDate = date;
    }

    public boolean isSolved() {
        return mSolved;
    }

    public static void setSolved(boolean solved) {
        mSolved = solved;
    }

    public static UUID getID() {
        return mID;
    }

    public static String getTitle() {
        return mTitle;
    }

    public static void setTitle(String title) {
        mTitle = title;
    }
}
