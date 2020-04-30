package io.swagger.service;


import io.swagger.model.Exam;

import java.util.List;

public interface ExamService {
    public Exam addExam(Exam Exam);
    public Exam deleteById(long id);
    public List<Exam> findAllEvents();
    public Exam updateEvent(Exam Exam);
    public Exam findById(long id);
    public Exam findByNme(String name);
}
