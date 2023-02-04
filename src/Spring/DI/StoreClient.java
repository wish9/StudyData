package Spring.DI;
import java.util.*;
public class StoreClient {
    public static void main(String[] args) {
//        interface를 이용해 여러곳을 수정해야하는 상황은 방지하는데 성공했다.
//        하지만 여진히 new를 많이 쓴다.
//        애플리케이션 코드 내부에서 직접적으로 new 키워드를 사용할 경우 객체지향 설계의 관점에서 문제가 발생할 수 있기 때문에
//        new 키워드 사용하지 않으며 의존성 주입을 하도록 지양해야 한다.
        MenuService menuService = new MenuServiceStub();
        MenuControl menuControl = new MenuControl(menuService);
        List<Menu> menuList = menuControl.getMenus();
        System.out.println(menuList);
    }

}
