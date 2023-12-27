package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestStudents {

    @Test

    public void testStudents(){
        Students students = new Students();
        String[] names = new String[]{"Tam", "Tevin", "Christy", "Cesily", "Jia", "Louie", "Gowri", "Nate", "Joey", "Imir", "Corinne","Mike"};

        for(int i = 0; i < names.length; i++){
            Assert.assertEquals(names[i], students.getInstance().get(i).getName());
        }

    }
}
