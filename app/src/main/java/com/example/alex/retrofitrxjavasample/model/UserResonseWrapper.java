package com.example.alex.retrofitrxjavasample.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by Alex on 05/11/2017.
 */

public class UserResonseWrapper {
    @SerializedName("_total") private int total;
    private List<TwitchUser> users;


    public UserResonseWrapper() {
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public List<TwitchUser> getUsers() {
        return users;
    }

    public void setUsers(List<TwitchUser> users) {
        this.users = users;
    }

    @Override
    public String toString() {
        return "UserResonseWrapper{" +
                "total=" + total +
                ", users=" + users +
                '}';
    }
}
