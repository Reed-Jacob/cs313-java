package edu.byui.cs313.forum;

/*
 * Create Post Servlet
 * Writes data to file
 */
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Date;
// Used to write to file
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

/**
 * @author Jacob
 */
@WebServlet(urlPatterns = {"/createPost"})

public class createPost extends HttpServlet {

    /**
     * Handles the HTTP <code>GET</code> method.
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {        
        
        // Get name and message
        String user = request.getParameter("name");
        String post = request.getParameter("message");

        File file = new File(getServletContext().getRealPath("/") + "forumPosts.txt");
        
        try {
        // Set date and time
        Date date = new Date();
        
        // Content to be written
        String newMessage = "<b>" + user + "</b>: " + post + " [" + date + "]";
        
        // Write to file
        try (BufferedWriter out = new BufferedWriter(new FileWriter(file, true))) {
            out.write(newMessage);
            out.newLine();
            out.close();
        }      
        
    } catch (IOException ioe) {
	   ioe.printStackTrace();
	}

        response.sendRedirect("loadPost");
    }

}
