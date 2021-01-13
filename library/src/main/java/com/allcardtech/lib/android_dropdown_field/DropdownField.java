package com.allcardtech.lib.android_dropdown_field;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;

import androidx.appcompat.widget.AppCompatAutoCompleteTextView;

public class DropdownField extends AppCompatAutoCompleteTextView {

    public DropdownField(Context context) {
        super(context);
    }

    public DropdownField(Context arg0, AttributeSet arg1) {
        super(arg0, arg1);
    }

    public DropdownField(Context arg0, AttributeSet arg1, int arg2) {
        super(arg0, arg1, arg2);
    }

    @Override
    public boolean enoughToFilter() {
        return true;
    }

    @Override
    protected void onFocusChanged(boolean focused, int direction, Rect previouslyFocusedRect) {
        super.onFocusChanged(focused, direction, previouslyFocusedRect);
        if (focused && getFilter()!=null) {
            performFiltering(getText(), 0);
        }
    }
}