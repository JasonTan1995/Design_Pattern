package proxy.dynamic_proxy;

import org.junit.Test;
import proxy.static_proxy.IDBQuery;

public class DynamicProxyMain {

    public static void main(String[] args) {
        JdkDbQueryHandler handler = new JdkDbQueryHandler();
        IDBQuery jdkProxy = handler.createJdkProxy();
        System.out.println(jdkProxy.request());
    }

    @Test
    public void cglibProxy() {
        CglibDbQueryInterceptor interceptor = new CglibDbQueryInterceptor();
        IDBQuery cglibProxy = interceptor.createCglibProxy();
        System.out.println(cglibProxy.request());
    }


}
