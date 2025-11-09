package ma.rest.tp8_spring_restcontroller.repositories;

import ma.rest.tp8_spring_restcontroller.entities.Compte;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CompteRepository extends JpaRepository<Compte, Long> {
}
