package io.swagger.service;

import io.swagger.model.Information;

import java.util.List;

public interface InformationService {
    public Information addInformation(Information Information);
    public Information deleteById(long id);
    public List<Information> findAllInformation();
    public Information updateInformation(Information Information);
    public Information findById(long id);
    public Information findByName(String name);
}
