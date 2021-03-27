/*
 * Copyright (C) 2019 Twilio, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.twilio.video.app.base;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;

import com.twilio.video.app.DaggerVideoApplicationComponent;

import javax.inject.Inject;

import dagger.android.AndroidInjection;
//import dagger.android.AndroidInjector;
import dagger.android.DispatchingAndroidInjector;
import dagger.android.HasAndroidInjector;

public abstract class BaseActivity extends AppCompatActivity {

//    @Inject
//    DispatchingAndroidInjector dispatchingAndroidInjector;
//
//    public DispatchingAndroidInjector getDispatchingAndroidInjector() {
//        return dispatchingAndroidInjector;
//    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        AndroidInjection.inject(this);
        super.onCreate(savedInstanceState);

//        DaggerVideoApplicationComponent
//                .builder()
//                .build()
//                .inject(this);
    }

}
