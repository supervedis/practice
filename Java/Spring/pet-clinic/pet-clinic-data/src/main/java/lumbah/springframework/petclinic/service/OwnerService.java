package lumbah.springframework.petclinic.service;

import java.util.Set;

import lumbah.springframework.petclinic.model.Owner;

public interface OwnerService {

	Owner findByLastName(String name);

	Owner findById(Long id);

	Owner save(Owner owner);

	Set<Owner> findAll();
}
