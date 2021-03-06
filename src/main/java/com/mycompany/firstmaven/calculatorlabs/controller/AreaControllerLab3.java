/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.firstmaven.calculatorlabs.controller;

import com.mycompany.firstmaven.calculatorlabs.model.CalculatorService;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author jordanrehbein
 */
@WebServlet(name = "AreaControllerLab3", urlPatterns = {"/acl3"})
public class AreaControllerLab3 extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            String calcType = request.getParameter("clacType");
            CalculatorService ca = new CalculatorService();
            
            if(calcType.equals("rectangle")) {
                String width = request.getParameter("width").trim();
                String length = request.getParameter("length").trim();
        
                request.setAttribute("rectArea", ca.getRectangleArea(length, width));
            } else if(calcType.equals("circle")) {
                String radius = request.getParameter("radius").trim();
                
                request.setAttribute("circleArea", ca.getCircleArea(radius));
            } else if(calcType.equals("hypotenuse")) {
                String sideA = request.getParameter("sideA").trim();
                String sideB = request.getParameter("sideB").trim();
        
                request.setAttribute("hypotenuse", ca.getHypotenuse(sideA, sideB));
            }
            
        RequestDispatcher view =
        request.getRequestDispatcher("/Lab3.jsp");
        view.forward(request, response);
        }
    }

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
        return "Short description";
    }// </editor-fold>

}
