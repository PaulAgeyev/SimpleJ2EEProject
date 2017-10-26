package com.teaminternational.web;

import com.teaminternational.HelloWorldGenerator;
import com.teaminternational.HelloWorldGeneratorImpl;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


public class BaseHttpServlet extends HttpServlet {

    protected <T> T getBean(String name) {
        return (T) getServletContext().getAttribute(name);
    }

}
