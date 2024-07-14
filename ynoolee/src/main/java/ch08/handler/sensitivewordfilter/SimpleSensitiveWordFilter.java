package ch08.handler.sensitivewordfilter;

import ch08.handler.sensitivewordfilter.gof.Content;

public class SimpleSensitiveWordFilter {
    public boolean filter(Content content) {
        if (!filterViolenceWord(content)) {
            return false;
        }
        if (!filterSexualWord(content)) {
            return false;
        }

        return true;
    }

    private boolean filterViolenceWord(final Content content) {
        return false;
    }

    private boolean filterSexualWord(final Content content) {
        return false;
    }
}
