package proxy.dynamic_proxy;

import proxy.static_proxy.DBQuery;
import proxy.static_proxy.IDBQuery;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * 动态代理
 * JDK Dynamic Proxy
 * 代理类
 */
public class JdkDbQueryHandler implements InvocationHandler {

    IDBQuery real = null;

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        if (real == null)
            real = new DBQuery();
        return real.request();
    }

    public static IDBQuery createJdkProxy() {
        IDBQuery jdkQuery = (IDBQuery) Proxy.newProxyInstance(ClassLoader.getSystemClassLoader(),
                new Class[]{IDBQuery.class}, new JdkDbQueryHandler());
        return jdkQuery;
    }
}
