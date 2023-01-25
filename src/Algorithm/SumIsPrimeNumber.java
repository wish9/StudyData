package Algorithm;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class SumIsPrimeNumber { // 입력받는 카드 중 3개 뽑아서 합이 소수인 경우의 수 구하기
    public int boringBlackjack(int[] cards) {
        ArrayList<Integer> result = new ArrayList<>();
        for(int i = 0; i < cards.length; i++) { // 3개 뽑은 합 나열하기
            for(int j = i + 1; j < cards.length; j++) {
                for(int k = j + 1; k < cards.length; k++) {
                    int sum = cards[i]+cards[j]+cards[k];
                    //if(!result.contains(sum)) result.add(sum); // sum값 중복 방지하고 싶으면 이거 사용
                    result.add(sum);
                }
            }
        }

        System.out.println(result.toString());

        int count=0;
        for(int o:result){ // 소수판별
            boolean bo = true;

            if(o%2==0) bo = false;
            for (int i = 3; i <=(int) Math.sqrt(o); i+=2) {
                if(o%i==0){
                    bo = false;
                    break;
                }
            }
            if(bo) {
                count++;
                System.out.println(o);
            }
        }
        return count;

    }
}
