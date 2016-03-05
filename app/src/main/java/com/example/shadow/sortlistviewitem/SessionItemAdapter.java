package com.example.shadow.sortlistviewitem;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

/**
 * Created by Administrator on 2016/3/4.
 */
public class SessionItemAdapter extends ArrayAdapter<Session> {

    Context mContext;

    public SessionItemAdapter(Context context,  Session[] sessions) {
        super(context,0, sessions);
        mContext = context;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null){
            convertView = new ItemView(mContext);
        }
        ItemView itemView = (ItemView)convertView;
        itemView.setText(String.valueOf(getItem(position).getTop()));
        return convertView;
    }
}
