package proxy.static_proxy;

public class ProxyMain {

    public static void main(String[] args) {
        IDBQuery q = new DBQueryProxy();
        System.out.println(q.request());
    }
}
