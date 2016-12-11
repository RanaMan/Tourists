package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;

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

    public boolean readBoolean(String promptString) throws IOException{
        while(true) {
            String yesNoString = readString(promptString);

            if (yesNoString.equalsIgnoreCase("Y")) {
                return true;
            } else if (yesNoString.equalsIgnoreCase("N")) {
                return false;
            } else {
                System.out.println("Please type either Y or N");
            }
        }
    }


    public EmployeeRecord readEmployee(HashMap<String, EmployeeRecord> roster) throws IOException{
        System.out.println("Please enter your employee information");

        EmployeeRecord record = new EmployeeRecord();

        /* Added a number of new read parameters as part of the exersises */
        //record.setTitle(readString("Title>"));
        //record.setGender(readString("Gender>"));
        record.setFirstName(readString("First Name > "));
        record.setLastName(readString("Last Name > "));
        //record.setDob(readDate("DOB (YYYY-DD-MM)>"));

        if(roster.containsKey(record.getFullName())){
            record = roster.get(record.getFullName());
            System.out.println("Welcome back " + record.getFullName() + ". your job is [" + record.getJob() +"] which means you are a " +
                    "[" + record.getJob().getDescription() +"]");
            return record;
        }

        System.out.println(" ");
        //record.setStreetAndNum(readString("Street Name and number?"));
        //record.setState(readString("State>"));
        //record.setZipCode(readNumber("ZIP>"));

        record.setHourlyRateCents(readNumber("What is your hourly pay in cents? :"));
        Job job = selectValue("What is your job?" , Job.values());
        record.setJob(job);

        roster.put(record.getFullName(), record);

        return record;
    }

    public <T> T selectValue(String prompt, T[] values){
        for (int i=0; i<values.length;i++){
            System.out.println("(" +i+")" + values[i]);
        }
        int index;
        try {
            do {
                index = readNumber(prompt + "(0-" + (values.length - 1) + ")");
            } while (index < 0 || index >= values.length);
            T value = values[index];
            return value;
        }catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }

}
