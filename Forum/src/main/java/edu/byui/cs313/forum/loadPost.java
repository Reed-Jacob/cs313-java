package edu.byui.cs313.forum;
/*
 * Load Post Servlet
 * Reads and displays file contents
 */

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author Jacob
 */
@WebServlet(name = "loadPost", urlPatterns = {"/loadPost"})
public class loadPost extends HttpServlet {

    /**
     * Handles the HTTP <code>GET</code> method.
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {   
       
        // Create array to store posts
        List<String> list = new ArrayList<String>();
        
        // Set file path
        File file = new File(getServletContext().getRealPath("/") + "forumPosts.txt");
        
        // Ensure file exists
        if (!file.exists()) {
                file.createNewFile();
        }
        // Read the file and add up all those lines
        try {
            BufferedReader reader = new BufferedReader(new FileReader(file));

            String line;
            while ((line = reader.readLine()) != null) {
                list.add(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
       
        // Put it all together and reverse it
        List<String> body = list.subList(0, list.size());
        Collections.reverse(body);
       
        // Send out
        request.setAttribute("posts", body);
        request.getRequestDispatcher("viewPosts.jsp").forward(request, response);
        
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
    }
}
