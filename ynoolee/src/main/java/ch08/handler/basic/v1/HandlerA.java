package ch08.handler.basic.v1;

public class HandlerA extends Handler {
    @Override
    public void handle() {
        boolean handled = false;
        // 비즈니스코드
        if (!handled && successor != null) {
            successor.handle();
        }
    }
}
