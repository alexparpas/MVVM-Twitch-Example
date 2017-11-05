package com.example.alex.retrofitrxjavasample.model;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Alex on 05/11/2017.
 */

public class TwitchUser {
    @SerializedName("_id") private long id;
    private String bio;
    @SerializedName("create_at") private String createAt;
    @SerializedName("display_name") private String displayName;
    private String email;
    private String logo;
    private String name;
    private boolean partnered;

    public TwitchUser() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getBio() {
        return bio;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }

    public String getCreateAt() {
        return createAt;
    }

    public void setCreateAt(String createAt) {
        this.createAt = createAt;
    }

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isPartnered() {
        return partnered;
    }

    public void setPartnered(boolean partnered) {
        this.partnered = partnered;
    }

    @Override
    public String toString() {
        return "TwitchUser{" +
                "id=" + id +
                ", bio='" + bio + '\'' +
                ", createAt='" + createAt + '\'' +
                ", displayName='" + displayName + '\'' +
                ", email='" + email + '\'' +
                ", logo='" + logo + '\'' +
                ", name='" + name + '\'' +
                ", partnered=" + partnered +
                '}';
    }
}
