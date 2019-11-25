package lumbah.springframework.petclinic.bootstrap;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import lumbah.springframework.petclinic.model.Owner;
import lumbah.springframework.petclinic.model.Vet;
import lumbah.springframework.petclinic.service.OwnerService;
import lumbah.springframework.petclinic.service.VetService;
import lumbah.springframework.petclinic.service.map.OwnerServiceMap;
import lumbah.springframework.petclinic.service.map.VetServiceMap;

@Component
public class DataLoader implements CommandLineRunner{

	private final OwnerService ownerService;
	private final VetService vetService;
	
	public DataLoader() {
		ownerService = new OwnerServiceMap();
		vetService = new VetServiceMap();
	}
	
	@Override
	public void run(String... args) throws Exception {
		Owner owner1 = new Owner();
		owner1.setId(1L);
		owner1.setFirstName("Ruhila");
		owner1.setLastName("Adatya");
		
		ownerService.save(owner1);
		
		Owner owner2 = new Owner();
		owner2.setId(2L);
		owner2.setFirstName("Fiona");
		owner2.setLastName("Landley");
		
		ownerService.save(owner2);
		
		System.out.println("Loaded owners...");
		
		Vet vet1 = new Vet();
		vet1.setId(1L);
		vet1.setFirstName("Lung");
		vet1.setLastName("Schroader");
		
		vetService.save(vet1);
		
		Vet vet2 = new Vet();
		vet2.setId(2L);
		vet2.setFirstName("Bruce");
		vet2.setLastName("Musundi");
		
		vetService.save(vet2);
		
		System.out.println("Loaded Vets...");
	}

}
