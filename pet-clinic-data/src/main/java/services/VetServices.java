package services;

import modeldata.Pet;
import modeldata.Vet;

import java.util.Set;

public interface VetServices {
   Vet findbyId(Long ID);
    Vet save(Vet vet);
    Set<Vet> findAll();
}

