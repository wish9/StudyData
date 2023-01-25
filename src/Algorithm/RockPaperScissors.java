package Algorithm;

import java.util.ArrayList;
import java.util.Arrays;

public class RockPaperScissors {
    String[] rps = {"rock","paper","scissors"};

    public ArrayList<String[]> rockPaperScissors(int rounds) {

        return ref(0,rounds,new String[0],new ArrayList<String[]>());
    }

    public ArrayList<String[]> ref(int count, int rounds, String[] strarr, ArrayList<String[]> list){

        if(rounds == count){
            list.add(strarr); //.clone 사용하자.. 깊은복사
            return list;
        }

        //strarr = Arrays.copyOf(strarr, strarr.length+1); // 배열 자리 늘리기, 최대한 add하는 부분에 추가하는게 좋음

        for(int i=0; i < rps.length; i++){
            String[] strarr2 = Arrays.copyOf(strarr, strarr.length+1); // 배열 자리 늘리기, 최대한 add하는 부분에 추가하는게 좋음
            strarr2[strarr2.length-1] = rps[i];   // 마지막 인덱스에 값 추가
            list = ref(count+1,rounds,strarr2,list);
            //System.out.println(Arrays.deepToString(list.get(0)));
        }
        return list;
    }

}
