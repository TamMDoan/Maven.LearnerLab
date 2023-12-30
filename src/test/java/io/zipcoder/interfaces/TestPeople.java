package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestPeople {

    @Test
    public void testAdd(){
        Person p = new Person(1L, "Tam");
        People people = new People();

        Assert.assertTrue(people.add(p));
        Assert.assertTrue(people.count() > 0);
    }

    @Test
    public void testRemove(){
        Person p = new Person(1L, "Tam");
        Person p2 = new Person(2L, "Maria");
        People people = new People();

        people.add(p);
        people.add(p2);

        people.remove(p);

        Assert.assertTrue(people.count() == 1);
    }

    @Test
    public void testFindById(){
        Person p = new Person(1L, "Tam");
        Person p2 = new Person(2L, "Maria");
        People people = new People();

        people.add(p);
        people.add(p2);

        Assert.assertEquals(p2, people.findById(2L));
    }
}
