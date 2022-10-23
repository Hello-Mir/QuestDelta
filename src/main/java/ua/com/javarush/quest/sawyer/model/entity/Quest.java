package ua.com.javarush.quest.sawyer.model.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.Collection;
import java.util.concurrent.atomic.AtomicLong;

@Data
@EqualsAndHashCode(callSuper = false)
public class Quest extends Entity {
    private AtomicLong id;
    private String name;
    private Long userId;
    private Collection<Game> games;
    private Collection<Answer> answers;
}
