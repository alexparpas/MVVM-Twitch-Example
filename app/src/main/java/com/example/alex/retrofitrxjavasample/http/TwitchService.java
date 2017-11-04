package com.example.alex.retrofitrxjavasample.http;

import android.databinding.ObservableField;

import com.example.alex.retrofitrxjavasample.model.TwitchGameSummary;
import com.example.alex.retrofitrxjavasample.model.TwitchResponse;
import com.example.alex.retrofitrxjavasample.model.TwitchStream;
import com.example.alex.retrofitrxjavasample.model.TwitchVideo;

import java.util.List;

import io.reactivex.Observable;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.Path;
import retrofit2.http.Query;

/**
 * Created by Alex on 20/09/2017.
 */

public interface TwitchService {
    @GET("streams?game=Overwatch")
    Observable<List<TwitchResponse>> getOverwatchStreams();

    @GET("streams/summary")
    Observable<TwitchGameSummary> getGameSummary(@Query("game") String game);

    @GET("channels/{channelId}/videos")
    Observable<TwitchVideo> getChannelVideos(@Path("channelId") String channelId);
}
