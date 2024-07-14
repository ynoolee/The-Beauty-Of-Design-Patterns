package ch08.handler.servlet;

public class ApplicationFilterChain implements FilterChain{
    private int pos = 0; // 현재 실행 중인 필터
    private int n; // 필터 수
    private ApplicationFilterConfig[] filters;
    private Servlet servlet;

}
