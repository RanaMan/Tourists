package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) {
        try {
            InputStreamReader reader = new InputStreamReader(System.in);
            BufferedReader bufferedReader = new BufferedReader(reader);

            PromptingReader prompter = new PromptingReader(bufferedReader);
            EmployeeRecord record = prompter.readEmployee();

            int hoursWorked = prompter.readNumber("How many hours did you work today?");
            float pay = hoursWorked * record.getHourlyRateDollars();

            System.out.println(record.getFullName() + " will be paid " + pay + " dollars today!");


        }catch(IOException e){
            System.out.println("Input Error: " + e);
        }

	}
}
