package com.example.alex.retrofitrxjavasample.model;

import com.google.gson.annotations.SerializedName;

import java.util.Map;

/**
 * Created by Alex on 04/11/2017.
 */

public class TwitchVideo {
    @SerializedName("_id") private String id;
    @SerializedName("broadcast_type") private String type;
    private TwitchChannel channel;
    private String createdAt;
    private String description;
    private String descriptionHtml;
    private String game;
    private String language;
    private int length;
    private Map<String, Object> preview;
    private String status;
    private Map<String, Object> thumbnails;
    private String title;
    private String url;
    private String viewable;
    private int views;

    public TwitchVideo() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDescriptionHtml() {
        return descriptionHtml;
    }

    public void setDescriptionHtml(String descriptionHtml) {
        this.descriptionHtml = descriptionHtml;
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

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public Map<String, Object> getPreview() {
        return preview;
    }

    public void setPreview(Map<String, Object> preview) {
        this.preview = preview;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Map<String, Object> getThumbnails() {
        return thumbnails;
    }

    public void setThumbnails(Map<String, Object> thumbnails) {
        this.thumbnails = thumbnails;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getViewable() {
        return viewable;
    }

    public void setViewable(String viewable) {
        this.viewable = viewable;
    }

    public int getViews() {
        return views;
    }

    public void setViews(int views) {
        this.views = views;
    }

    @Override
    public String toString() {
        return "TwitchVideo{" +
                "id='" + id + '\'' +
                ", type='" + type + '\'' +
                ", channel=" + channel +
                ", createdAt='" + createdAt + '\'' +
                ", description='" + description + '\'' +
                ", descriptionHtml='" + descriptionHtml + '\'' +
                ", game='" + game + '\'' +
                ", language='" + language + '\'' +
                ", length=" + length +
                ", preview=" + preview +
                ", status='" + status + '\'' +
                ", thumbnails=" + thumbnails +
                ", title='" + title + '\'' +
                ", url='" + url + '\'' +
                ", viewable='" + viewable + '\'' +
                ", views=" + views +
                '}';
    }
}
