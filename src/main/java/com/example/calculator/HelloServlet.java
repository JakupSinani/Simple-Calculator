package com.example.calculator;

import java.io.*;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

@WebServlet(name = "/calculate")
public class HelloServlet extends HttpServlet {
    public void doPost(HttpServletRequest request,HttpServletResponse response)throws ServletException, IOException{
        int a=Integer.parseInt(request.getParameter("a"));
        int b=Integer.parseInt(request.getParameter("b"));

        int sum=(a+b);

        response.getWriter().println("Sum of "+a+" and "+b + " is "+sum);
    }

}