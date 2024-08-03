package ch08.state;

public class SwitchMarioStateMachine {
    private int score;
    private State currentState;

    public SwitchMarioStateMachine() {
        this.score = 0;
        this.currentState = State.SMALL;
    }

    public void obtainMushRoom() {
        if (State.SMALL.equals(currentState)) {
            this.currentState = State.SUPER;
            this.score += 100;
        }
    }

    public void obtainCape() {
        if (State.SMALL.equals(this.currentState) || State.SUPER.equals(this.currentState)) {
            this.currentState = State.CAPE;
            this.score += 200;
        }
    }

    public void obtainFireFlower() {
        if (State.SMALL.equals(this.currentState) || State.SUPER.equals(this.currentState)) {
            this.currentState = State.FIRE;
            this.score += 300;
        }
    }

    public void meetMonster() {
        if (State.SUPER.equals(this.currentState)) {
            this.currentState = State.SMALL;
            this.score -= 100;
            return;
        }
        if (State.CAPE.equals(this.currentState)) {
            this.currentState = State.SMALL;
            this.score -= 200;
            return;
        }
        if (State.FIRE.equals(this.currentState)) {
            this.currentState = State.SMALL;
            this.score -= 300;
            return;
        }
    }

    public int getScore() {
        return score;
    }

    public State getCurrentState() {
        return currentState;
    }
}
