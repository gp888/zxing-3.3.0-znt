package com.google.zxing.client.android;

import android.util.Log;

/**
 * 日志定管理
 */
public class MyLogUtil {

    public static final String TAG = "ronnie";
    public static boolean on = true;

    /**
     * 设置日志开关
     */
    public static void setLogEnable(boolean flag) {
        on = flag;
    }

    public static void i(String msg) {
        if (on) {
            Log.i(TAG, msg);
        }
    }

    public static void e(String msg) {
        if (on) {
            Log.e(TAG, msg);
        }
    }

    public static void d(String msg) {
        if (on) {
            Log.d(TAG, msg);
        }
    }

    public static void v(String msg) {
        if (on) {
            Log.v(TAG, msg);
        }
    }

}