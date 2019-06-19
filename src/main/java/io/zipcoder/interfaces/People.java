package io.zipcoder.interfaces;

import java.lang.reflect.Array;
import java.util.*;

public abstract class People<E extends Person> implements Iterable<E> {
    ArrayList<E> personList;

    public People(){
        this.personList = new ArrayList<>();
    }


    public int size() {
        return this.personList.size();
    }

    public boolean contains(E person) {
        return personList.contains(person);
    }

    public Person findByID(Long id) {
        for (E person : personList) {
            if (person.getId().equals(id))
                return person;
            }
        return null;
    }

    public boolean add(E person) {
        return personList.add(person);
    }

    public boolean remove(E person) {
        return personList.remove(person);
    }

    public boolean remove(Long id) {
        for (E person : personList) {
            if (person.getId().equals(id))
                return personList.remove(person);
        }
        return false;
    }

    public void removeAll() {
        personList.clear();
    }

    public Integer count() {
        return personList.size();
    }

    public Person[] toArray() { return (Person[]) personList.toArray(); }

    public Iterator<E> iterator(){
        return this.iterator();
    }


}