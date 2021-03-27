package com.twilliotesting.framework;

import android.content.Intent;
import android.util.Log;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.twilio.video.app.ui.splash.SplashActivity;


public class TwilioTestModule extends ReactContextBaseJavaModule {

    public TwilioTestModule(ReactApplicationContext reactContext) {
        super(reactContext);
    }

    @Override
    public String getName() {
        return "TWILIO";
    }

    @ReactMethod
    public void initTwilio(String token) {
        Log.d("INIT", "Bridge created");
        System.out.println("bridge created");

        ReactApplicationContext context = getReactApplicationContext();
        Intent intent = new Intent(context, SplashActivity.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        context.startActivity(intent);
    }

}