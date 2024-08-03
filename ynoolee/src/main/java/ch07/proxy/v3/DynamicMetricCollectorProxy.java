package ch07.proxy.v3;

import ch07.proxy.dto.RequestInfo;
import ch07.proxy.v1.MetricsCollector;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class DynamicMetricCollectorProxy {
    private MetricsCollector metricsCollector;

    public DynamicMetricCollectorProxy() {
        this.metricsCollector = new MetricsCollector();
    }

    public Object createProxy(Object proxiedObject) {
        final Class<?>[] interfaces = proxiedObject.getClass().getInterfaces();
        DynamicProxyHandler handler = new DynamicProxyHandler(proxiedObject);
        return Proxy.newProxyInstance(proxiedObject.getClass().getClassLoader(),
                interfaces, handler);
    }

    private class DynamicProxyHandler implements InvocationHandler {

        private final Object proxiedObject;

        public DynamicProxyHandler(Object proxiedObject) {
            this.proxiedObject = proxiedObject;
        }

        @Override
        public Object invoke(final Object proxy, final Method method, final Object[] args) throws Throwable {
            long startTimestamp = System.currentTimeMillis();

            Object result = method.invoke(proxiedObject, args);

            long endTimeStamp = System.currentTimeMillis();
            long responseTime = endTimeStamp - startTimestamp;

            String apiName = proxiedObject.getClass().getName() + ":" + method.getName();
            RequestInfo requestInfo = new RequestInfo("login", responseTime, startTimestamp);
            metricsCollector.recordRequest(requestInfo);

            return result;
        }
    }
}
