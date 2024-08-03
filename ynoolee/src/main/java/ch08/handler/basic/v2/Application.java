package ch08.handler.basic.v2;

public class Application {
    public static void main(String[] args) {
        final HandlerChain chain = new HandlerChain();
        chain.addHandler(new HandlerA());
        chain.addHandler(new HandlerB());
        chain.handle();
    }
}
