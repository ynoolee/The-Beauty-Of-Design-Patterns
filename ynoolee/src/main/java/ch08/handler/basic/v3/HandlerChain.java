package ch08.handler.basic.v3;

import java.util.ArrayList;
import java.util.List;

public class HandlerChain {
    private List<Handler> handlers = new ArrayList<>();

    public void addHandler(Handler handler) {
        this.handlers.add(handler);
    }

    public void handle() {
        for (Handler handler : handlers) {
            final boolean handled = handler.handle();
            if (handled) {
                break;
            }
        }
    }
}
