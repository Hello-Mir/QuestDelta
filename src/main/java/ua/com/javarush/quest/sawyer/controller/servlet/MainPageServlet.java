package ua.com.javarush.quest.sawyer.controller.servlet;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import ua.com.javarush.quest.sawyer.util.Jsp;

@WebServlet(name = "main", value = "/main")
public class MainPageServlet extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response) {
        Jsp.forward(request, response, "main");
    }

    public void destroy() {
    }
}
