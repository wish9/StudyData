package Algorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

public class PowerSet {
    public ArrayList<String[]> missHouseMeal(String[] sideDishes) { // 멱집합
        ArrayList<String[]> result = new ArrayList<>();

        Arrays.sort(sideDishes); // 오름차순 정렬 (문제 조건)
        Stack<String> stack = new Stack<>();
        makeList(result, stack, sideDishes.clone(), 0);

        result.sort((x,y) -> Arrays.toString(x).compareTo(Arrays.toString(y))); // 결과 오름차순 정렬
        return result;
    }

    public ArrayList<String[]> makeList(ArrayList<String[]> result, Stack<String> stack, String[] side, int index){
        if(index >= side.length){ // index>=side.length일 때. 즉, 마지막까지 검토를 했을 때
            String[] arr = stack.toArray(new String[0]); // 추가해온 stack을 배열로 바꾸기
            result.add(arr);
            return result;
        } else{
            stack.push(side[index]);
            makeList(result, stack,side, index+1);
            stack.pop();
            makeList(result, stack,side, index+1);
        }
        return result;
    }
}
