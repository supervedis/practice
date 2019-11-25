package lumbah.springframework.petclinic.service.map;

import java.util.Set;

import lumbah.springframework.petclinic.model.Owner;
import lumbah.springframework.petclinic.service.CrudService;
import lumbah.springframework.petclinic.service.OwnerService;

public class OwnerServiceMap extends AbstractMapService<Owner, Long> implements OwnerService{

	@Override
	public Set<Owner> findAll() {
		
		return super.findAll();
	}

	@Override
	public Owner save(Owner object) {
		return super.save(object.getId(), object);
	}

	@Override
	public Owner findById(Long id) {
		return super.findById(id);
	}
	
	@Override
	public void deleteById(Long id) {
		super.deleteById(id);
	}
	
	@Override
	public void delete(Owner object) {
		super.delete(object);
	}

	@Override
	public Owner findByLastName(String name) {
		// TODO Auto-generated method stub
		return null;
	}
}
