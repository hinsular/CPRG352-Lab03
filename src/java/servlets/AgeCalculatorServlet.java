package servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AgeCalculatorServlet extends HttpServlet {

   
  
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //loads jsp to servlet
        getServletContext().getRequestDispatcher("/WEB-INF/agecalculator.jsp").forward(request,response);
        return;
    }


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        //parameters from incoming post requests
        int age =  request.getParameter("your_age");
        
        request.setAttribute("age", age);
       
       if( age == null || age.equals("")){
           String message = "You must give your current age";
           request.setAttribute("message", message);
          
           getServletContext().getRequestDispatcher("/WEB-INF/agecalculator.jsp").forward(request,response);
           return;
       }  
       
       else
       {
           try
           {
               age = Integer.parseInt(your_age);
               age++;
               String birthday = "Your age will be " + age;
               request.setAttribute("message", birthday);
           }
           catch (Exception e)
           {
               String message2 = "You must enter a number.";
               request.setAttribute("message", message2);
           }
           getServletContext().getRequestDispatcher("/WEB-INF/agecalculator.jsp").forward(request,response);
           return;
           
       }
       
    }

}
