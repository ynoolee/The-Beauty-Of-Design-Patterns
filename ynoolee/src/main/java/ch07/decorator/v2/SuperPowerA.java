package ch07.decorator.v2;

public class SuperPowerA extends A {

    protected A target;

    public SuperPowerA(final A target) {
        this.target = target;
    }

    public void superPowerUp() {
        System.out.println("Super power up!");
    }

    @Override
    protected String eat() {
        return target.eat();
    }
}
