package services;

import models.Adresse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repositories.AdresseRepository;

import java.util.List;

@Service
public class AdresseService {
    @Autowired
    private AdresseRepository adresseRepository;

    public List<Adresse> findAll() {
        return adresseRepository.findAll();
    }

    public Adresse save(Adresse adresse) {
        return adresseRepository.save(adresse);
    }

    public void delete(Long id) {
        adresseRepository.deleteById(id);
    }
}