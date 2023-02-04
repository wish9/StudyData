package Spring.DI;

import java.util.List;

public class MenuServiceStub {
    public List<Menu> getMenuList() {
        return List.of(
                new Menu(1, "아아", 3000),
                new Menu(2, "카라멜 마끼아또", 4500),
                new Menu(3, "라떼", 4000)
        );
    }
}
