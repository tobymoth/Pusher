package com.example.tobymoth.pusher;

import android.util.Log;
import com.google.firebase.iid.FirebaseInstanceIdService;
import com.google.firebase.iid.FirebaseInstanceId;

public class PusherIdService extends FirebaseInstanceIdService {

    private static final String TAG = "PusherIdService";

    @Override     public void onTokenRefresh() {
        String refreshedToken = FirebaseInstanceId.getInstance().getToken();
        Log.d(TAG, "Refreshed token: " + refreshedToken);
        sendRegistrationToServer(refreshedToken);
    }

    private void sendRegistrationToServer(String token) {
        // TODO do stuff - but for now just copy token from the log
    }
}

