package Algorithm;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.*;

public class AdjacentList {

    public int connectedVertices(int[][] edges) {// 연결된 정점들의 컴포넌트(그룹들) 갯수 출력하는 메서드

        int max = edges[0][0];
        for(int i = 0; i< edges.length; i++){ // 몇번노드까지 있는지 계산
            if(max < edges[i][0]) max = edges[i][0];
            if(max < edges[i][1]) max = edges[i][1];
        }

        max++; // 0번 노드도 있으니 +1

        LinkedList<LinkedList<Integer>> listGraph = new LinkedList<>();  // BSF할 때 보통 Linked 말고 ArrayList 많이 쓴다고 함.

        for(int i=0; i<max; i++) { // 비어있는 리스트 먼저 생성
            listGraph.add(new LinkedList<>());
        }

        for(int j=0; j<edges.length; j++){ // input받은 데이터 정리해서 인접배열 리스트로 만들기
            listGraph.get(edges[j][0]).add(edges[j][1]);
            listGraph.get(edges[j][1]).add(edges[j][0]);
        }

        System.out.println(listGraph);

        int count = 0;
        boolean visited[] = new boolean[max];

        for(int k=0; k<max; k++){ // k번 노드 드리블
            Queue<Integer> queue = new LinkedList<>();
            if(visited[k]==false) { // k번째 노드 방문 안했으면 아래식을 수행해라
                visited[k] = true;
                queue.add(k);
                int a = 0;

                while (queue.size() != 0) {
                    a = queue.poll();

                    for (int l = 0; l < listGraph.get(a).size(); l++) { // a노드와 연결된 지점들 체크하기
                        int num = listGraph.get(a).get(l);
                        if (!visited[num]) { // 이미 방문한 노드를 제외시키기
                            visited[num] = true;
                            queue.add(num);
                        }// 방문 안한 노드가 더 이상 없으면 while문 종료
                    }

                }

                count++; // 순회해서 연결지점 더 이상 없으면 while문 끝내고 counting
            }
        }
        return count;

        // 수도코드
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
