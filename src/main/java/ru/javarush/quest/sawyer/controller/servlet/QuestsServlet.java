package ru.javarush.quest.sawyer.controller.servlet;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import ru.javarush.quest.sawyer.util.Jsp;

import java.io.IOException;

import static ru.javarush.quest.sawyer.config.PageAlias.QUESTS;

@WebServlet(name = "quests", value = QUESTS)
public class QuestsServlet extends HttpServlet {
    private final static Logger log = LogManager.getLogger(QuestsServlet.class);

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        Jsp.forward(request, response, QUESTS);
        log.debug("Requested page {}", QUESTS);
    }
}
