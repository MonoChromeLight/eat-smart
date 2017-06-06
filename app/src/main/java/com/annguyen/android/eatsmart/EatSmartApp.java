package com.annguyen.android.eatsmart;

import android.app.Application;

import com.annguyen.android.eatsmart.diets.di.DaggerDietFragmentComponent;
import com.annguyen.android.eatsmart.diets.di.DietFragmentComponent;
import com.annguyen.android.eatsmart.diets.di.DietFragmentModule;
import com.annguyen.android.eatsmart.diets.ui.DietView;
import com.annguyen.android.eatsmart.libs.di.LibsModule;
import com.annguyen.android.eatsmart.login.di.DaggerLoginActivityComponent;
import com.annguyen.android.eatsmart.login.di.LoginActivityComponent;
import com.annguyen.android.eatsmart.login.di.LoginActivityModule;
import com.annguyen.android.eatsmart.login.ui.LoginView;

/**
 * Created by annguyen on 6/1/2017.
 */

public class EatSmartApp extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
    }

    public DietFragmentComponent getDietFragmentComponent(DietView dietView) {
        return DaggerDietFragmentComponent.builder()
                .dietFragmentModule(new DietFragmentModule(dietView))
                .libsModule(new LibsModule(null))
                .build();
    }

    public LoginActivityComponent getLoginActivityComponent(LoginView loginView) {
        return DaggerLoginActivityComponent.builder()
                .loginActivityModule(new LoginActivityModule(loginView))
                .libsModule(new LibsModule(null))
                .build();
    }
}