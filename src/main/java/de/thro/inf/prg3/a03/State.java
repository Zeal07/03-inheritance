package de.thro.inf.prg3.a03;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

abstract public class State{
    protected static final Logger logger = LogManager.getLogger();

    // Attribute
    protected int time;
    private int duration;

    public State (int duration){
        this.duration = duration;
        this.time = 0;
    }

    // Methoden
    public State tick (Cat cat){

        if(time == duration) {
            time = 0;
            return successor(cat);
        } else {
            time++;
            return this;
        }
    }

    public abstract State successor(Cat cat);
}
