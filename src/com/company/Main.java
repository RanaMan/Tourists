package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
        try {
            InputStreamReader reader = new InputStreamReader(System.in);
            BufferedReader bufferedReader = new BufferedReader(reader);

            PromptingReader prompter = new PromptingReader(bufferedReader);

            HashMap<String, EmployeeRecord> roster = new HashMap<>();

            while (true) {
                processEmployee(prompter, roster);

                boolean shouldContinue = prompter.readBoolean("Enter another Employee? ");
                if (!shouldContinue){
                    break;
                }
            }

        }catch(IOException e){
            System.out.println("Input Error: " + e);
        }

	}

    private static void processEmployee(PromptingReader prompter, HashMap<String, EmployeeRecord> roster) throws IOException {
        EmployeeRecord record = prompter.readEmployee(roster);

        int hoursWorked = prompter.readNumber("How many hours did you work today?");
        float pay = hoursWorked * record.getHourlyRateDollars();

        System.out.println(record.getFullName() + " will be paid " + pay + " dollars today!");

        record.addHoursWorked(hoursWorked);
        int daysWorked = record.getDaysWorked();

        int totalHoursWorked = record.getTotalHoursWorked();
        float avgHoursWorked = totalHoursWorked/(float)daysWorked;

        System.out.println("They have worked [" + daysWorked +"] days so far.");
        System.out.println(" "+totalHoursWorked+ " total hours worked, average: " + avgHoursWorked + " hours / day ");
    }
}
