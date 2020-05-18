package com.company;

public interface Icommand {
    void execute();
    void unexecute();
}

 class turnONCommand implements Icommand {

    private Lamp lamp;
    public turnONCommand(Lamp lamp){
        this.lamp = lamp;
    }

    @Override
    public void execute() {
        lamp.turnON();
    }

    @Override
    public void unexecute() {
        lamp.turnOFF();
    }
}

class turnOFFCommand implements Icommand {

    private Lamp lamp;
    public turnOFFCommand(Lamp lamp){
        this.lamp = lamp;
    }

    @Override
    public void execute() {
        lamp.turnOFF();
    }

    @Override
    public void unexecute() {
        lamp.turnON();
    }
}

class dimUPCommand implements Icommand {

    private Lamp lamp;
    public dimUPCommand(Lamp lamp){
        this.lamp = lamp;
    }

    @Override
    public void execute() {
        lamp.dimUP();
    }

    @Override
    public void unexecute() {
        lamp.dimDOWN();
    }
}

class dimDOWNCommand implements Icommand {

    private Lamp lamp;
    public dimDOWNCommand(Lamp lamp){
        this.lamp = lamp;
    }

    @Override
    public void execute() {
        lamp.dimDOWN();
    }

    @Override
    public void unexecute() {
        lamp.dimUP();
    }
}