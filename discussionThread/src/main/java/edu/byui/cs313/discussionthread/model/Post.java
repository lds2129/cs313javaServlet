/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.byui.cs313.discussionthread.model;

/**
 *
 * @author James Kim
 */
public class Post {

    private String comment;
    private String user;
    private String time;

    public Post() {
        setComment("");
        setUser("");
        setTime("");
    }

    public Post(String comment, String user, String time) {
        this.setComment(comment);
        this.setUser(user);
        this.setTime(time);
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return comment + " : " + user + " : " + time;
    }

    public String toFileString() {
        return comment + "|" + user + "|" + time;
    }

    public void loadFromFileString(String str) {
        // TODO: Validation should be done here
        String[] parts = str.split("\\|");

        comment = parts[0];
        user = parts[1];
        time = parts[2];

    }

}
