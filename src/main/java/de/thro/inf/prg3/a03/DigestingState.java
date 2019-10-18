package de.thro.inf.prg3.a03;

public class DigestingState extends State {

    public DigestingState(int duration){
        super(duration);
        super.time++;
    }

    @Override
    public State successor(Cat cat) {
        if(super.time == cat.getDigest()) {
            super.time = 0;
            logger.info("Miau");
            return new PlayfulState(cat.getAwake());
        } else {
            super.time++;
            return this;
        }
    }
}
