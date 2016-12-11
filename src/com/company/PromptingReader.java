package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.Buffer;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by rana_ on 12/10/2016.
 */
public class PromptingReader {

    private BufferedReader reader;

    public PromptingReader(BufferedReader reader){
        this.reader = reader;
    }

    public String readString(String promptString) throws IOException{
        System.out.println(promptString);
        return reader.readLine();
    }

    public int readNumber(String promptString) throws IOException{
        System.out.println(promptString);
        return Integer.parseInt(reader.readLine());
    }

    public Date readDate(String promptString) throws IOException{
        System.out.println(promptString);
        Date newDate = null;

        while (true) {
            DateFormat dateFormat = new SimpleDateFormat("DD-MM-YYYY");
            try {
                newDate = dateFormat.parse(reader.readLine());
                return newDate;
            } catch (Exception e) {
                e.printStackTrace();
                System.out.println("The proper format of the date should be DD-MM-YYYY");
            }
        }


    }




    public EmployeeRecord readEmployee() throws IOException{
        System.out.println("Please enter your employee information");

        EmployeeRecord record = new EmployeeRecord();

        record.setTitle(readString("Title>"));
        record.setGender(readString("Gender>"));
        record.setFirstName(readString("First Name > "));
        record.setLastName(readString("Last Name > "));
        record.setDob(readDate("DOB (YYYY-DD-MM)>"));

        System.out.println(" ");
        record.setStreetAndNum(readString("Street Name and number?"));
        record.setState(readString("State>"));
        record.setZipCode(readNumber("ZIP>"));


        record.setHourlyRateCents(readNumber("What is your hourly pay in cents? :"));





        return record;
    }

}
