package ch07.decorator.v1;

public class SuperPowerA extends A {

    protected A target;

    public SuperPowerA(final A target) {
        this.target = target;
    }

    public void superPowerUp() {
        System.out.println("Super power up!");
    }

    // SuperPowerA 는 eat 을 구현하지 않았다
}
