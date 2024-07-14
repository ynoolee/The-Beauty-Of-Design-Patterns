package ch08.handler.sensitivewordfilter.modified;

import java.util.ArrayList;
import java.util.List;

public class SensitiveWordFilterChain {
    private List<SensitiveWordFilter> filters = new ArrayList<>();

    public void addFilter(SexualWordFilter filter) {
        this.filters.add(filter);
    }

    public boolean filter(Content content) {
        for (SensitiveWordFilter filter : filters) {
            if(!filter.doFilter(content)) {
                return false;
            }
        }

        return true;
    }
}
