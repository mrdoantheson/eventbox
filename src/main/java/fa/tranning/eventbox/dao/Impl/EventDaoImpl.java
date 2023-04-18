package fa.tranning.eventbox.dao.Impl;

import fa.tranning.eventbox.dao.EventDao;
import fa.tranning.eventbox.model.entity.Event;
import fa.tranning.eventbox.util.HibernateConnectionConfig;
import org.hibernate.Session;

import java.util.List;

public class EventDaoImpl implements EventDao {
    @Override
    public List<Event> findAll() {
        try (Session session = HibernateConnectionConfig.getSession()) {
            return session
                    .createQuery("FROM Event", Event.class)
                    .getResultList();
        }
    }
}
