package Spring.DI;
import java.util.*;
public class MenuControl {
    private MenuServiceStub menuService; // 이렇게 사용한 곳을 다 찾아서 수정해야하니 상당히 번거롭다.

    public MenuControl(MenuServiceStub menuService) { // MenuService -> MenuServiceStub
        this.menuService = menuService;
    }

    public List<Menu> getMenus() {
        return menuService.getMenuList();
    }
}
