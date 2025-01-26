package JavaBasic.ch06.ex;

public class ShopService {
    private static ShopService singleton = new ShopService();

    private ShopService() {}

    static ShopService getInstance() {
        return singleton;
    }
}
