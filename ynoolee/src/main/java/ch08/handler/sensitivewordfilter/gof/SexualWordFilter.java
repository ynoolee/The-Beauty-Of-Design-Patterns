package ch08.handler.sensitivewordfilter.gof;

public class SexualWordFilter implements SensitiveWordFilter{
    @Override
    public boolean doFilter(final Content content) {
        boolean legal = true;
        // 알고리즘 수행 하며 적합한지 판단 (변수 상태 변경..)
        return legal;
    }
}
