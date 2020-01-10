package de.thro.inf.prg3.a03.states;

import de.thro.inf.prg3.a03.Cat;
import de.thro.inf.prg3.a03.State;

public class HungryState extends State {

    public HungryState(int duration) {
        super(duration);
        super.time++;
    }

    @Override
    public State successor(Cat cat) {

        logger.info("Your cat died!");
        return new DeathState();
    }

    public State feed(Cat animal) {
        logger.info("mmmhhh yummy");
        return new DigestingState(animal.getDigest());
    }
}
