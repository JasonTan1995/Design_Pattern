package proxy.static_proxy;

/**
 * 静态代理
 * 真实主题
 * 真正实现业务逻辑的类
 */
public class DBQuery implements IDBQuery{

    /**
     * 查询数据库会需要加载一些配置
     * 连接到数据库也需要时间
     */
    public DBQuery() {
        try {
            Thread.sleep(1000);
        } catch(Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public String request() {
        return "Query DB";
    }
}
