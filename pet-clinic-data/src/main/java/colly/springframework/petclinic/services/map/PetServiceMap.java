package colly.springframework.petclinic.services.map;

import colly.springframework.petclinic.model.Pet;
import colly.springframework.petclinic.services.CrudService;

import java.util.Set;

public class PetServiceMap  extends AbstractMapService<Pet, Long> implements CrudService<Pet, Long> {
    @Override
    public Pet findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Pet save(Pet entity) {
        return super.save(entity.getId(), entity);
    }

    @Override
    public Set<Pet> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(Pet entity) {
        super.delete(entity);
    }
}
