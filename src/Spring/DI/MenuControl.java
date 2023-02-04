package Spring.DI;
import java.util.*;
public class MenuControl {
    private MenuService menuService;

    public MenuControl(MenuService menuService) {
        this.menuService = menuService;
    }

    public List<Menu> getMenus() {
        return menuService.getMenuList();
    }
}
