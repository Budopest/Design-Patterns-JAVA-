package com.company;

import java.util.ArrayList;

public class Invoker {

    private ArrayList<Icommand> commandsList = new ArrayList<Icommand>();
    public void setCommand(Icommand command){
        commandsList.add(command);
    }
    public void execute(int index){
        commandsList.get(index).execute();
    }
}
