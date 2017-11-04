package com.example.alex.retrofitrxjavasample.model;

/**
 * Created by Alex on 23/09/2017.
 */

public class TwitchGameSummary {
    private int channels;
    private int viewers;

    public TwitchGameSummary() {
    }

    public int getChannels() {
        return channels;
    }

    public void setChannels(int channels) {
        this.channels = channels;
    }

    public int getViewers() {
        return viewers;
    }

    public void setViewers(int viewers) {
        this.viewers = viewers;
    }

    @Override
    public String toString() {
        return "TwitchGameSummary{" +
                "channels=" + channels +
                ", viewers=" + viewers +
                '}';
    }
}
