package io.zipcoder.interfaces;

import java.util.ArrayList;
import java.util.List;

public class People extends ArrayList<Person> {

    public Person findById(long id){
        for(Person p: this){
            if(p.getId() == id){
                return p;
            }
        }

        return null;
    }
}
