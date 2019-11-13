package lumbah.springframework.petclinic.service;

import lumbah.springframework.petclinic.model.Owner;

public interface OwnerService extends CrudService<Owner, Long>{

	Owner findByLastName(String name);
}
