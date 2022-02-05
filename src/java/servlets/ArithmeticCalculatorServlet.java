/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author honey
 */
@WebServlet(name = "ArithmeticCalculatorServlet", urlPatterns = {"/ArithmeticCalculatorServlet"})
public class ArithmeticCalculatorServlet extends HttpServlet {
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //loads jsp to servlet
        getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request,response);
        return;
    }
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String fVal = request.getParameter(firstNumber);
        String sVal = request.getParameter(secondNumber);
        int firstVal = 0;
        int secVal = 0;
        String message = "";
        
        try{
            firstVal = Integer.parseInt(fVal);
            secVal = Integer.parseInt(sVal);
            
        }
        catch (NumberFormatException e){
            message = "invalid";
        }
        
        request.setAttribute("first", fVal);
         request.setAttribute("second", sVal);

        if(!message.equals("invalid")){
            if(request.getParameter("operation").equals("+")){
                int addition = firstVal + secVal;
                message = Integer.toString(addition);
            }
            else if(request.getParameter("operation").equals("-"))
            {
                int subtraction = firstVal - secVal;
                message = Integer.toString(subtraction);
            }
            else if(request.getParameter("operation").equals("*"))
            {
                int multiplication = firstVal * secVal;
                message = Integer.toString(multiplication);
            }
            else if(request.getParameter("operation").equals("%"))
            {
                int modular = firstVal % secVal;
                message = Integer.toString(modular);
            }
        }


        request.setAttribute("message", message);

        getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request, response);
        return;
        
    }    



}
