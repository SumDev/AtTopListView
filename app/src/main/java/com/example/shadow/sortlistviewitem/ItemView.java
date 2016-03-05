package com.example.shadow.sortlistviewitem;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

/**
 * Created by Administrator on 2016/3/4.
 */
public class ItemView extends LinearLayout {

    TextView textView;

    public ItemView(Context context){
        super(context);
        init();
    }

    public ItemView(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public void setText(String text){
        textView.setText(text);
    }

    private void init(){
       LayoutInflater layoutInflater =(LayoutInflater) getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view = layoutInflater.inflate(R.layout.itemview,this);
        textView = (TextView)view.findViewById(R.id.textView);

    }

}
