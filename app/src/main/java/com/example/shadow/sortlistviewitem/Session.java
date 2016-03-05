package com.example.shadow.sortlistviewitem;

/**
 * Created by Administrator on 2016/3/4.
 */
public class Session implements Comparable {

    /**
     * 是否置顶
     * */
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
        Session anotherSession = (Session)another;
        if (top > anotherSession.top){
            return 1;
        }else {
            return 0;
        }
    }
}
