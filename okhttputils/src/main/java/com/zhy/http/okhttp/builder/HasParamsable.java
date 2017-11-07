package com.zhy.http.okhttp.builder;

import java.util.Map;

/**
 * Created by zhy on 16/3/1.
 * 已添加
 */
public interface HasParamsable
{
    OkHttpRequestBuilder params(Map<String, String> params);
    OkHttpRequestBuilder addParams(String key, String val);
}
