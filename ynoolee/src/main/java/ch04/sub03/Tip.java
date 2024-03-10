package ch04.sub03;

import java.util.Calendar;
import java.util.Date;

public class Tip {

    public void invest(long userId, long financialProductId) {
        final Calendar calendar = Calendar.getInstance();
        calendar.setTime(new Date());
        calendar.set(Calendar.DATE, (calendar.get(Calendar.DATE) + 1));
        if (calendar.get(Calendar.DAY_OF_MONTH) == 1) {
            return;
        }
    }

    public void refactoredInvest(long userId, long financialProductId) {
        if (isLastDayOfMonth(new Date())) {
            return;
        }
    }

    public boolean isLastDayOfMonth(Date date) {
        final Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.set(Calendar.DATE, (calendar.get(Calendar.DATE) + 1));
        if (calendar.get(Calendar.DAY_OF_MONTH) == 1) {
            return true;
        }
        return false;
    }

    private static class Flag {
        public void buyCourse(long userId, long courseId, boolean isVip) {
            if (isVip) {
                //
            }
            //
        }
    }

    private static class NonFlag {
        public void caller() {
            if (true) {
                buyCourseForVip(1L, 2L);
            } else {
                buyCourse(1L, 2L);
            }
        }

        public void buyCourse(long userId, long courseId) {
        }

        public void buyCourseForVip(long userId, long courseId) {

        }
    }
}
