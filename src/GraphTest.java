import java.util.ArrayList;

public class GraphTest {
    private int[][] graph;
    private ArrayList<ArrayList<Integer>> arr = new ArrayList<>();

    public void setGraph(int size) { //  size만큼의 버텍스를 추가
        graph = new int[size][size];

        for(int i = 0; i < size; i++) {
            for(int j = 0; j < size; j++) {
                graph[i][j] = 0;
            }
        }
    }
    public int[][] getGraph() { // 인접 행렬 정보가 담긴 배열을 반환
        return graph;
    }
    public void addEdge(int from, int to) { // fromVertex와 toVertex 사이의 간선 추가
        if(from >= graph.length || to >= graph.length) return;
        graph[from][to] = 1;
    }

    public boolean hasEdge(int from, int to) { // fromVertex와 toVertex 사이의 간선 존재여부 리턴
        if(from >= graph.length || to >= graph.length) return false;
        else if(graph[from][to] == 1) return true;
        else return false;
    }

    public void removeEdge(int from, int to) { //  fromVertex와 toVertex 사이의 간선 삭제
        if (from >= graph.length || to >= graph.length) return;
        graph[from][to] = 0;
    }
    public void addVertex(int size){

        for(int i = 0; i < size; i++) {
            arr.add(new ArrayList<>());
        }
    }
}
