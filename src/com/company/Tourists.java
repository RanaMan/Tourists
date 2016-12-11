package com.company;

/**
 * Created by rana_ on 12/10/2016.
 */
public class Tourists {

    public static boolean isToStringEqual(Object object, String string){
        if(object == null || string == null){
            return object == null && string == null;
        }
        String builderString = object.toString();
        return builderString.equals(string);
    }

    public static void main(String[] args){
        System.out.println("Is null equal to \"\"? " + Tourists.isToStringEqual(null, ""));
        System.out.println("Is the new StringBuilder equal to \"\"? "+ Tourists.isToStringEqual(new StringBuilder(), ""));
        System.out.println("Is new StringBuilder(wiener dog) equal to \"\" ? "+ Tourists.isToStringEqual(new StringBuilder("Wiener dog"), ""));
    }

}
