package com.example.alex.retrofitrxjavasample.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by Alex on 05/11/2017.
 */

public class VideosResponseWrapper {
    @SerializedName("_total") private int total;
    private List<TwitchVideo> videos;

    public VideosResponseWrapper() {
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public List<TwitchVideo> getVideos() {
        return videos;
    }

    public void setVideos(List<TwitchVideo> videos) {
        this.videos = videos;
    }
}
