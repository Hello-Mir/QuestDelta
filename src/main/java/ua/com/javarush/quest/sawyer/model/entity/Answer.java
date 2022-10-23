package ua.com.javarush.quest.sawyer.model.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.concurrent.atomic.AtomicLong;

@Data
@EqualsAndHashCode(callSuper = false)
public class Answer extends Entity {
    private AtomicLong id;
    private Long questId;
    private String text;
}
