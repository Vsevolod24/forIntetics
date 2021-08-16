package intetics.project.demo.service;

import intetics.project.demo.model.Traveller;

import java.util.List;

public interface TravellerService {

    Traveller getById(Long id);

    void save(Traveller traveller);

    void delete(Long id);

    List<Traveller> getAll();
}
