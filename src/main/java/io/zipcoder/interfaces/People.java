package io.zipcoder.interfaces;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class People extends ArrayList<Person> implements Iterable<Person> {
    List<Person> personList = new ArrayList<>();

    public People(){
    }

    public boolean add(Person p){
        return personList.add(p);
    }

    public Person findById(long id){
        for(Person p: this){
            if(p.getId() == id){
                return p;
            }
        }

        return null;
    }

    public boolean contains(Person p){
        return this.personList.contains(p);
    }

    public boolean remove(Person p){
        return this.personList.remove(p);
    }

    public boolean remove(Long id){
        for(Person p: this.personList){
            if(p.getId() == id){
                return this.personList.remove(p);
            }
        }

        return false;
    }

    public void removeAll(){
        this.personList.removeAll(this.personList);
    }

    public int count(){
        return this.personList.size();
    }

    public Person[] toArray(){
        Person[] persons = new Person[count()];
        return this.personList.toArray(persons);
    }

    public Iterator<Person> iterator(){
        return this.personList.listIterator();
    }

    public List<Person> getPersonList(){
        return this.personList;
    }
}
