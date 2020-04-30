package io.swagger.service;

import io.swagger.model.Exam;
import io.swagger.model.Information;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

public class InformationServiceImpl implements InformationService {

    @Autowired
    private InformationRepository informationRepository;

    @Override
    public Information addInformation(Information Information) {
        return informationRepository.save(Information);
    }

    @Override
    public Information deleteById(long id) {
        Optional<Information> i = informationRepository.findById(id);
        if(i.isPresent()) informationRepository.deleteById(id);
        return i.get();
    }

    @Override
    public List<Information> findAllInformation() {
        return informationRepository.findAll();
    }

    @Override
    public Information updateInformation(Information Information) {
        Optional<Information> i = informationRepository.findById(Information.getId());
        if(i.isPresent())
        { i.get().setCategory(Information.getCategory());
            i.get().setName(Information.getName());
            i.get().setDescription(Information.getDescription());
            i.get().setDate(Information.getDate());
            i.get().setAuthor(Information.getAuthor());
            informationRepository.save(i.get());
            return i.get();}
        else return null;
    }

    @Override
    public Information findById(long id) {
        Optional<Information> i = informationRepository.findById(id);
        if(i.isPresent()) return i.get();
        else return null;
    }

    @Override
    public Information findByName(String name) {
        Optional<Information> i = informationRepository.findByName(name);
        if(i.isPresent()) return i.get();
        else return null;
    }
}
