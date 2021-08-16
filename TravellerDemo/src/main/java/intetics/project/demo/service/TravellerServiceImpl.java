package intetics.project.demo.service;

import intetics.project.demo.model.Traveller;
import intetics.project.demo.repository.TravellerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class TravellerServiceImpl implements TravellerService {

    @Autowired
    TravellerRepository travellerRepository;

    @Override
    public Traveller getById(Long id) {
        return travellerRepository.findOne(id);
    }

    @Override
    public void save(Traveller traveller) {
        travellerRepository.save(traveller);
    }

    @Override
    public void delete(Long id) {
        travellerRepository.delete(id);
    }

    @Override
    public List<Traveller> getAll() {
        return travellerRepository.findAll();
    }
}
