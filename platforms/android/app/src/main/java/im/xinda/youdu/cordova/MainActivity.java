/*
       Licensed to the Apache Software Foundation (ASF) under one
       or more contributor license agreements.  See the NOTICE file
       distributed with this work for additional information
       regarding copyright ownership.  The ASF licenses this file
       to you under the Apache License, Version 2.0 (the
       "License"); you may not use this file except in compliance
       with the License.  You may obtain a copy of the License at

         http://www.apache.org/licenses/LICENSE-2.0

       Unless required by applicable law or agreed to in writing,
       software distributed under the License is distributed on an
       "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
       KIND, either express or implied.  See the License for the
       specific language governing permissions and limitations
       under the License.
 */

package im.xinda.youdu.cordova;

import android.os.Bundle;
import org.apache.cordova.*;

//import im.xinda.youdu.item.PushConfigInfo;
//import im.xinda.youdu.model.YouduIM;
//import im.xinda.youdu.ui.config.PackageConfig;

public class MainActivity extends CordovaActivity
{
    @Override
    public void onCreate(Bundle savedInstanceState)
    {

//        PackageConfig.INSTANCE.setMeizuPushConfigInfo(new PushConfigInfo("119250","0dc1a5cdff864a118fa02b0ff7f229d5","5ad1dbfa9162437c950fb2f303d44e60"));
//        PackageConfig.INSTANCE.setXiaomiPushConfigInfo(new PushConfigInfo("2882303761517963546","6YW+Xt+3fRGrDfDVCf2CUA==","5691796315546"));
//        PackageConfig.INSTANCE.setHuaweiPushConfigInfo(new PushConfigInfo("100666877","4ec253041c27267219174ab313843673",""));
        super.onCreate(savedInstanceState);

        // enable Cordova apps to be started in the background
        Bundle extras = getIntent().getExtras();
        if (extras != null && extras.getBoolean("cdvStartInBackground", false)) {
            moveTaskToBack(true);
        }

        // Set by <content src="index.html" /> in config.xml
        loadUrl(launchUrl);
    }
}
