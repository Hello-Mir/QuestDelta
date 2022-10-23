package ua.com.javarush.quest.sawyer.controller.servlet;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import ua.com.javarush.quest.sawyer.util.Jsp;

import static ua.com.javarush.quest.sawyer.config.PageAlias.HOME;

@WebServlet(name = "home", value = HOME)
public class HomePageServlet extends HttpServlet {
    private final static Logger log = LogManager.getLogger(HomePageServlet.class);

    public void doGet(HttpServletRequest request, HttpServletResponse response) {
        Jsp.forward(request, response, HOME);
        log.debug("App started with request {}", request.getRequestURI());
    }

    public void destroy() {
    }
}
