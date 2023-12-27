package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestPerson {

    @Test
    public void testPersonConstructor(){
        long id = 1L;
        String name = "Tam";
        Person person = new Person(id, name);

        Assert.assertEquals(id, person.getId());
        Assert.assertEquals(name, person.getName());
    }

    @Test
    public void testPersonSetName(){
        long id = 1L;
        String name = "Tam";
        Person person = new Person(id, name);
        String newName = "Maria";

        person.setName(newName);

        Assert.assertEquals(newName, person.getName());
    }

}
