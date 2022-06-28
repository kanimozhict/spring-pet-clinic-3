package services;

import modeldata.Pet;

import java.util.Set;

public interface PetServices {
    Pet findbyId(Long ID);
    Pet save(Pet pet);
    Set<Pet> findAll();
}
