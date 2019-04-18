package flyweight.bean.web;

/**
 * 具体享元类
 */
public class ConcreteWebsite extends WebSite{

    private String name;

    public ConcreteWebsite(String key) {
        this.name = key;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void use(User user) {
        System.out.println("网站分类" + name +",用户为" +user.getName());
    }
}
