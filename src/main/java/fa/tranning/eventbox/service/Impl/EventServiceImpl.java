package fa.tranning.eventbox.service.Impl;

import fa.tranning.eventbox.dao.EventDao;
import fa.tranning.eventbox.dao.Impl.EventDaoImpl;
import fa.tranning.eventbox.model.entity.Event;
import fa.tranning.eventbox.service.EventService;

import java.util.List;

public class EventServiceImpl implements EventService {
    EventDao eventDao = new EventDaoImpl();
    @Override
    public List<Event> findAll() {
        return eventDao.findAll();
    }
}
