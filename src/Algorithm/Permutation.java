package Algorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.IntStream;

public class Permutation {
    public ArrayList<Integer[]> newChickenRecipe(int[] stuffArr, int choiceNum) {
        String[] strStuff = new String[stuffArr.length];
        int[] stuffArr2 = new int[stuffArr.length];

        for(int i=0; i<stuffArr.length; i++) {
            strStuff[i] = String.valueOf(stuffArr[i]);
        }
        for(int i=0; i<stuffArr.length; i++){
            if(strStuff[i].contains("000")){ // 0이 연속3개 있으면 i번째 요소 삭제
                int[] arr1 = Arrays.copyOfRange(stuffArr, 0, i);
                int[] arr2 = Arrays.copyOfRange(stuffArr,i+1, stuffArr.length);
                stuffArr2 = new int[stuffArr.length-1];
                System.arraycopy(arr1,0,stuffArr2,0,arr1.length);
                System.arraycopy(arr2,0,stuffArr2,arr1.length,arr2.length);
            }
        }
        if(stuffArr2.length==stuffArr.length) stuffArr2 = stuffArr.clone();
        Arrays.sort(stuffArr2); // 오름차순 정렬

        if(stuffArr2.length==0||stuffArr2.length<choiceNum) return null;
        return makeList(stuffArr2, choiceNum, new ArrayList<Integer[]>(), 0, new int[0]);

    }

    public ArrayList<Integer[]> makeList(int[] stuffArr, int choiceNum, ArrayList<Integer[]> list, int count, int[] arr){
        if(count==choiceNum) {
            Integer[] arr3 = Arrays.stream(arr.clone()).boxed().toArray(Integer[]::new); // int형 배열 -> Integer형 배열
            list.add(arr3);
            return list;
        }

        for(int i=0; i<stuffArr.length; i++){
            boolean containValue = true;
            for(int o : arr){
                if(o==stuffArr[i]) containValue = false;
            }
            if(containValue) {
                int[] arr2 = Arrays.copyOf(arr, arr.length + 1);
                arr2[arr2.length - 1] = stuffArr[i];
                makeList(stuffArr, choiceNum, list, count + 1, arr2);
            }
        }
        return list;
    }
}
