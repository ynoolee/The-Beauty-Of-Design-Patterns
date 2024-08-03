package ch07.proxy.dto;

public class RequestInfo {

    private final String login;
    private final long responseTime;
    private final long startTimestamp;

    public RequestInfo(final String login, final long responseTime, final long startTimestamp) {
        this.login = login;
        this.responseTime = responseTime;
        this.startTimestamp = startTimestamp;
    }
}
