package com.idi.springbootididemoandlab.model;

/**
 * @author Evgeny Borisov
 */
public class LombokExamplesMain {


    public static void main(String[] args) {
        Person amir = Person.builder().דג("Carpion").דג("Shark").child("Dan",3).child("Tamar",4).name("Amir").nickname("Moshe").nickname("Sauron").age(55).build();
        System.out.println("amir = " + amir);
    }
}
