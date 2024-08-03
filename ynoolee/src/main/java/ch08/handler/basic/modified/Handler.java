package ch08.handler.basic.modified;

public abstract class Handler {
    protected Handler successor = null;

    public void setSuccessor(Handler successor) {
        this.successor = successor;
    }

    public final void handle() {
        doHandle();
        if (successor != null) { // doHandle() 의 결과와 상관없이 다음 프로세서를 호출
            successor.handle();
        }
    }

    protected abstract boolean doHandle(); // 비즈니스코드
}
