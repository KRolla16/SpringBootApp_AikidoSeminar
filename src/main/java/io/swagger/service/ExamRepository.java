package io.swagger.service;

import io.swagger.model.Category;
import io.swagger.model.Exam;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;

public interface ExamRepository extends JpaRepository<Exam, Long> {

    @Modifying

    @Query("update Exam ex set " + "ex.category = ?1," + "ex.name = ?2, " +
            "ex.description = ?3, " + "ex.date = ?4, " + "ex.room = ?5, " +
            "ex.examinator = ?6 " + "where ex.category like ?1") //

    void updateEventById(Category category, String
            name, String description, String date, String room, String examinator);


    Optional<Exam> findByName(String name);
}
