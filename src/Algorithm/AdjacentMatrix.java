package Algorithm;

public class AdjacentMatrix {

    public int[][] createMatrix(int[][] edges) {

        int max = edges[0][0];
        for(int i = 0; i< edges.length; i++){        // result 크기를 구하기 위한 max 찾기
            if(max < edges[i][0]) max = edges[i][0];
            if(max < edges[i][1]) max = edges[i][1];
        }

        max++;

        int[][] result = new int[max][max];

        for(int j=0; j< edges.length; j++) { // edges.length = 행의 길이
            result[edges[j][0]][edges[j][1]] = 1;
            if(edges[j][2]==1){
                result[edges[j][1]][edges[j][0]] = 1;
            }
        }

        return result;

    }

}
