package colly.springframework.petclinic.services;

import colly.springframework.petclinic.model.Vet;

import java.util.Set;

public interface VetService {
    Vet findById(Vet id);
    Vet save(Vet pet);
    Set<Vet> findAll();
    Set<Vet> findByLastName(String lastName);
}
