package ch07.decorator.v2;

public class SuperPowerA extends A {

    protected A a;

    public SuperPowerA(final A a) {
        this.a = a;
    }

    public void superPowerUp() {
        System.out.println("Super power up!");
    }

    @Override
    protected String eat() {
        return a.eat();
    }
}
