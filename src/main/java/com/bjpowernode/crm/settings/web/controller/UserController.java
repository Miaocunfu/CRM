package com.bjpowernode.crm.settings.web.controller;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author Miaocunfu
 * @Description
 * @Classname UserController
 * @date 2022/1/7 14:28
 */

public class UserController extends HttpServlet {


    public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String path = request.getServletPath();
        if ("/settings/user/.do".equals(path)){

        }else if ("/settings/user/.do".equals(path)){

        }

    }
}
