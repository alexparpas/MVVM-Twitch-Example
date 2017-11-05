package com.example.alex.retrofitrxjavasample.model;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Alex on 20/09/2017.
 */

public class TwitchStream {
    private long id;
    @SerializedName("average_fps") private double fps;
    private TwitchChannel channel;
    @SerializedName("created_at") private String createdAt;
    private String game;
    @SerializedName("is_playlist") private boolean isPlaylist;
    @SerializedName("video_height") private int videoHeight;
    private long viewers;

    public TwitchStream() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public double getFps() {
        return fps;
    }

    public void setFps(double fps) {
        this.fps = fps;
    }

    public TwitchChannel getChannel() {
        return channel;
    }

    public void setChannel(TwitchChannel channel) {
        this.channel = channel;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public String getGame() {
        return game;
    }

    public void setGame(String game) {
        this.game = game;
    }

    public boolean isPlaylist() {
        return isPlaylist;
    }

    public void setPlaylist(boolean playlist) {
        isPlaylist = playlist;
    }

    public int getVideoHeight() {
        return videoHeight;
    }

    public void setVideoHeight(int videoHeight) {
        this.videoHeight = videoHeight;
    }

    public long getViewers() {
        return viewers;
    }

    public void setViewers(long viewers) {
        this.viewers = viewers;
    }

    @Override
    public String toString() {
        return "TwitchStream{" +
                "id=" + id +
                ", fps=" + fps +
                ", channel=" + channel +
                ", createdAt='" + createdAt + '\'' +
                ", game='" + game + '\'' +
                ", isPlaylist=" + isPlaylist +
                ", videoHeight=" + videoHeight +
                ", viewers=" + viewers +
                '}';
    }
}
