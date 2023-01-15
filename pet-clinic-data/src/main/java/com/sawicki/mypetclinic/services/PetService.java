package com.sawicki.mypetclinic.services;

import com.sawicki.mypetclinic.model.Pet;

import java.util.Set;

public interface PetService{
    Pet findById(Long id);
    Pet save(Pet pet);
    Set<Pet> findAll();
}