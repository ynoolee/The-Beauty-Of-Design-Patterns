package ch08.state;

public class MarioStateMachine {
    private int score;
    private State currentState;

    public MarioStateMachine() {
        this.score = 0;
        this.currentState = State.SMALL;
    }

    public void obtainMushRoom() {

    }

    public void obtainCape() {

    }

    public void obtainFireFlower() {

    }

    public void meetMonster() {

    }

    public int getScore() {
        return score;
    }

    public State getCurrentState() {
        return currentState;
    }
}
