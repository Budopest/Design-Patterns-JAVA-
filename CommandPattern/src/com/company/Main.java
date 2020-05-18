package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Lamp firstLamp = new Lamp();
        Lamp secondLamp = new Lamp();
        Invoker remote = new Invoker();
        // set first command to turn on first lamp
        remote.setCommand(new turnONCommand(firstLamp));
        // set second command to turn on second lamp
        remote.setCommand(new turnONCommand(secondLamp));
        // execute the commands
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of the command: ");
        int commandNumber = scanner.nextInt();
        switch (commandNumber){
            case 0 :
                remote.execute(commandNumber);
                break;
            case 1 :
                remote.execute(commandNumber);
                break;

        }



    }
}
