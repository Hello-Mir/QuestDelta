package ru.javarush.quest.sawyer.model.service.mapper;

import ru.javarush.quest.sawyer.model.dto.QuestDto;
import ru.javarush.quest.sawyer.model.entity.Entity;
import ru.javarush.quest.sawyer.model.entity.Quest;

public class QuestMapper implements AbstractMapper<QuestDto> {

    @Override
    public Entity map(QuestDto questDto) {
        Quest quest = new Quest();
        quest.setName(questDto.getName());
        quest.setGames(questDto.getGames());
        return quest;
    }
}
