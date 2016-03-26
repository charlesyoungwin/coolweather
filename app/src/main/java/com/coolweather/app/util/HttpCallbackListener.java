package com.coolweather.app.util;

/**
 * Created by charlesyoung on 2016/3/25.
 */
public interface HttpCallbackListener {

    void onFinish(String response);
    void onError(Exception e);
}
