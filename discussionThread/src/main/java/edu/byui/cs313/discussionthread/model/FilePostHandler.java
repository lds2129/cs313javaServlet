/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.byui.cs313.discussionthread.model;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author James Kim
 */
public class FilePostHandler implements PostDataHandler {

    private String fileName;

    public FilePostHandler(String fileName) {
        this.fileName = fileName;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public void addPost(Post post) {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(getFileName(), true));
            writer.write(post.toFileString() + "\n");
            writer.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public List<Post> getFavoritePosts() {
        List<Post> list = new ArrayList<Post>();

        try {
            BufferedReader reader = new BufferedReader(new FileReader(getFileName()));

            String line;

            while ((line = reader.readLine()) != null) {
                Post post = new Post();
                post.loadFromFileString(line);
                list.add(post);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
        Collections.reverse(list);
        return list;
    }
}