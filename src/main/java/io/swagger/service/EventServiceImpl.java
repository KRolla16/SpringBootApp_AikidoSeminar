package io.swagger.service;

import io.swagger.model.Event;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

public class EventServiceImpl implements EventService {

    @Autowired
    private EventRepository eventRepository;

    @Override
    public Event addEvent(Event Event) {
        return eventRepository.save(Event);
    }

    @Override
    public Event deleteById(long id) {
        Optional<Event> e = eventRepository.findById(id);
        if(e.isPresent()) eventRepository.deleteById(id);
        return e.get();
    }

    @Override
    public List<Event> findAllEvents() {
        return eventRepository.findAll();
    }

    @Override
    public Event updateEvent(Event Event) {
        Optional<Event> e = eventRepository.findById(Event.getId());
		if(e.isPresent())
		{ e.get().setCategory(Event.getCategory());
		  e.get().setName(Event.getName());
		  e.get().setDescription(Event.getDescription());
            e.get().setDate(Event.getDate());
            e.get().setRoom(Event.getRoom());
            e.get().setTrainer(Event.getTrainer());
		  eventRepository.save(e.get());
		  return e.get();}
		else return null;
    }

    @Override
    public Event findById(long id) {
        Optional<Event> e = eventRepository.findById(id);
        if(e.isPresent()) return e.get();
        else return null;
    }

    @Override
    public Event findByNme(String name) {
        Optional<Event> u = eventRepository.findByName(name);
        if(u.isPresent()) return u.get();
        else return null;
    }
}
