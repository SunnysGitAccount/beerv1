package com.dev.sunny.web;

import com.dev.sunny.model.BeerExpert;

import java.io.*;
import java.util.*;

import javax.servlet.*;
import javax.servlet.http.*;

public class BeerSelect extends HttpServlet {
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        String c = request.getParameter("color");
        BeerExpert be = new BeerExpert();
        List<String> result = be.getBrands(c);

        request.setAttribute("brands", result);
        RequestDispatcher view = request.getRequestDispatcher("result.jsp");

        view.forward(request, response);
    }
}
