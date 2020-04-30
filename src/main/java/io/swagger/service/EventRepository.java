package io.swagger.service;

import io.swagger.model.Category;
import io.swagger.model.Event;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;

public interface EventRepository extends JpaRepository<Event, Long> {

    @Modifying

    @Query("update Event e set " + "e.category = ?1," + "e.name = ?2, " +
            "e.description = ?3, " + "e.date = ?4, " + "e.room = ?5, " +
            "e.trainer = ?6 " + "where e.category like ?1") //

    void updateEventById(Category category, String
            name, String description, String date, String room, String trainer);


    Optional<Event> findByName(String name);
}
