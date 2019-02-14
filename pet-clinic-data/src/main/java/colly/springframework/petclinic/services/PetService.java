package colly.springframework.petclinic.services;

import colly.springframework.petclinic.model.Owner;
import colly.springframework.petclinic.model.Pet;

import java.util.Set;

public interface PetService {
    Pet findById(Long id);
    Pet save(Pet pet);
    Set<Pet> findAll();
    Set<Pet> findByOwner(Owner owner);
}
