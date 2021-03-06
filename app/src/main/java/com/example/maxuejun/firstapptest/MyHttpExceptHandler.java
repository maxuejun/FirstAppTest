package com.example.maxuejun.firstapptest;

import android.app.Activity;

import com.litesuits.http.data.HttpStatus;
import com.litesuits.http.exception.ClientException;
import com.litesuits.http.exception.HttpClientException;
import com.litesuits.http.exception.HttpNetException;
import com.litesuits.http.exception.HttpServerException;
import com.litesuits.http.exception.NetException;
import com.litesuits.http.exception.ServerException;
import com.litesuits.http.exception.handler.HttpExceptionHandler;
import com.litesuits.http.utils.HttpUtil;

/**
 * Created by Administrator on 16-8-11.
 */
public class MyHttpExceptHandler extends HttpExceptionHandler {
    private Activity activity;

    public MyHttpExceptHandler(Activity activity) {
        this.activity = activity;
    }

    @Override
    protected void onClientException(HttpClientException e, ClientException type) {
        switch (e.getExceptionType()) {
            case UrlIsNull:
                break;
            case ContextNeeded:
                // some action need app context
                break;
            case PermissionDenied:
                break;
            case SomeOtherException:
                break;
        }
        HttpUtil.showTips(activity, "LiteHttp2.0", "Client Exception:\n" + e.toString());
        activity = null;
    }

    @Override
    protected void onNetException(HttpNetException e, NetException type) {
        switch (e.getExceptionType()) {
            case NetworkNotAvilable:
                break;
            case NetworkUnstable:
                // maybe retried but fail
                break;
            case NetworkDisabled:
                break;
            default:
                break;
        }
        HttpUtil.showTips(activity, "LiteHttp2.0", "Network Exception:\n" + e.toString());
        activity = null;
    }

    @Override
    protected void onServerException(HttpServerException e, ServerException type,
                                     HttpStatus status) {
        switch (e.getExceptionType()) {
            case ServerInnerError:
                // status code 5XX error
                break;
            case ServerRejectClient:
                // status code 4XX error
                break;
            case RedirectTooMuch:
                break;
            default:
                break;
        }
        HttpUtil.showTips(activity, "LiteHttp2.0", "Server Exception:\n" + e.toString());
        activity = null;
    }
}
