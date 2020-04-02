package by.tms.androidtestapp.dz8
import android.app.PendingIntent
import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.os.Build
import androidx.core.app.NotificationCompat
import androidx.core.app.NotificationCompat.PRIORITY_DEFAULT
import androidx.core.app.NotificationCompat.PRIORITY_LOW
import androidx.core.app.NotificationManagerCompat
import by.tms.androidtestapp.R

const val ALARM = "ALARM"

class AlarmReceiver : BroadcastReceiver() {
    override fun onReceive(context: Context?, p1: Intent?) {
        val notificationBuilder = context?.let {
            NotificationCompat.Builder(it, ALARM)
                .setSmallIcon(R.drawable.ic_launcher_background)
                .setContentTitle(context.getString(R.string.alarm_ringing))
                .setContentText("Wake up, Neo!")
                .setPriority(PRIORITY_DEFAULT)
                .setAutoCancel(true)
                .setContentIntent(
                    PendingIntent.getActivity(
                        context,
                        997,
                        Intent(context, HomeWorkEightActivity::class.java),
                        PendingIntent.FLAG_UPDATE_CURRENT
                    )
                )
                .setDeleteIntent(
                    PendingIntent.getService(
                        context,
                        0,
                        Intent(context, RingtoneService::class.java).setAction("stop"),
                        0
                    )
                )
        }

        val notificationManager = context?.let { NotificationManagerCompat.from(it) }
        notificationBuilder?.build()?.let { notificationManager?.notify(999, it) }

        val ringtoneIntent = Intent(context, RingtoneService::class.java).setAction("start")

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            context?.startForegroundService(ringtoneIntent)
        } else {
            context?.startService(ringtoneIntent)
        }
    }
}