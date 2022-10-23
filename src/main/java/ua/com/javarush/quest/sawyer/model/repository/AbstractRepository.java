package ua.com.javarush.quest.sawyer.model.repository;

import ua.com.javarush.quest.sawyer.exceptions.QuestProjectException;
import ua.com.javarush.quest.sawyer.model.entity.Entity;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.atomic.AtomicLong;

public class AbstractRepository<T extends Entity> implements Repository {
    Map<AtomicLong, Entity> entityCollection = new HashMap<>();

    @Override
    public Collection<Entity> getAll() {
        return entityCollection.values();
    }

    @Override
    public AtomicLong find(Entity entity) {
        return getAll()
                .stream()
                .filter(entity1 -> entity1.equals(entity))
                .map(Entity::getId)
                .findFirst()
                .orElseThrow(() -> new QuestProjectException("Couldn't find entity with %s".formatted(entity)));
    }

    @Override
    public Entity get(AtomicLong id) {
        return entityCollection.get(id);
    }

    @Override
    public void create(Entity entity) {
        entityCollection.put(
                new AtomicLong(ThreadLocalRandom.current().nextLong()),
                entity);
    }

    @Override
    public void update(Entity entity) {
        entityCollection.put(entity.getId(), entity);
    }

    @Override
    public void delete(Entity entity) {
        if (entityCollection.containsValue(entity)) {
            AtomicLong id = find(entity);
            entityCollection.remove(id);
        } else {
            throw new QuestProjectException("Couldn't delete entity with %s".formatted(entity));
        }
    }
}
