package com.example.maxuejun.firstapptest.model;

import com.litesuits.http.request.param.HttpParam;
import com.litesuits.http.request.param.HttpParamModel;
import com.litesuits.http.request.param.NonHttpParam;

/**
 * Created by Administrator on 16-8-11.
 */
public class UserParam implements HttpParamModel{
    // static final property will be ignored.
    private static final long serialVersionUID = 2451716801614350437L;

    private String uri;

    @HttpParam("id")
    private long id;

    public String key;

    @NonHttpParam// lite http ignore
    private transient String beIgnored = "Ignored by @NonHttpParam ";

    public UserParam(long id, String key) {
        this.id = id;
        this.key = key;
    }
}
