package com.xiaomi.xmsf.push.service;

import me.pqpo.librarylog4a.Log4a;

import static top.trumeet.mipushframework.Constants.TAG;

public abstract class MyLog {

    public static void m17e(String str) {
        Log4a.e(TAG, str);
    }

    public static void m18v(String str) {
        Log4a.d(TAG, str);
    }

    public static void m19w(String str) {
        Log4a.w(TAG, str);
    }

    public static void m20w(String str, String str2, Throwable th) {
        Log4a.w(TAG, str2, th);
    }
}
