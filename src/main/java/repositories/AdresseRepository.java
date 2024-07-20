package repositories;

import models.Adresse;
import org.aspectj.apache.bcel.util.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AdresseRepository extends Repository {
    List<Adresse> findAll();

    Adresse save(Adresse adresse);

    void deleteById(Long id);
}