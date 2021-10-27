package org.oleg.bryl.services;

import org.oleg.bryl.model.People;

import java.util.List;


public interface PeopleService {

    void addPeople(People people);

    People getPeopleById(int people_id);

    List<People> getAllPeoples();

    People getPeopleByUsername(String people_username);

}
