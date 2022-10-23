package ua.com.javarush.quest.sawyer.model.entity;

import java.util.concurrent.atomic.AtomicLong;

public abstract class Entity {
    public abstract AtomicLong getId();

    public abstract void setId(AtomicLong id);
}
