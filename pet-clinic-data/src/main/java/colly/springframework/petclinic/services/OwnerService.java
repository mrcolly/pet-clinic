package colly.springframework.petclinic.services;

import colly.springframework.petclinic.model.Owner;

import java.util.Set;

public interface OwnerService extends CrudService<Owner, Long> {
    Set<Owner> findByLastName(String lastName);
}
