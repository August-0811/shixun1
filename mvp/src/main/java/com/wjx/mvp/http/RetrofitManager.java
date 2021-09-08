package com.wjx.mvp.http;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Description :
 *
 * @author wangjiaxing
 * @date 2021/9/3
 */
public class RetrofitManager {
    private volatile static RetrofitManager instance=null;
    public static RetrofitManager getInstance() {
        if (instance==null){
            synchronized (RetrofitManager.class){
                if (instance==null){
                    instance=new RetrofitManager();
                }
            }
        }
        return instance;
    }
    private RetrofitManager() {
    }

    Retrofit retrofit;
    public Retrofit create(String url){
        getRetrofit(url);
        return retrofit;
    }

    private void getRetrofit(String url) {

        retrofit=new Retrofit.Builder()
                .baseUrl(url)
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .addConverterFactory(GsonConverterFactory.create())
                .client(new OkHttpClient.Builder()
                        .addInterceptor(new HttpLoggingInterceptor().setLevel(HttpLoggingInterceptor.Level.BODY))
                        .build())
                .build();
    }
}
