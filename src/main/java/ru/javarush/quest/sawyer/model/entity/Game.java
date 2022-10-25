package ru.javarush.quest.sawyer.model.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.concurrent.atomic.AtomicLong;

@Data
@EqualsAndHashCode(callSuper = false)
public class Game extends Entity {
    private AtomicLong id;
    private Long userId;
}