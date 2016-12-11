package com.company;

/**
 * Created by rana_ on 12/11/2016.
 */
public enum Job {

    /* this is half an abstract class, half an interface, and half a regular object */
    BOSS("a domineering bos"),
    PEON("a downtrodden peon"),
    CONSULTANT ("a highly-paid consultant");

    private final String description;

    /* this is the constructor which the above implementations of Job is going to leverage...*/
    private Job(String description){
        this.description = description;
    }

    /*Overriding to String method to show which type of job has been created...*/
    @Override
    public String toString(){
        String variableName = super.toString();
        String firstLetter = variableName.substring(0,1);
        String remainingLetters = variableName.substring(1);

        return firstLetter+remainingLetters.toLowerCase();
    }

    public String getDescription() {
        return description;
    }
}
