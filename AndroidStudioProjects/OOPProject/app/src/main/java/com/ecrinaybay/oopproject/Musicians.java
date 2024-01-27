package com.ecrinaybay.oopproject;

public class Musicians {

    private String name;
    private String instrument;

    private int age;

    public Musicians(String name, String instrument, int age){
        this.name = name;
        this.instrument = instrument;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getInstrument() {
        return instrument;
    }

    public void setInstrument(String instrument) {
        this.instrument = instrument;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age,String password) {
        if(password.matches("Atil")){
            this.age = age;
        }
    }

}
