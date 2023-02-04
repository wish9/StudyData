package Spring.DI;

import java.awt.*;

public class StoreClient {
    public static void main(String[] args) {
        MenuService menuService = new MenuService();
        MenuControl menuControl = new MenuControl(menuService);
//        List<Menu> menuList = menuControl.getMenus();
    }

}
