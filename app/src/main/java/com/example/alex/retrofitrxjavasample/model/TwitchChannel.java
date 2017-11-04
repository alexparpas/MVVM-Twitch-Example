package com.example.alex.retrofitrxjavasample.model;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Alex on 23/09/2017.
 */

public class TwitchChannel {
    private long id;
    @SerializedName("display_name") private String streamer;
    private long followers;
    private String game;
    private String language;
    private String logo;
    private boolean mature;
    private String name;
    private boolean partner;
    @SerializedName("profile_banner") private String banner;
    private String status;
    private String url;
    private long views;

    public TwitchChannel() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getStreamer() {
        return streamer;
    }

    public void setStreamer(String streamer) {
        this.streamer = streamer;
    }

    public long getFollowers() {
        return followers;
    }

    public void setFollowers(long followers) {
        this.followers = followers;
    }

    public String getGame() {
        return game;
    }

    public void setGame(String game) {
        this.game = game;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public boolean isMature() {
        return mature;
    }

    public void setMature(boolean mature) {
        this.mature = mature;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isPartner() {
        return partner;
    }

    public void setPartner(boolean partner) {
        this.partner = partner;
    }

    public String getBanner() {
        return banner;
    }

    public void setBanner(String banner) {
        this.banner = banner;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public long getViews() {
        return views;
    }

    public void setViews(long views) {
        this.views = views;
    }

    @Override
    public String toString() {
        return "TwitchChannel{" +
                "id=" + id +
                ", streamer='" + streamer + '\'' +
                ", followers=" + followers +
                ", game='" + game + '\'' +
                ", language='" + language + '\'' +
                ", logo='" + logo + '\'' +
                ", mature=" + mature +
                ", name='" + name + '\'' +
                ", partner=" + partner +
                ", banner='" + banner + '\'' +
                ", status='" + status + '\'' +
                ", url='" + url + '\'' +
                ", views=" + views +
                '}';
    }
}
