package ch07.proxy.v1;

import ch07.proxy.dto.RequestInfo;
import ch07.proxy.dto.UserVo;

public class UserController {

    private MetricsCollector metricsCollector; // DI - 성능통계 기능 책임을 가진 객체

    public UserVo login(String telephone, String password) {
        long startTimestamp = System.currentTimeMillis();

        // login code....

        long endTimeStamp = System.currentTimeMillis();
        long responseTime = endTimeStamp - startTimestamp;
        RequestInfo requestInfo = new RequestInfo("login", responseTime, startTimestamp);
        metricsCollector.recordRequest(requestInfo);

        //UserVo 데이터 반환
        return null;
    }

    public UserVo register(String telephone, String password) {
        long startTimestamp = System.currentTimeMillis();

        // register code....

        long endTimeStamp = System.currentTimeMillis();
        long responseTime = endTimeStamp - startTimestamp;
        RequestInfo requestInfo = new RequestInfo("login", responseTime, startTimestamp);
        metricsCollector.recordRequest(requestInfo);

        //UserVo 데이터 반환
        return null;
    }

}
