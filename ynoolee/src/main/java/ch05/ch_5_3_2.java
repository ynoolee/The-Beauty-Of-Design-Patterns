package ch05;

import java.util.concurrent.atomic.AtomicInteger;

public class ch_5_3_2 {
    public static class RangeLimiter {
        private static AtomicInteger position = new AtomicInteger(0);
        public static final int MAX_LIMIT = 5;
        public static final int MIN_LIMIT = -5;

        public boolean move(int delta) {
            int currentPos = position.addAndGet(delta);
            return (currentPos <= MAX_LIMIT) && (currentPos >= MIN_LIMIT);
        }
    }
}
