package com.example.alex.retrofitrxjavasample.http;

import com.jakewharton.retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;

import java.io.IOException;

import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.Headers;

/**
 * Created by Alex on 20/09/2017.
 */

public class TwitchClient {
    private static final String BASE_URL = "https://api.twitch.tv/kraken/";
    private static TwitchService sService;

    public static TwitchService getClient() {
        if (sService == null) {
            create();
        }
        return sService;
    }

    private static void create() {
        OkHttpClient.Builder twitchClient = new OkHttpClient.Builder();
        twitchClient.addInterceptor(chain -> {
            Request.Builder builder = chain.request().newBuilder();
            builder.header("Accept", "application/vnd.twitchtv.v5+json");
            builder.header("Client-ID", "t8ajt72jtvlfyw6861srn9p7cokqfi");
            return chain.proceed(builder.build());
        });

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .addConverterFactory(GsonConverterFactory.create())
                .client(twitchClient.build())
                .build();
        sService = retrofit.create(TwitchService.class);
    }
}
