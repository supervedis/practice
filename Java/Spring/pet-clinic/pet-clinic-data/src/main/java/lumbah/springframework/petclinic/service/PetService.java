package lumbah.springframework.petclinic.service;

import java.util.Set;

import lumbah.springframework.petclinic.model.Pet;

public interface PetService {

	Pet findById(Long id);

	Pet save(Pet owner);

	Set<Pet> findAll();
}
