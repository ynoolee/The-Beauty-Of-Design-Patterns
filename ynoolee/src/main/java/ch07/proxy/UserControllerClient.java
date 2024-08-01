package ch07.proxy;

import ch07.proxy.v1.MetricsCollector;
import ch07.proxy.v2.IUserController;
import ch07.proxy.v2.UserController;
import ch07.proxy.v2.UserControllerProxy;
import ch07.proxy.v3.DynamicMetricCollectorProxy;

public class UserControllerClient {

    public static void case1() {
        IUserController userController = new UserControllerProxy(new MetricsCollector(), new UserController());
    }

    public static void case2() {
        final DynamicMetricCollectorProxy proxy = new DynamicMetricCollectorProxy();
        final IUserController userController = (IUserController) proxy.createProxy(new UserController());
    }
}
