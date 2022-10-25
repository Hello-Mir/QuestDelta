package ru.javarush.quest.sawyer.controller.servlet;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import ru.javarush.quest.sawyer.util.Jsp;

import static ru.javarush.quest.sawyer.config.PageAlias.HOME;

@WebServlet(name = "home", value = HOME)
public class HomePageServlet extends HttpServlet {
    private final static Logger log = LogManager.getLogger(HomePageServlet.class);

    public void doGet(HttpServletRequest request, HttpServletResponse response) {
        Jsp.forward(request, response, HOME);
        log.debug("Requested page {}", HOME);
    }

    public void destroy() {
    }
}
