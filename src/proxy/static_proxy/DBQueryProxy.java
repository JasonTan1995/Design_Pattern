package proxy.static_proxy;

/**
 * 静态代理
 * 代理类
 * 用来代理和封装真实主题
 */
public class DBQueryProxy implements IDBQuery {

    private DBQuery real = null;

    @Override
    public String request() {
        if (real == null) {
            real = new DBQuery();
        }
        return real.request();
    }
}
