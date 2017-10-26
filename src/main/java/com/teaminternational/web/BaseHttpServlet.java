package com.teaminternational.web;

import com.teaminternational.HelloWorldGenerator;
import com.teaminternational.HelloWorldGeneratorImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

import static com.teaminternational.HelloWorldGenerator.COMPONENT_NAME;

@WebServlet("/")
public abstract class BaseHttpServlet extends HttpServlet {

    protected <T> T getBean(String name) {
        return (T) getServletContext().getAttribute(name);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        HelloWorldGeneratorImpl helloWorldGenerator = getBean(COMPONENT_NAME);
        helloWorldGenerator.sayHello();

    }

}
