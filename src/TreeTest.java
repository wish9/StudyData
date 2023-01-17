import java.util.ArrayList;

public class TreeTest {
    private String value;
    private ArrayList<TreeTest> children;

    public TreeTest() {	//전달인자가 없을 경우의 생성자
        this.value = null;
        this.children = null;
    }
    public TreeTest(String data) {	//전달인자가 존재할 경우의 생성자
        this.value = data;
        this.children = null;
    }

    public void setValue(String data) {
        this.value = data;
    }

    public String getValue() {      //현재 노드의 데이터를 반환
        return value;
    }
    public void addChildNode(TreeTest node) {
        if(children == null) children = new ArrayList<>();
        children.add(node);
    }
    public void removeChildNode(TreeTest node) {
        String data = node.getValue();

        if(children != null) {
            for(int i = 0; i < children.size(); i++) {
                if(children.get(i).getValue().equals(data)) {
                    children.remove(i);
                    return;
                }
                if(children.get(i).children != null) children.get(i).removeChildNode(node); // 이게 뭐지?? i번째 요소가 안지워 졌으면 다시 지우려고 재귀하는건 알겠는데..children.get(i).children??
            }
        }
    }

    public ArrayList<TreeTest> getChildrenNode() {
        return children;
    }

    public boolean contains(String data) {      //재귀를 사용하여 값을 검색
        if(value.equals(data)) return true;

        boolean check;

        if(children != null) {
            for(int i = 0; i < children.size(); i++) {
                check = children.get(i).contains(data, false);
                if(check) return true;
            }
        }
        return false;
    }

    public boolean contains(String data, boolean check) {      //재귀를 사용하여 값을 검색합니다.
        if(value.equals(data)) return true;

        if(children != null) {
            for(int i = 0; i < children.size(); i++) {
                check = children.get(i).contains(data, check);
            }
        }
        return check;
    }
}
