package com.example.alex.retrofitrxjavasample.main;

import android.content.Context;
import android.databinding.ObservableField;
import android.databinding.ObservableInt;
import android.util.Log;
import android.view.View;

import com.example.alex.retrofitrxjavasample.base.IViewModel;
import com.example.alex.retrofitrxjavasample.http.TwitchClient;
import com.example.alex.retrofitrxjavasample.model.StreamsResponseWrapper;
import com.example.alex.retrofitrxjavasample.model.TwitchGameSummary;
import com.example.alex.retrofitrxjavasample.model.TwitchStream;
import com.example.alex.retrofitrxjavasample.model.TwitchUser;
import com.example.alex.retrofitrxjavasample.model.TwitchVideo;
import com.example.alex.retrofitrxjavasample.model.VideosResponseWrapper;

import java.util.List;

import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.annotations.NonNull;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Function;
import io.reactivex.schedulers.Schedulers;

/**
 * Created by Alex on 04/11/2017.
 */

public class MainViewModel implements IViewModel {
    private static final String TAG = "MainViewModel";
    private Context mContext;
    public ObservableInt mEmptyStateVisibility;
    public ObservableInt mRecyclerViewVisibility;
    public ObservableField<String> mGameTitle;
    public ObservableField<String> mChannelName;

    public MainViewModel(Context context) {
        mContext = context;
        mEmptyStateVisibility = new ObservableInt(View.GONE);
        mRecyclerViewVisibility = new ObservableInt(View.GONE);
        mGameTitle = new ObservableField<>("Injustice 2");
        mChannelName = new ObservableField<>("Netherrealm");
    }

    @Override
    public void destroy() {
        mContext = null;
    }

    public void onStreamsClicked() {
        TwitchClient.getClient()
                .getGameStreams(mGameTitle.get())
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .map(StreamsResponseWrapper::getStreams)
                .subscribe(new Observer<List<TwitchStream>>() {
                    @Override
                    public void onSubscribe(@NonNull Disposable d) {

                    }

                    @Override
                    public void onNext(@NonNull List<TwitchStream> twitchStreams) {
                        Log.d(TAG, "onNext: " + twitchStreams.toString());
                    }

                    @Override
                    public void onError(@NonNull Throwable e) {
                        Log.d(TAG, "onError: " + e.getMessage());
                    }

                    @Override
                    public void onComplete() {
                        Log.d(TAG, "onComplete: ");
                    }
                });
    }

    public void onSummaryClicked() {
        TwitchClient.getClient()
                .getGameSummary(mGameTitle.get())
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<TwitchGameSummary>() {
                    @Override
                    public void onSubscribe(@NonNull Disposable d) {
                        Log.d(TAG, "onSubscribe: ");
                    }

                    @Override
                    public void onNext(@NonNull TwitchGameSummary twitchGameSummary) {
                        Log.d(TAG, "onNext: " + twitchGameSummary.toString());
                    }

                    @Override
                    public void onError(@NonNull Throwable e) {
                        Log.d(TAG, "onError: " + e.getMessage());
                    }

                    @Override
                    public void onComplete() {
                        Log.d(TAG, "onComplete: ");
                    }
                });
    }

    public void onChannelVideosClicked() {
        TwitchClient.getClient()
                .getUser(mChannelName.get())
                .flatMap(twitchUser -> {
                    String id = String.valueOf(twitchUser.getUsers().get(0).getId());
                    Log.d(TAG, "onChannelVideosClicked: id: " + id);
                    return TwitchClient.getClient().getChannelVideos(id);
                })
                .map(VideosResponseWrapper::getVideos)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<List<TwitchVideo>>() {
                    @Override
                    public void onSubscribe(Disposable d) {
                        Log.d(TAG, "onSubscribe() called with: d = [" + d + "]");
                    }

                    @Override
                    public void onNext(List<TwitchVideo> twitchVideos) {
                        Log.d(TAG, "onNext() called with: twitchVideos = [" + twitchVideos.toString() + "]");
                    }

                    @Override
                    public void onError(Throwable e) {
                        Log.d(TAG, "onError() called with: e = [" + e.getMessage() + "]");
                    }

                    @Override
                    public void onComplete() {
                        Log.d(TAG, "onComplete() called");
                    }
                });
    }
}
