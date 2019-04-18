package flyweight.factory;

import flyweight.bean.web.ConcreteWebsite;
import flyweight.bean.web.WebSite;

import java.util.concurrent.ConcurrentHashMap;

/**
 * 享元工厂
 * key 是内部状态
 * user 即外部状态
 */
public class WebSiteFactory {

    private ConcurrentHashMap<String, ConcreteWebsite> pool = new ConcurrentHashMap<>();

    public WebSite getWebSiteCategory(String key) {
        if (!pool.containsKey(key)) {
            pool.put(key, new ConcreteWebsite(key));
        }
        return pool.get(key);
    }

    public int getWebSiteSize() {
        return pool.size();
    }
}
