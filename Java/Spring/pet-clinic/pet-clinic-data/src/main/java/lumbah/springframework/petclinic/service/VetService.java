package lumbah.springframework.petclinic.service;

import java.util.Set;

import lumbah.springframework.petclinic.model.Vet;

public interface VetService {

	Vet findById(Long id);

	Vet save(Vet owner);

	Set<Vet> findAll();
}
