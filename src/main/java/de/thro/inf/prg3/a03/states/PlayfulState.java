package de.thro.inf.prg3.a03.states;

import de.thro.inf.prg3.a03.Cat;
import de.thro.inf.prg3.a03.State;

public class PlayfulState extends State {

    public PlayfulState(int duration) {
        super(duration);
        super.time++;
    }

    @Override
    public State successor(Cat cat) {

        logger.info("Your cat starts getting sleepy");
        return new SleepingState(cat.getSleep());

    }
}
