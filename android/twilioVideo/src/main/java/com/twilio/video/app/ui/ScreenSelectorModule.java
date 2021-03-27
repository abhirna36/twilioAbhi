package com.twilio.video.app.ui;

import dagger.Module;
import dagger.Provides;

@Module
public class ScreenSelectorModule {

    @Provides
    ScreenSelector providesScreenSelector() {
        return new ProductionScreenSelector();
    }
}
