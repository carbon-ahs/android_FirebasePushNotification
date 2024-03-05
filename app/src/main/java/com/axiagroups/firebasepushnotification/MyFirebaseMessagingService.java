package com.axiagroups.firebasepushnotification;

import androidx.annotation.NonNull;
import androidx.core.app.NotificationCompat;

import com.google.firebase.messaging.FirebaseMessagingService;
import com.google.firebase.messaging.RemoteMessage;

public class MyFirebaseMessagingService extends FirebaseMessagingService {
    @Override
    public void onMessageReceived(@NonNull RemoteMessage message) {
        super.onMessageReceived(message);

        getFirebaseMessage(message.getNotification().getTitle(), message.getNotification().getBody());
    }

    private void getFirebaseMessage(String title, String body) {
// https://youtu.be/Df71aDbGbTg?si=q_aXlw-cMF1Bp8lr&t=324
        NotificationCompat.Builder builder = new NotificationCompat
                .Builder(this,"notify")
                .setSmallIcon(R.drawable.ic_launcher_foreground)
                .setContentTitle("Test Noti")
                .setContentText("Test noti")
                .setAutoCancel(true);

//        NotificationCompat
    }
}
