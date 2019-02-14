package colly.springframework.petclinic.services;

import colly.springframework.petclinic.model.Owner;
import colly.springframework.petclinic.model.Pet;

import java.util.Set;

public interface PetService extends CrudService<Pet, Long> {
    Set<Pet> findByOwner(Owner owner);
}
