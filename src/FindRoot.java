import java.util.LinkedList;
import java.util.Queue;

public class FindRoot {
    public boolean getDirections(int[][] matrix, int from, int to) { // matrix의 from행 to열 요소가 1인지 검사하는 메서드
        Queue<Integer> que = new LinkedList<Integer>();
        que.add(from); // que에 from넣기
        // from에서 이어지는 곳 탐색, 왔던 곳 안가기
        boolean[] visited = new boolean[matrix.length];
        int a=0;
        visited[from] = true;

        while (que.size() != 0) {
            a = que.poll();
            if(a==to) return true; // 이어진 곳이 to면 return true
            //System.out.println("a = " + a);

            //for(int i = 0; i<matrix.length; i++) { -> 정사각형 matrix라는 보장이 없다.
            for(int i = 0; i<matrix[a].length; i++) {
                //System.out.println( a+"행"+ i+"열"+ (matrix[a][i]==1 && !visited[i]));
                if((matrix[a][i]==1) && (!visited[i])) {
                    visited[i] = true;
                    //if(i==to) return true; // 이렇게 쓰면  자기 자신으로 돌아오는 사이클이 있을 때 false가 나와 오류.
                    que.add(i);
                }
            }

        }return false; // to에 못가고 길이 없으면 return false
    }
}
