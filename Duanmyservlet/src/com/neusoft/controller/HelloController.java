package com.neusoft.controller;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author shihaobo
 * @date 2020/9/18 10:35
 */
public class HelloController extends HttpServlet {
    @Override
    public void init() throws ServletException {
        String s = getInitParameter("wahaha");
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getSession(false);
    }
}
