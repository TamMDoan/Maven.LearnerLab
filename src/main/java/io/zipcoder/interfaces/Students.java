package io.zipcoder.interfaces;

public final class Students extends People {
    private static final Students INSTANCE = new Students();

    Students(){
        String[] names = new String[]{"Tam", "Tevin", "Christy", "Cesily", "Jia", "Louie", "Gowri", "Nate", "Joey", "Imir", "Corinne","Mike"};
        long id = 1L;

        for(int i = 0; i < names.length; i++){
            Person p = new Person(id, names[i]);
            INSTANCE.add(p);
            id++;
        }
    }

    public Students getInstance(){
        return INSTANCE;
    }
}
