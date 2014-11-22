package il.ac.shenkar.broadcastrecieverexample.bl;


import il.ac.shenkar.broadcastrecieverexample.common.Alarm;
import il.ac.shenkar.broadcastrecieverexample.common.AppConst;

import java.util.Date;

import android.content.Context;
import android.os.Bundle;

public class MainController {
	private Context context;
	private AlarmHelper alarmHelper;

	public MainController(Context context) {
		this.context = context;
		alarmHelper = new AlarmHelper();
	}
	
	public void CreateAlarm(String message,Date when)
	{
		Alarm alarm  =  new Alarm();
		alarm.setId(1234);
		Bundle extras = new Bundle();
		extras.putString(AppConst.Extra_Message, message);
		alarm.setExtras(extras);
		alarm.setAction(AppConst.ACTION_ALARM);
		alarm.setIntervalMillis(0);
		alarm.setReciever(NotificationBroadCastReciever.class);
		alarm.setTriggerAtMillis(when.getTime());
		alarmHelper.setAlarm(context, alarm);
	}
}
