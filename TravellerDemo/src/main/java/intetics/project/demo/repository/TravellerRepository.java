package intetics.project.demo.repository;

import intetics.project.demo.model.Traveller;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TravellerRepository extends JpaRepository<Traveller, Long> {
}
