package io.swagger.service;

import io.swagger.model.Event;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
public interface EventService {
    public Event addEvent(Event Event);
    public Event deleteById(long id);
    public List<Event> findAllEvents();
    public Event updateEvent(Event Event);
    public Event findById(long id);
    public Event findByNme(String name);
}
