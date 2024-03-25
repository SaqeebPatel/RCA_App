package com.empire.researchcomputeracademy.dialog;

import android.app.Activity;
import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.view.Window;

import com.empire.researchcomputeracademy.R;

public class GraphicsDialog extends Dialog implements View.OnClickListener {


    public Activity a;
    public Dialog c;
    public GraphicsDialog(Activity c)
    {
        super(c);
        this.a = c;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.graphics_dialog);
    }

    @Override
    public void onClick(View v)
    {

    }
}



