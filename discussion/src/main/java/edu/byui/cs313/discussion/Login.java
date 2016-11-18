/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.byui.cs313.discussion;

import java.io.FileNotFoundException;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.ServletContext;
import java.io.InputStream;
import java.io.InputStreamReader;

/**
 *
 * @author Melissa
 */
@WebServlet(name = "Login", urlPatterns = {"/Login"})
public class Login extends HttpServlet {

    private static final long serialVersionUID = 1L;
    
    //String username = "team";
  //  String password = "incorrect";
 
     /**
     * @see HttpServlet#HttpServlet()
     */
     public Login() {
         super();
         // TODO Auto-generated constructor stub
     }
 
         /**
          * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
          */
         protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {  
 
        String user = request.getParameter("username"); 
        String pass = request.getParameter("password"); 
        
        String filename = "/passwords.txt";
        ServletContext context = getServletContext();
        InputStream is = context.getResourceAsStream(filename);
        if (is != null) {
            InputStreamReader isr = new InputStreamReader(is);
            BufferedReader reader = new BufferedReader(isr);
            PrintWriter writer = response.getWriter();
            String text;
            Boolean found = false;

            while ((text = reader.readLine()) != null) {
                    String[] credentials = text.split(":");
                    String username = credentials[0];
                    String password = credentials[1];

                   if(username.equals(user) && password.equals(pass)){ 
                       found = true;
                       break;
                   }
            }
            if(found){
                request.getSession().setAttribute("username", user);
                request.getRequestDispatcher("/newPost.jsp").forward(request, response);
            }
            else{
                String error = "Wrong username or password";
                request.setAttribute("error",  error); 
                request.getRequestDispatcher("/signin.jsp").forward(request, response);
            }
        }

    } 
}
