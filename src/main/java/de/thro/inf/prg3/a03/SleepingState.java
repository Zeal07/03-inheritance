package de.thro.inf.prg3.a03;

public class SleepingState extends State {

    public SleepingState(int duration){
        super(duration);
        super.time++;
    }

    @Override
    public State successor(Cat cat) {
        if(super.time == cat.getSleep()) {
            super.time = 0;
            logger.info("Your cat starts getting hungry");
            return new HungryState(cat.getAwake());
        } else {
            super.time++;
            return this;
        }
    }
}
