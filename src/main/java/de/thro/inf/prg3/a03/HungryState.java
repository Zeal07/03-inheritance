package de.thro.inf.prg3.a03;

public class HungryState extends State {

    public HungryState(int duration){
        super(duration);
        super.time++;
    }

    @Override
    public State successor(Cat cat) {
        if(super.time == cat.getAwake()) {
            super.time = 0;
            logger.info("Your cat died!");
            return new DeathState();
        } else {
            super.time++;
            return this;
        }
    }

    public State feed (Cat animal) {
        super.time = 0;
        logger.info("mmmhhh yummy");
        return new DigestingState(animal.getDigest());
    }
}
