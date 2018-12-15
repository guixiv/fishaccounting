package com.fishfishfish.fishaccounting.widget;

import android.content.Context;
import android.graphics.Color;
import android.support.v7.widget.AppCompatCheckBox;
import android.view.ViewGroup;
import android.widget.CheckBox;

import com.fishfishfish.fishaccounting.R;

/**
 * Created by lizhengxian on 2016/10/23.
 * 显示分割后的词语的控件
 */

public class BangWordView extends CheckBox {
    public BangWordView(Context context, String text) {
        super(context);
        ViewGroup.LayoutParams params = new ViewGroup.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        setBackgroundResource(R.drawable.checkbox_selector);
        setButtonDrawable(null);
        setLayoutParams(params);
        setText(text);
        setTextColor(Color.BLACK);
        setTextSize(18);
    }
}
