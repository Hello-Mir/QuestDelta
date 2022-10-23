package ua.com.javarush.quest.sawyer.controller.servlet;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import ua.com.javarush.quest.sawyer.util.Jsp;

import java.io.IOException;

import static ua.com.javarush.quest.sawyer.config.PageAlias.QUESTS;

@WebServlet(name = "quests", value = QUESTS)
public class QuestsServlet extends HttpServlet {
    private final static Logger log = LogManager.getLogger(QuestsServlet.class);

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        Jsp.forward(request, response, QUESTS);
        log.debug("Moved to {}", request.getRequestURI());
    }
}
