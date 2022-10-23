package ua.com.javarush.quest.sawyer.exceptions;

public class QuestProjectException extends RuntimeException {
    public QuestProjectException(String message) {
        super(message);
    }
    public QuestProjectException(String message, Throwable exception) {
        super(message, exception);
    }

    public QuestProjectException() {

    }

}
