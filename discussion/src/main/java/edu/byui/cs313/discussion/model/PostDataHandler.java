/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.byui.cs313.discussion.model;

/**
 *
 * @author James Kim
 */
import java.util.ArrayList;
import java.util.List;


public interface PostDataHandler {
  public List<Post> getFavoritePosts();
}