package com.teaminternational.web;

import com.teaminternational.HelloWorldGenerator;
import com.teaminternational.HelloWorldGeneratorImpl;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by pavel on 10/26/17.
 */
public class NewServlet extends BaseHttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doGet(req,resp);

        HelloWorldGeneratorImpl helloWorldGenerator = getBean(HelloWorldGenerator.COMPONENT_NAME);
        helloWorldGenerator.sayHello();

        System.out.println(helloWorldGenerator.sayHello());
    }
}
