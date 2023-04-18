package fa.tranning.eventbox.dao;

import fa.tranning.eventbox.model.entity.Event;

import java.util.List;

public interface EventDao {
    List<Event> findAll();
}
