package proxy.dynamic_proxy;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;
import proxy.static_proxy.DBQuery;
import proxy.static_proxy.IDBQuery;

import java.lang.reflect.Method;

/**
 * 动态代理
 * Cglib - Proxy
 * 代理类
 */
public class CglibDbQueryInterceptor implements MethodInterceptor {

    private IDBQuery real = null;

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        if (real == null)
            real = new DBQuery();
        return real.request();
    }

    public static IDBQuery createCglibProxy () {
        Enhancer enhancer = new Enhancer();

        enhancer.setCallback(new CglibDbQueryInterceptor());

        enhancer.setInterfaces(new Class[]{IDBQuery.class});

        IDBQuery cglibProxy = (IDBQuery) enhancer.create();

        return cglibProxy;
    }
}
