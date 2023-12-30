package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

import java.util.Iterator;

public class TestStudents {

    @Test
    public void testStudents(){
        Students students = Students.getInstance();
        String[] names = new String[]{"Tam", "Tevin", "Christy", "Cesily", "Jia", "Louie", "Gowri", "Nate", "Joey", "Imir", "Corinne","Mike"};
        Iterator<Person> it = students.iterator();

        Assert.assertEquals(names.length, students.count());
        for(int i = 0; i < students.count(); i++){
            Assert.assertEquals(names[i], students.getPersonList().get(i).getName());

        }

    }
}
