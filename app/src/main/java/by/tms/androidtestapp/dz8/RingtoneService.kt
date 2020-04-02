package by.tms.androidtestapp.dz8

import android.app.Service
import android.content.Intent
import android.media.Ringtone
import android.media.RingtoneManager
import androidx.core.app.JobIntentService

class RingtoneService : JobIntentService() {

    lateinit var ringtone: Ringtone

    override fun onHandleWork(intent: Intent) {}

    override fun onStartCommand(intent: Intent?, flags: Int, startId: Int): Int {

        when (intent?.action) {
            "start" -> {
                val ringtoneUri = RingtoneManager.getDefaultUri(RingtoneManager.TYPE_ALARM)
                ringtone = RingtoneManager.getRingtone(this, ringtoneUri)
                ringtone.play()
            }
            "stop" -> {
                stopSelf()
            }
        }

        return Service.START_NOT_STICKY
    }

    override fun onDestroy() {
        ringtone.stop()
    }
}