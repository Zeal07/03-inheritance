package de.thro.inf.prg3.a03.states;

import de.thro.inf.prg3.a03.Cat;
import de.thro.inf.prg3.a03.State;

public class DeathState extends State {

    public DeathState(){
        super(-1);
    }

    @Override
    public State successor(Cat cat) {
        logger.info("Your cat is dead!");
        return this;
    }
}
