import java.util.Arrays;

public class CarryingLuggage {
    int count =0;

    private static int[] remove(int[] arr, int index) { // 배열의 특정 인덱스 지우는 메서드
        if (arr == null || index < 0 || index >= arr.length) {
            return arr;
        }

        int[] result = new int[arr.length - 1];

        int copyIndex = 0;
        for (int i = 0; i < arr.length; i++) {
            if (i == index) {
                continue;
            }
            result[copyIndex++] = arr[i];
        }
        return result;
    }

    public int movingStuff(int[] stuff, int limit) {
        // Greedy 알고리즘으로 풀어보자.
        // stuff 배열 요소를 탐색해 limit에 가까운 조합 먼저 한박스 완성
        // 조합방법 = 특정 요소를 기준으로 합이 limit인게 있는지 검사, 있으면 조합하고 해당요소들 사용했다고 체크, 없으면 limit-1이 있는지 검사
        // 남은 애들끼리 또 조합해 박스 완성하기를 반복
        // stuff가 없으면 끝
        // boolean을 이용하지 않고 사용한 요소값을 삭제하면서 재귀 돌려도 될듯 (boolean 안쓰면 배열 길이가 계속 바껴서 더 복잡함..)
        // for문*재귀방법 , 이중for문 어차피 시간복잡도는 똑같을 듯? << 맞나?


        int[] arr = stuff.clone(); // 기존값 안바뀌게 깊은복사

        for (int l = 0; l < arr.length; l++) { // 짝이 생길 가능성이 없는애들 먼저 빼주기
            int aaa = limit-arr[l];
            boolean have = false;
            if(aaa>=40){
                for(int m=0; m<arr.length; m++){
                    if(m!=l && arr[m]<=aaa){ // 툭정요소가 limit와의 차이가 40이상이라도 그 차이 이하의 값을 갖는 요소가 없으면 함께 박스에 들어갈 수 있는 요소가 없음
                            have = true;  // 따라서 함께 박스에 들어갈 경우의 수가 존재하는지 체크하는 것
                    }
                }
            }
            //System.out.println(!have);
            if (arr[l] > limit - 40 || !have) { // stuff 요소는 40이상이니 특정 요소가 limit와의 차이가 40미만이면 무조건 혼자 박스에 들어갈 수 밖에 없음
                count++;
                arr = remove(arr, l);
                --l; // arr가 바뀌니까 넣어줘야 함
                if (arr.length == 0) break;
            }
        }

        int num = 0;
        for(int i = 0; i < arr.length-1; i++ ) {  // arr 요소들을 크기순으로 정렬
            for (int j = i+1; j < arr.length; j++ ) {
                if(arr[j] > arr[i]) {
                    num = arr[j];
                    arr[j] = arr[i];
                    arr[i] = num;
                }
            }
        }

        int rest = 0;
        boolean[] used = new boolean[arr.length];

        if (arr.length != 0) { // 혹시나 물건1개 당 1개의 물건만 들어가게 될 경우를 방지하기 위함
            for (int i = 0; i < arr.length - 1; i++) {
                if (used[i] == false) {
                    for (int j = i + 1; j < arr.length; j++) {
                        if(used[j]==false) {
                            int sum = arr[j] + arr[i];
                            rest = limit - sum;
                            if (rest >= 0) {
                                count++;
                                used[i] = true;
                                used[j] = true;
                                System.out.println(Arrays.toString(used));
                                System.out.println(Arrays.toString(arr));
                                System.out.println(count);
                                break;

                            }
                        }
                    }

                }

            }
        }

        for(boolean o:used){ // 짝짓고 남은애들 처리
            if(o==false) {
                count++;
            }
        }

//            System.out.println(Arrays.toString(arr));
            System.out.println(count);
            return count;
        }

}
