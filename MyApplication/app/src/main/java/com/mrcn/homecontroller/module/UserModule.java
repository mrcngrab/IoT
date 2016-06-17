package com.mrcn.homecontroller.module;

import com.mrcn.homecontroller.model.User;

import javax.inject.Named;
import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by gmra on 2016-05-05.
 */
@Module
public class UserModule {

    String mText;
    public UserModule(String text) {
        mText = text;
    }

    @Provides
    @Singleton
    @Named("user1")
    public User getUser(){
        return new User(mText);
    }

    @Provides
    @Singleton
    @Named("user2")
    public User getUser2(){
        return new User("Marcin");
    }

    @Provides
    @Singleton
    public String getText(){
        return "asdff";
    }
}
