package com.example.broadcastreceiverapp;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;
import android.net.Uri;
import android.util.Log;

public class Receiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {

        if (Intent.ACTION_USER_PRESENT.equals(intent.getAction())) {

            Toast.makeText(context, "Pantalla desbloqueada", Toast.LENGTH_SHORT).show();

            Log.d("Receiver", "El usuario desbloqueo el dispositivo");

            Intent i = new Intent(Intent.ACTION_DIAL);
            i.setData(Uri.parse("tel:2664553747"));
            i.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);

            context.startActivity(i);
        }
    }
}
