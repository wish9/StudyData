package Algorithm;

import java.util.ArrayList;

public class EuclideanAlgorithm {
    public ArrayList<Integer[]> divideChocolateStick(int M, int N) { // 인원수에 따라 M,N을 골고루 나눠줄 수 있는 경우의 수 구하기
        ArrayList<Integer[]> result = new ArrayList<>();
        int GCD = euc(M,N); // 최대공약수
        for(int i=1; i<=GCD; i++) { // i = 인원수
            if(M%i==0&&N%i==0){
                Integer[] ad = {i,M/i,N/i};
                result.add(ad);
            }
        }
        return result;
    }

    public int euc(int M, int N) {
        // 큰숫자를 작은숫자로 나눈 나머지를 계산
        int rest = M % N;
        // 나머지가 0이면 작은숫자가 최대공약수이므로 작은숫자 리턴
        if (rest == 0) {
            return N;
        } else if(M>N){
            return euc(N, rest);
        } else if(M<=N){
            return euc(M,rest);
        }
        return 1;
    }
}
