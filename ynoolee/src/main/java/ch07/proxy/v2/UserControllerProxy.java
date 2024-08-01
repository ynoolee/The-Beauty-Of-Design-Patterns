package ch07.proxy.v2;

import ch07.proxy.dto.RequestInfo;
import ch07.proxy.dto.UserVo;
import ch07.proxy.v1.MetricsCollector;

public class UserControllerProxy implements IUserController{

    private final MetricsCollector metricsCollector;
    private final UserController userController; // 원본 클래스

    public UserControllerProxy(final MetricsCollector metricsCollector, final UserController userController
    ) {
        this.metricsCollector = metricsCollector;
        this.userController = userController;
    }

    @Override
    public UserVo login(final String telephone, final String password) {
        long startTimestamp = System.currentTimeMillis();

        UserVo userVo = userController.login(telephone,password); // 원본 클래스에 위임

        long endTimeStamp = System.currentTimeMillis();
        long responseTime = endTimeStamp - startTimestamp;
        RequestInfo requestInfo = new RequestInfo("login", responseTime, startTimestamp);
        metricsCollector.recordRequest(requestInfo);

        return userVo;
    }

    @Override
    public UserVo register(final String telephone, final String password) {
        long startTimestamp = System.currentTimeMillis();

        UserVo userVo = userController.register(telephone,password); // 원본 클래스에 위임

        long endTimeStamp = System.currentTimeMillis();
        long responseTime = endTimeStamp - startTimestamp;
        RequestInfo requestInfo = new RequestInfo("login", responseTime, startTimestamp);
        metricsCollector.recordRequest(requestInfo);

        return userVo;
    }
}
