package ru.javarush.quest.sawyer.model.service.mapper;

import ru.javarush.quest.sawyer.model.entity.Entity;

public interface AbstractMapper<EntityDto> {
    Entity map(EntityDto entity);
}
