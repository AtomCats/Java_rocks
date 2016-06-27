package com.tasks.first;

import java.io.IOException;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

/**
 * Created by Admin on 27.06.2016.
 */
public class Main {
    public static void main(String[ ] args)
    {

        First task = new First();
        try {
            task.greetings();
            }
        catch (IOException e)
        {
            System.out.println("Suck!");
        }
    }
}
