package io.swagger.service;

import io.swagger.model.Exam;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

public class ExamServiceImpl implements ExamService {

    @Autowired
    private ExamRepository examRepository;

    @Override
    public Exam addExam(Exam Exam) {
        return examRepository.save(Exam);
    }

    @Override
    public Exam deleteById(long id) {
        Optional<Exam> e = examRepository.findById(id);
        if(e.isPresent()) examRepository.deleteById(id);
        return e.get();
    }

    @Override
    public List<Exam> findAllEvents() {
        return examRepository.findAll();
    }

    @Override
    public Exam updateEvent(Exam Exam) {
        Optional<Exam> e = examRepository.findById(Exam.getId());
        if(e.isPresent())
        { e.get().setCategory(Exam.getCategory());
            e.get().setName(Exam.getName());
            e.get().setDescription(Exam.getDescription());
            e.get().setDate(Exam.getDate());
            e.get().setRoom(Exam.getRoom());
            e.get().setExaminator(Exam.getExaminator());
            examRepository.save(e.get());
            return e.get();}
        else return null;
    }

    @Override
    public Exam findById(long id) {
        Optional<Exam> e = examRepository.findById(id);
        if(e.isPresent()) return e.get();
        else return null;
    }

    @Override
    public Exam findByNme(String name) {
        Optional<Exam> u = examRepository.findByName(name);
        if(u.isPresent()) return u.get();
        else return null;
    }
}
