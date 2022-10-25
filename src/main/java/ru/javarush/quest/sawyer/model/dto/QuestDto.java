package ru.javarush.quest.sawyer.model.dto;

import lombok.Data;
import lombok.EqualsAndHashCode;
import ru.javarush.quest.sawyer.model.entity.Game;

import java.util.Collection;

@Data
@EqualsAndHashCode(callSuper = false)
public class QuestDto extends EntityDto {
    private String name;
    private Long userId;
    private Collection<Game> games;
}
