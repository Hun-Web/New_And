package com.example.myapplication;

public class User {
  private String name;
  private String preview;
  private String time;
  private int profile;

    public User(String name, String preview, String time, int profile) {
        this.name = name;
        this.preview = preview;
        this.time = time;
        this.profile = profile;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPreview() {
        return preview;
    }

    public void setPreview(String preview) {
        this.preview = preview;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public int getProfile() {
        return profile;
    }

    public void setProfile(int profile) {
        this.profile = profile;
    }
}
