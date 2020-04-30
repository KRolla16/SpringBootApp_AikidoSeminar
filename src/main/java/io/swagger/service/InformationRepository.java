package io.swagger.service;

import io.swagger.model.Category;
import io.swagger.model.Information;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;

public interface InformationRepository extends JpaRepository<Information, Long> {

    @Modifying
    @Query("update Information i set " + "i.category = ?1," + "i.name = ?2, " +
            "i.description = ?3, " + "i.date = ?4, "  +
            "i.author = ?5 " + "where i.category like ?1") //

    void updateEventById(Category category, String
            name, String description, String date, String author);


    Optional<Information> findByName(String name);
}
