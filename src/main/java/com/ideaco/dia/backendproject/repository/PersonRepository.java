package com.ideaco.dia.backendproject.repository;

import com.ideaco.dia.backendproject.model.PersonModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface PersonRepository extends JpaRepository<PersonModel, Integer> {
    Optional<PersonModel> findByAddress(String address);

    List<PersonModel> findByAgeGreaterThan(int age);
}
