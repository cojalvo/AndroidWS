package com.example.randomjokes;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Context;

public class ProcessDialogHelper {
	   private static ProgressDialog pb = null;

	    public static void showProgressDialog(String message, Context context)
	    {
		Activity ac;
		try
		{
		    ac = (Activity) context;
		}
		catch (Exception e)
		{
		    return;
		}
		if (ac != null && !ac.isFinishing())
		{
		    pb = ProgressDialog.show(context, "Loading...", message);
		    pb.setCanceledOnTouchOutside(false);
		}
	    }

	    public static void closeProggresDialog()
	    {
		if (pb != null)
		    pb.dismiss();
	    }

}
