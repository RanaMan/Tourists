package com.company;

/**
 * Created by rana_ on 12/10/2016.
 */
public class StringKebab {

    private StringBuilder builder = new StringBuilder();

    public void append(String string){

      builder
              .append("-")
              .append(string)
              .append("-");
     }

     @Override
     public String toString(){
        return "o-"+ builder.toString() + "->";
     }

     public static void main (String[] args){
        StringKebab kebab = new StringKebab();

        for(String argument:args){
            kebab.append(argument);
        }

        System.out.println(kebab.toString());
     }
}
