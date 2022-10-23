package ua.com.javarush.quest.sawyer.model.repository;

import ua.com.javarush.quest.sawyer.model.entity.Entity;

import java.util.Collection;
import java.util.concurrent.atomic.AtomicLong;

public interface Repository<T extends Entity> {
    Collection<T> getAll();

    AtomicLong find(T entity);

    T get(AtomicLong id);

    void create(T entity);

    void update(T entity);

    void delete(T entity);
}
