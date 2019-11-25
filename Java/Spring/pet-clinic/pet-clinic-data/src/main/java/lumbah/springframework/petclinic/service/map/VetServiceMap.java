package lumbah.springframework.petclinic.service.map;

import java.util.Set;

import lumbah.springframework.petclinic.model.Vet;
import lumbah.springframework.petclinic.service.CrudService;

public class VetServiceMap extends AbstractMapService<Vet, Long> implements CrudService<Vet, Long>{

	@Override
	public Set<Vet> findAll() {
		
		return super.findAll();
	}
	
	@Override
	public Vet save(Vet object) {
		// TODO Auto-generated method stub
		return super.save(object.getId(), object);
	}
	
	@Override
	public Vet findById(Long id) {
		return super.findById(id);
	}
	
	@Override
	public void deleteById(Long id) {
		super.deleteById(id);
	}
	
	@Override
	public void delete(Vet object) {
		super.delete(object);
	}

}