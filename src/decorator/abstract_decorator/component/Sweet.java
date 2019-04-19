package decorator.abstract_decorator.component;

/**
 * 组件接口
 * 组件接口是装饰者和被装饰者的超类或接口.
 */
public abstract class Sweet {

    String descirption = "Sweet";

    public String getDescirption() {
        return descirption;
    }

    public abstract Double coast();
}
