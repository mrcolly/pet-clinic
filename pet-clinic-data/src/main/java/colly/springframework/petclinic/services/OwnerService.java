package colly.springframework.petclinic.services;

import colly.springframework.petclinic.model.Owner;

import java.util.Set;

public interface OwnerService {
    Owner findById(Long id);
    Owner save(Owner owner);
    Set<Owner> findAll();
    Set<Owner> findByLastName(String lastName);
}
