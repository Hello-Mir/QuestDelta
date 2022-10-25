package ru.javarush.quest.sawyer.util;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import lombok.experimental.UtilityClass;

import java.io.IOException;

@UtilityClass
public class Jsp {
    public void forward(HttpServletRequest request, HttpServletResponse response, String name) {
        String replaceSlash = name.replace("/", "");
        String page = "WEB-INF/jsp/%s.jsp".formatted(replaceSlash);
        RequestDispatcher dispatcher = request.getRequestDispatcher(page);
        try {
            dispatcher.forward(request, response);
        } catch (ServletException | IOException e) {
            throw new RuntimeException(e);
        }
    }
}
