package ch07.decorator.v1;

public class SuperPowerA extends A {

    protected A a;

    public SuperPowerA(final A a) {
        this.a = a;
    }

    public void superPowerUp() {
        System.out.println("Super power up!");
    }

    // SuperPowerA 는 eat 을 구현하지 않았다
}
