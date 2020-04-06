package by.tms.androidtestapp.dz8

import android.app.AlarmManager
import android.app.NotificationChannel
import android.app.NotificationManager
import android.app.PendingIntent
import android.content.Context
import android.content.Intent
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.annotation.RequiresApi
import by.tms.androidtestapp.R
import kotlinx.android.synthetic.main.home_work_eight_layout.*
import java.util.*

class HomeWorkEightActivity : AppCompatActivity() {
    var hour = 0
    var minutes = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.home_work_eight_layout)

        timePicker.setOnTimeChangedListener { view, pickerHour, pickerMinutes ->
            hour = pickerHour
            minutes = pickerMinutes
        }

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            createChannel()
        }

        setAlarmButton.setOnClickListener {
            val calendarNow = Calendar.getInstance()
            val calendarAlarm = Calendar.getInstance()
            calendarAlarm.apply {
                set(Calendar.HOUR_OF_DAY, hour)
                set(Calendar.MINUTE, minutes)
                set(Calendar.SECOND, 0)
            }

            val alarmManager = getSystemService(Context.ALARM_SERVICE) as AlarmManager

            val intent = Intent(this, AlarmReceiver::class.java)
            val pendingIntent = PendingIntent.getBroadcast(this, 998, intent, 0)

            if (calendarAlarm.after(calendarNow)) {
                alarmManager.set(AlarmManager.RTC_WAKEUP, calendarAlarm.timeInMillis, pendingIntent)
            }

            Toast.makeText(this, "Alarm set!", Toast.LENGTH_SHORT).show()
        }

    }

    @RequiresApi(Build.VERSION_CODES.O)
    private fun createChannel() {
        val name = "Alarm channel"
        val importance = NotificationManager.IMPORTANCE_LOW
        val description = "Channel for alarm clock notifications"
        val channel = NotificationChannel(ALARM, name, importance)
        channel.description = description

        val notificationManager = getSystemService(NotificationManager::class.java)
        notificationManager?.createNotificationChannel(channel)
    }
}
