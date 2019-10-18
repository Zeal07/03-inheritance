package de.thro.inf.prg3.a03;

public class PlayfulState extends State {

    public PlayfulState(int duration){
        super(duration);
        super.time++;
    }

    @Override
    public State successor(Cat cat) {
        if(super.time == cat.getAwake()) {
            super.time = 0;
            logger.info("Your cat starts getting sleepy");
            return new SleepingState(cat.getSleep());
        } else {
            super.time++;
            return this;
        }
    }
}
