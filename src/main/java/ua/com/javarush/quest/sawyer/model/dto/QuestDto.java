package ua.com.javarush.quest.sawyer.model.dto;

import ua.com.javarush.quest.sawyer.model.entity.Game;

import java.util.Collection;

public class QuestDto {
    private String name;
    private Long userId;
    private Collection<Game> games;
}
