package com.example.android.sunshine.app;

import android.app.Application;
import android.content.res.Configuration;

import com.facebook.stetho.Stetho;

/**
 * Created by johnriddle on 3/12/15.
 */
public class Sunshine extends Application {

    private static Sunshine singleton;

    public Sunshine getInstance(){
        return singleton;
    }

    @Override
    public void onConfigurationChanged(Configuration newConfig) {

        super.onConfigurationChanged(newConfig);
    }

    @Override
    public void onCreate() {
        super.onCreate();
        Stetho.initialize(
                Stetho.newInitializerBuilder(this)
                        .enableDumpapp(
                                Stetho.defaultDumperPluginsProvider(this))
                        .enableWebKitInspector(
                                Stetho.defaultInspectorModulesProvider(this))
                        .build());
        singleton = this;
    }

    @Override
    public void onLowMemory() {
        super.onLowMemory();
    }

    @Override
    public void onTerminate() {
        super.onTerminate();
    }


}
