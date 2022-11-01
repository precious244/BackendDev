package com.ideaco.dia.backendproject.service;

import com.ideaco.dia.backendproject.model.PersonModel;
import com.ideaco.dia.backendproject.repository.PersonRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FirstService {
    private PersonRepository personRepository;

    public FirstService(PersonRepository personRepository){
        this.personRepository = personRepository;
    }

    public String manipulateString(String value){
        return "Manipulated String = "+value;
    }

    public List<PersonModel> getAllPerson(){
        return personRepository.findAll();
    }

    public boolean createPerson(String name, int age, String job, String address){
        PersonModel personModel = new PersonModel();
        personModel.setName(name);
        personModel.setAge(age);
        personModel.setAddress(address);
        personModel.setJob(job);

        personRepository.save(personModel);

        return true;
    }

    public PersonModel getPerson(int personId){
        //validation
        Optional<PersonModel> personOpt = personRepository.findById(personId);
        if(personOpt.isEmpty()){
            return null;
        }else {
            return personOpt.get();
        }
    }

    public PersonModel getByAddress(String address){
        Optional<PersonModel> personOpt = personRepository.findByAddress(address);
        if (personOpt.isEmpty()){
            return null;
        }else {
            return personOpt.get();
        }
    }

    public List<PersonModel> getPersonByAge(int age){
        List<PersonModel> persons = personRepository.findByAgeGreaterThan(age);
        return persons;
    }

}
