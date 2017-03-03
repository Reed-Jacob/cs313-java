package edu.byui.cs313.forum;

/*
 * Login Servlet
 * Checks user input and redirects based on input
 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author Jacob
 */
@WebServlet(name = "login", urlPatterns = {"/login"})
public class login extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String correctUsername = "test";
        String correctPassword = "test";

        String username = request.getParameter("username");
        String password = request.getParameter("password");
        
        if(username.equals(correctUsername) && password.equals(correctPassword)) {

            // If they're correct, redirect to discussion page
            request.getSession().setAttribute("username", username);
            response.sendRedirect("newPost.jsp");
        } else {
            // If incorrect, redirect to badlogin page
            response.sendRedirect("badLogin.jsp");
        }
    }
    // <c:if test="${not empty error}">
    // <p>${error}</p>
    // </c:if>
    // 

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Login stuff!";
    }// </editor-fold>

}
