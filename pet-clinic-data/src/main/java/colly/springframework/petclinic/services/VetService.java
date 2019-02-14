package colly.springframework.petclinic.services;

import colly.springframework.petclinic.model.Vet;

import java.util.Set;

public interface VetService extends CrudService<Vet, Long>{
    Set<Vet> findByLastName(String lastName);
}
