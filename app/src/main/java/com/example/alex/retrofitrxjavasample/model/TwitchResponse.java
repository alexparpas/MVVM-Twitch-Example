package com.example.alex.retrofitrxjavasample.model;

import java.util.List;

/**
 * Created by Alex on 23/09/2017.
 */

public class TwitchResponse {
    private int total;
    private List<TwitchStream> streams;

    public TwitchResponse() {
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public List<TwitchStream> getStreams() {
        return streams;
    }

    public void setStreams(List<TwitchStream> streams) {
        this.streams = streams;
    }

    @Override
    public String toString() {
        return "TwitchResponse{" +
                "total=" + total +
                ", streams=" + streams +
                '}';
    }
}
