package com.vmandroid.dimer;

import android.R;
import android.content.Context;
import android.content.SharedPreferences;

/**
 * Singleton Class for alarm data handling
 * @author vmehta
 *
 */
public class AlarmData {
	 private static AlarmData alarmData = null;
	 
	 private String source;
	 private String destination;

	 private Long date;
	 
	 private int targetFare;
	 
	public static AlarmData getAlarmData(Context context) {
		if (alarmData != null) {
			return alarmData;
		}
		
		SharedPreferences alarmDataSharedPref = context.getSharedPreferences(context.getString(R.string.alarm_data_file_name), 
																				Context.MODE_PRIVATE);
		
		if (alarmDataSharedPref.contains(context.getString(R.string.flight_source))) {
			if (alarmData == null) {
				new AlarmData();
			}
			
			alarmData.source = alarmDataSharedPref.getString(context.getString(R.string.flight_source),
																context.getString(R.string.flight_source_default_value));
			
			alarmData.source = alarmDataSharedPref.getString(context.getString(R.string.flight_destination),
																context.getString(R.string.flight_destination_default_value));
			
			alarmData.date = Long.valueOf(alarmDataSharedPref.getLong(context.getString(R.string.flight_date), 
																		context.getResources().getInteger(R.string.flight_date_default_value)));
			
			alarmData.targetFare = alarmDataSharedPref.getInt(context.getString(R.string.flight_targetFare), 
																context.getResources().getInteger(R.string.flight_targetFare_default_value));
		}
		
		return alarmData;
	}
		
		public static void setAlarmData(Context context, String source, String destination, Long date, int targetFare) {
		    SharedPreferences.Editor editor = context.getSharedPreferences(context.getString(R.string.), 0).edit();
		    
		    localEditor.putString(context.getString(2131034116), paramString1);
		    localEditor.putString(context.getString(2131034117), paramString2);
		    localEditor.putLong(context.getString(2131034118), paramLong.longValue());
		    localEditor.putInt(context.getString(2131034119), paramInt);
		    
		    if (localEditor.commit())
		 {
		      if (alarmData == null)
		        new AlarmData();
		      alarmData.source = paramString1;
		      alarmData.destination = paramString2;
		      alarmData.date = paramLong;
		      alarmData.targetFare = paramInt;
		      return;
		    }
		    
		    DimerUtils.raiseToastShort(context, context.getString(R.string.alarm_data_commit_failure_message));
		  }
	}
}
