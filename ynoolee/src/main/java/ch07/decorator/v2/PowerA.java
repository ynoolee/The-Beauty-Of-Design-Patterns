package ch07.decorator.v2;

public class PowerA extends A {

    protected A target;

    public PowerA(final A target) {
        this.target = target;
    }

    public void power() {
        System.out.println("Power up!");
    }

    @Override
    public String eat() {
        return "PowerA eat";
    }
}
