package io.zipcoder.interfaces;

public class Students extends People {
    private static final Students INSTANCE = new Students();

    private Students(){
        populateInstance();
    }

    public static Students getInstance(){
        if(INSTANCE == null){
            return new Students();
        }
        return INSTANCE;
    }

    private void populateInstance(){
        String[] names = new String[]{"Tam", "Tevin", "Christy", "Cesily", "Jia", "Louie", "Gowri", "Nate", "Joey", "Imir", "Corinne","Mike"};
        long id = 1L;
        for (String name : names) {
            Student p = new Student(id, name);
            this.getPersonList().add(p);
            id++;
        }
    }
}
