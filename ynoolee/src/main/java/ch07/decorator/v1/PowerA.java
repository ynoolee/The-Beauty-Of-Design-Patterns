package ch07.decorator.v1;

public class PowerA extends A {

    protected A a;

    public PowerA(final A a) {
        this.a = a;
    }

    public void power() {
        System.out.println("Power up!");
    }

    @Override
    public String eat() {
        return "PowerA eat";
    }
}
