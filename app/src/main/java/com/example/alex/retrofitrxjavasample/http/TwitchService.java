package com.example.alex.retrofitrxjavasample.http;

import com.example.alex.retrofitrxjavasample.model.StreamsResponseWrapper;
import com.example.alex.retrofitrxjavasample.model.TwitchGameSummary;
import com.example.alex.retrofitrxjavasample.model.TwitchUser;
import com.example.alex.retrofitrxjavasample.model.TwitchVideo;
import com.example.alex.retrofitrxjavasample.model.UserResonseWrapper;
import com.example.alex.retrofitrxjavasample.model.VideosResponseWrapper;

import java.util.List;

import io.reactivex.Observable;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

/**
 * Created by Alex on 20/09/2017.
 */

public interface TwitchService {
    @GET("streams")
    Observable<StreamsResponseWrapper> getGameStreams(@Query("game") String game);

    @GET("streams/summary")
    Observable<TwitchGameSummary> getGameSummary(@Query("game") String game);

    @GET("channels/{id}/videos")
    Observable<VideosResponseWrapper> getChannelVideos(@Path("id") String channelId);

    @GET("users")
    Observable<UserResonseWrapper> getUser(@Query("login") String name);
}
