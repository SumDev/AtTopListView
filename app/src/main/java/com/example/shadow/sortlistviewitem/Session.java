package com.example.shadow.sortlistviewitem;

import java.io.Serializable;
import java.util.Calendar;

/**
 * Created by Administrator on 2016/3/4.
 */
public class Session implements Serializable, Comparable {

    /**
     * 是否置顶
     */
    public int top;

    /**
     * 置顶时间
     **/
    public long time;


    public long getTime() {
        return time;
    }

    public void setTime(long time) {
        this.time = time;
    }

    public int getTop() {
        return top;
    }

    public void setTop(int top) {
        this.top = top;
    }

    @Override
    public int compareTo(Object another) {
        if (another == null || another instanceof Session == false) {
            return -1;
        }

        Session otherSession = (Session) another;
        int result = 0 - (top - otherSession.getTop());
        if (result == 0) {
            result = compareToTime(time, otherSession.getTime());
        }
        return result;
    }

    public static int compareToTime(long lhs, long rhs) {
        Calendar cLhs = Calendar.getInstance();
        Calendar cRhs = Calendar.getInstance();
        cLhs.setTimeInMillis(lhs);
        cRhs.setTimeInMillis(rhs);
        return cLhs.compareTo(cRhs);
    }

}
