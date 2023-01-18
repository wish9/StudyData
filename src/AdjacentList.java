import java.util.ArrayList;
import java.util.LinkedList;
import java.util.*;

public class AdjacentList {

    public int connectedVertices(int[][] edges) {
        // 인접 리스트 갯수 counting

        int max = edges[0][0];
        for(int i = 0; i< edges.length; i++){
            if(max < edges[i][0]) max = edges[i][0];
            if(max < edges[i][1]) max = edges[i][1];
        }

        max++;

        LinkedList<LinkedList<Integer>> listGraph = new LinkedList<LinkedList<Integer>>();

        for(int i=0; i<max; i++) {
            listGraph.add(new LinkedList<Integer>());
        }

        for(int j=0; j<edges.length; j++){
            listGraph.get(edges[j][0]).add(edges[j][1]);
            listGraph.get(edges[j][1]).add(edges[j][0]);
        }

        //System.out.println(listGraph);

        int count = 0;
        boolean visited[] = new boolean[max];

        for(int k=0; k<max; k++){
            Queue<Integer> queue = new LinkedList<Integer>();
            if(visited[k]==false) {
                visited[k] = true;
                queue.add(k);
                int a = 0;

                boolean test[] = visited;

                //System.out.println(listGraph);
                while (queue.size() != 0) {
                    a = queue.poll();

                    for (int l = 0; l < listGraph.get(a).size(); l++) {
                        int num = listGraph.get(a).get(l);
                        if (!visited[num]) {
                            visited[num] = true;
                            queue.add(num);
                        }
                    }

                }

                if(Arrays.toString(visited)!=Arrays.toString(test))count++;
            }
        }
        return count;

        // 순회해서 연결지점 없으면 끝내고 counting, 그때의 ture값을 갖는 노드를 제외시키고
        // 다시 나머지 노드끼리 순회, 위 과정 반복
        // 남은 노드가 없으면 return count


















//        Queue<Integer> queue = new LinkedList<Integer>();
//
//        for(int k=0; k<max; k++){
//            queue.add(k);
//        }
//
//        while (queue.size() != 0) {
//            // 방문한 노드를 큐에서 추출
//            s = queue.poll();
//            System.out.println(s + " ");
//
//            // 방문한 노드와 인접한 모든 노드를 가져오기
//            for(LinkedList o : listGraph){
//                int n = o.get();
//            }
//        }


    }
}
