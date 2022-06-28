package services;

import modeldata.Owner;

import java.util.List;

public interface OwnerServices {
    Owner findByLastName(String lastName);
    Owner save(Owner owner);

    List<Owner> findAll();
}
