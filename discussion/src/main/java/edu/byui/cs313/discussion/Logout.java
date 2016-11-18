/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.byui.cs313.discussion;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Melissa
 */
@WebServlet(name = "Logout", urlPatterns = {"/Logout"})
public class Logout extends HttpServlet {

    private static final long serialVersionUID = 1L;
    
    String username = "team";
    String password = "incorrect";
 
     /**
     * @see HttpServlet#HttpServlet()
     */
     public Logout() {
         super();
         // TODO Auto-generated constructor stub
     }
 
         /**
          * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
          */
         protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {  
 
                //request.getSession().setAttribute("username", "");
                request.getSession().invalidate(); 
                request.getRequestDispatcher("/signin.jsp").forward(request, response);
           
       } 
}
