package Algorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class AmountDivided {
    public long ocean(int target, int[] type) { // target만큼의 금액을 화폐의 종류(type)에 따라 몇가지 방법으로 가져갈 수 있는지 구하는 메서드
        // CoinChange에서 했던 것과 비슷해보인다.
        // 가장 큰 화폐단위부터 목표금액을 나눠서 최소한의 갯수로 거스름돈을 계산했었지만 이번에는 모든 경우의 수를 구해야 한다.
        // type을 크기순으로 정렬시키자
        // 가장 큰 단위의 화폐종류를 기준으로 목표금액을 나눠 거스름돈 걸러주는 알고리즘과 같이 진행한다.
        // 가장 큰 단위의 화폐 사용횟수를 1씩 줄여가며 더 작은 화폐단위를 사용하는 경우의 수를 구해 counting해준다.
        // 가장 작은 단위의 화폐를 최대한 많이 사용해 target을 나눈 case가 나올 시 종료한다.

        // 사용횟수를 1씩 줄여 나가는 방법이 생각안나서 포기

        // 경우의 수를 이용해 목표 금액을 인덱스라 할 때 경우의 수를 구해나가자.

        long[] answer = new long[target + 1];
        answer[0] = 1;
        for(int i : type) {
            for(int j = i; j <= target; j++) {
                answer[j] += answer[j-i];
            }
            System.out.println("-".repeat(10)+i+"원 화폐 추가"+"-".repeat(10));
            for(int k=0; k<=target + 1; k+=10) {
                System.out.println(k+"원을 만드는 경우의 수 = "+answer[k]);
            }
        }

//        for(int k=0; k<=target + 1; k+=10) {
//            System.out.println(k+"원을 만드는 경우의 수 = "+answer[k]);
//        }
        return answer[target];



    }
}