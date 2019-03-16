package com.WebShop.servlets;

import com.WebShop.model.User;
import com.WebShop.model.UserData;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;
import java.util.concurrent.atomic.AtomicReference;


@WebListener
public class ContextListener implements ServletContextListener {
    private AtomicReference<UserData> userData;
   // private AtomicReference<Integer> counts;

    @Override
    public void contextInitialized(ServletContextEvent servletContextEvent) {
        userData = new AtomicReference<>(new UserData());

        userData.get().add(new User(1,"Praskovya", "1"));
        userData.get().add(new User(2,"Vladimir", "2"));
        userData.get().add(new User(3,"q", "3"));

        final ServletContext servletContext = servletContextEvent.getServletContext();

        servletContext.setAttribute("dao",userData);
    }

    @Override
    public void contextDestroyed(ServletContextEvent servletContextEvent) {
        userData=null;

    }
}
