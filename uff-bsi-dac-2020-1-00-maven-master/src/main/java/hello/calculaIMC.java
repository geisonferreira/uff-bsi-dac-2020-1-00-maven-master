/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hello;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Geison Disciplina Aplicações Corporativas Professor Viterbo
 */
@WebServlet("/calcularIMC")
public class calculaIMC extends HttpServlet {

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
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet IMC</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet IMC at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
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
				
	float imc;
	String condicao = null;
        
        String altura = request.getParameter("altura");
        String peso = request.getParameter("peso");
        imc = Float.parseFloat(peso) / (Float.parseFloat(altura) * Float.parseFloat(altura));
        if(imc < 18)
        {
            condicao = "Abaixo do peso";
        }
        else
            if(imc > 18 & imc < 25)
            {
                condicao = "Peso normal";
            }
            else
                if(imc > 25 & imc < 30)
                {
                    condicao = "Acima do peso";
                }
                else
                    if(imc > 30)
                    {
                        condicao = "obesso";
                    }
        
        request.setAttribute("condicao", condicao);
        
		response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet IMC</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet IMC</h1>");
            out.println("<p> Indice calculado</p>");
            out.println("<p>" + imc + "</p>");
            out.println("<p> Faixa de condição </p>");
            out.println("<p>" + condicao + "</p>");
            out.println("</body>");
            out.println("</html>");  
    }
        
        
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