package lumbah.springframework.petclinic.service.map;

import java.util.Set;

import lumbah.springframework.petclinic.model.Pet;
import lumbah.springframework.petclinic.service.CrudService;

public class PetServiceMap extends AbstractMapService<Pet, Long> implements CrudService<Pet, Long>{

	@Override
	public Set<Pet> findAll() {
		
		return super.findAll();
	}
	
	@Override
	public Pet save(Pet object) {
		// TODO Auto-generated method stub
		return super.save(object.getId(), object);
	}
	
	@Override
	public Pet findById(Long id) {
		return super.findById(id);
	}
	
	@Override
	public void deleteById(Long id) {
		super.deleteById(id);
	}
	
	@Override
	public void delete(Pet object) {
		super.delete(object);
	}

}
