package org.oleg.bryl.dao;

import org.oleg.bryl.model.People;

import java.util.List;


public interface Dao_People {

    void addPeople(People people);

    People getPeopleById(int people_id);

    List<People> getAllPeoples();

    People getPeopleByUsername(String people_username);
}
