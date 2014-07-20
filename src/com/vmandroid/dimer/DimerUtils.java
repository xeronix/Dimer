package com.vmandroid.dimer;

import android.content.Context;
import android.widget.Toast;

public class DimerUtils {
	public static void raiseToastShort(Context context, String text) {
		Toast toast = Toast.makeText(context, text, Toast.LENGTH_SHORT);
		toast.show();
	}
	
	public static void raiseToastLong(Context context, String text) {
		Toast toast = Toast.makeText(context, text, Toast.LENGTH_LONG);
		toast.show();
	}
}
