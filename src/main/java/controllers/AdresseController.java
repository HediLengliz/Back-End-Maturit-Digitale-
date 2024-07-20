package controllers;

import models.Adresse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import services.AdresseService;

import java.util.List;

@RestController
@RequestMapping("/api/adresses")
public class AdresseController {
    @Autowired
    private AdresseService adresseService;

    @GetMapping
    public List<Adresse> getAllAdresses() {
        return adresseService.findAll();
    }

    @PostMapping
    public Adresse createAdresse(@RequestBody Adresse adresse) {
        return adresseService.save(adresse);
    }

    @DeleteMapping("/{id}")
    public void deleteAdresse(@PathVariable Long id) {
        adresseService.delete(id);
    }
}
