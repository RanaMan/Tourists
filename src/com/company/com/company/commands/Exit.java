package com.company.com.company.commands;

import com.company.com.company.interfaces.Command;
import com.company.com.company.interfaces.Description;

import java.io.IOException;

/**
 * Created by rana_ on 12/11/2016.
 */
public class Exit implements Command, Description{

    @Override
    public boolean performCommand() throws IOException {
        System.out.println("Goodbye Fair user!");
        return false;
    }

    @Override
    public String getDescription() {
        return "Exit";
    }
}
