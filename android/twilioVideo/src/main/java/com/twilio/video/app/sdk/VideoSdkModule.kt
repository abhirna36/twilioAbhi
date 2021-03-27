package com.twilio.video.app.sdk

import android.app.Application
import android.content.Context
import android.content.SharedPreferences
import com.twilio.video.app.data.DataModule
import com.twilio.video.app.data.api.TokenService
import com.twilio.video.app.data.api.VideoAppServiceModule
import dagger.Module
import dagger.Provides

@Module(includes = [
    DataModule::class,
    VideoAppServiceModule::class])
class VideoSdkModule {

    var context: Context? = null

    fun AuthModule(application: Context?) {
        context = application
    }

    @Provides
    fun providesConnectOptionsFactory(

        sharedPreferences: SharedPreferences,
        tokenService: TokenService
    ): ConnectOptionsFactory =
            ConnectOptionsFactory(context!!, sharedPreferences, tokenService)

    @Provides
    fun providesRoomFactory(

        connectOptionsFactory: ConnectOptionsFactory
    ): VideoClient =
            VideoClient(context!!, connectOptionsFactory)

    @Provides
    fun providesRoomManager(

        videoClient: VideoClient,
        sharedPreferences: SharedPreferences
    ): RoomManager =
            RoomManager(context!!, videoClient, sharedPreferences)
}
