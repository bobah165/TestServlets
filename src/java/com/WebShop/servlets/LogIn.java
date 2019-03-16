package com.WebShop.servlets;

import com.WebShop.model.User;
import com.WebShop.model.UserData;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicReference;


public class LogIn extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        final String login = req.getParameter("login");
        final String password = req.getParameter("password");
      //  int count1 = 0;
       // count1=Integer.parseInt(req.getParameter("count1"));
       // final int count2 = Integer.parseInt(req.getParameter("count2"));
       // final int count3 = Integer.parseInt(req.getParameter("count3"));
      //  final int count4 = Integer.parseInt(req.getParameter("count4"));

        @SuppressWarnings("unchecked")
        final AtomicReference<UserData> dao = (AtomicReference<UserData>) req.getServletContext().getAttribute("dao");

        final HttpSession session = req.getSession();


        if (dao.get().userIsExist(login,password)) {
            req.getRequestDispatcher("/WEB-INF/view/user.jsp").forward(req,resp);

        }
        else {

            resp.sendRedirect("/");

        }
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("/WEB-INF/view/index.jsp").forward(req,resp);

    }
}
