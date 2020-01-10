package de.thro.inf.prg3.a03.states;

import de.thro.inf.prg3.a03.Cat;
import de.thro.inf.prg3.a03.State;

public class SleepingState extends State {

    public SleepingState(int duration) {
        super(duration);
        super.time++;
    }

    @Override
    public State successor(Cat cat) {

        logger.info("Your cat starts getting hungry");
        return new HungryState(cat.getAwake());

    }
}
