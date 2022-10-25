package ru.javarush.quest.sawyer.model.repository;

import ru.javarush.quest.sawyer.exceptions.QuestProjectException;
import ru.javarush.quest.sawyer.model.entity.Entity;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.atomic.AtomicLong;

public class AbstractRepository<T extends Entity> implements Repository<T> {
    Map<AtomicLong, T> entityCollection = new HashMap<>();

    @Override
    public Collection<T> getAll() {
        return entityCollection.values();
    }

    @Override
    public AtomicLong find(T entity) {
        return getAll().stream().filter(entity1 -> entity1.equals(entity)).map(Entity::getId).findFirst().orElseThrow(() -> new QuestProjectException("Couldn't find entity with %s".formatted(entity)));
    }

    @Override
    public T get(AtomicLong id) {
        return entityCollection.get(id);
    }

    @Override
    public void create(T entity) {
        entityCollection.put(new AtomicLong(ThreadLocalRandom.current().nextLong()), entity);
    }

    @Override
    public void update(T entity) {
        entityCollection.put(entity.getId(), entity);
    }

    @Override
    public void delete(T entity) {
        if (entityCollection.containsValue(entity)) {
            AtomicLong id = find(entity);
            entityCollection.remove(id);
        } else {
            throw new QuestProjectException("Couldn't delete entity with %s".formatted(entity));
        }
    }
}
