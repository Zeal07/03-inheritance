package de.thro.inf.prg3.a03.states;

import de.thro.inf.prg3.a03.Cat;
import de.thro.inf.prg3.a03.State;

public class DigestingState extends State {

    public DigestingState(int duration) {
        super(duration);
        super.time++;
    }

    @Override
    public State successor(Cat cat) {
        logger.info("Miau");
        return new PlayfulState(cat.getAwake());
    }
}
