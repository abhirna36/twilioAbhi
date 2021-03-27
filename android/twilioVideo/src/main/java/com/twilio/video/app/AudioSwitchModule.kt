package com.twilio.video.app

import android.app.Application
import android.content.Context
import com.twilio.audioswitch.AudioDevice
import com.twilio.audioswitch.AudioSwitch
import dagger.Module
import dagger.Provides

@Module
class AudioSwitchModule (val context: Context) {


    @Provides
    fun providesAudioDeviceSelector(): AudioSwitch =
            AudioSwitch(context,
                    loggingEnabled = true,
                    preferredDeviceList = listOf(AudioDevice.BluetoothHeadset::class.java,
                            AudioDevice.WiredHeadset::class.java,
                            AudioDevice.Speakerphone::class.java,
                            AudioDevice.Earpiece::class.java))
}
