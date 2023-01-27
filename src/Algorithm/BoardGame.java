package Algorithm;

import java.util.Arrays;

public class BoardGame {
    private int index1 = 0;
    private int index2 = 0;
    private int findTrue = 0;
    public Integer boardGame(int[][] board, String operation) {
        // 움직이는 말의 위치를 boolean을 통해 확인
        // 문자열 각 인덱스에 따라 말 이동
        // 정해진 범위 밖(배열밖)으로 이동하려 할 시 오류 나올거임. 그때 try catch로 예외처리해서 바로 null리턴하게 만들면 됨

        boolean[][] location = new boolean[board.length][board[0].length]; // board가 정사각형이라는 보장이 없으면 for문 돌리면 됨.
        int score = 0;
        location[0][0] = true;
        index1=0; // 클래스변수 초기화
        index2=0; // 이거 안해주면 여러 case실행 시 전에 값에 영향받는다.

        for(int i=0; i<operation.length(); i++){
            try { // 인덱스값에 음수가 할당될 때 중간에 오류가 나서 멈춰버리는데 상관없이 진행하게 한다.
                location = move(location, operation.charAt(i));
                print(location);
            }finally{

                for (int j = 0; j < location.length; j++) {
                    findTrue = Arrays.asList(location[j]).indexOf(true); // 말의 위치 index 찾기
                    if (findTrue != -1) {
                        index2 = findTrue;
                        index1 = j;
                        break;
                    }
                }
                if (index1>=0 && index2>=0 && board[index1][index2] != 0) {
                    score += board[index1][index2];
                }else if (index1<0 || index2<0) return null; // index에 음수 들어가 있으면 null출력하고 끝

            }
        }
        return score;
    }

    private boolean[][] move(boolean[][] moved,char mo){
        System.out.println(mo);
        if(mo=='U'){
            for(int j=0; j<moved.length; j++) { // 현재 위치 탐색
                findTrue = Arrays.asList(moved[j]).indexOf(true); // 말의 위치 index 찾기
                if(findTrue!=-1) {
                    index2 = findTrue;
                    index1 = j;
                    break;
                }
            }
            moved[index1][index2] = false;
            index1=index1-1;
            moved[index1][index2] = true;
        }else if(mo=='D') {
            for (int j = 0; j < moved.length; j++) { // 현재 위치 탐색
                findTrue = Arrays.asList(moved[j]).indexOf(true); // 말의 위치 index 찾기
                if (findTrue != -1) {
                    index1 = j;
                    index2 = findTrue;
                    break;
                }
            }
            moved[index1][index2] = false;
            index1=index1+1;
            moved[index1][index2] = true;
        }else if(mo=='L') {
            for (int j = 0; j < moved.length; j++) { // 현재 위치 탐색
                findTrue = Arrays.asList(moved[j]).indexOf(true); // 말의 위치 index 찾기
                if (findTrue != -1) {
                    index1 = j;
                    index2 = findTrue;
                    break;
                }
            }
            moved[index1][index2] = false;
            index2=index2-1;
            moved[index1][index2] = true;
        }else if(mo=='R') {
            for (int j = 0; j < moved.length; j++) { // 현재 위치 탐색
                findTrue = Arrays.asList(moved[j]).indexOf(true); // 말의 위치 index 찾기
                if (findTrue != -1) {
                    index1 = j;
                    index2 = findTrue;
                    break;
                }
            }

            moved[index1][index2] = false;
            index2=index2+1;
            moved[index1][index2] = true;
        }
        System.out.println(index2);
        return moved;
    }

    private void print(boolean[][] arr){
        for(int i=0;i<arr.length;i++) {
            System.out.println(Arrays.toString(arr[i]));
        }
    }
}
