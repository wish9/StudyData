package Spring.DI;
import java.util.*;
public class StoreClient {
    public static void main(String[] args) {
        MenuServiceStub menuService = new MenuServiceStub(); // MenuService -> MenuServiceStub
        MenuControl menuControl = new MenuControl(menuService);
        List<Menu> menuList = menuControl.getMenus();
        System.out.println(menuList);
    }

}
