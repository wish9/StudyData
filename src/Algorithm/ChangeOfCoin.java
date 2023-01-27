package Algorithm;

public class ChangeOfCoin {

    public int partTimeJob(int k) { // k원만큼 동전으로 거슬러주기
        int count =0;
        int sum =0;

        int[] coin = {500, 100, 50, 10, 5 ,1};

        for(int o : coin){
            if(k%o==0) {
                while(!(sum==k)){
                    sum += o;
                    count++;
                }
            }else{
                while(!(sum>k-o)){
                    sum += o;
                    count++;
                }
            }
        }
        return count;
    }
}
