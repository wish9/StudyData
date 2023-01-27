package Algorithm;

import java.util.*;

public class PaveBox {
    public int paveBox(int[] boxes) {

        Queue<Integer> queue = new LinkedList<>();
        int count = 1;

         for(int i = 0; i<boxes.length; i++){ // 큐 자료구조에 박스 데이터 전부 넣기
             queue.add(boxes[i]);
         }

        int compare = queue.poll();
        List<Integer> list = new ArrayList<Integer>();

        while(queue.size()!=0){

            if(compare >= queue.peek()){
                count++;
                queue.remove();
            }else {
                compare = queue.poll();
                list.add(count);
                count=1;

            }
        }
        list.add(count);
        return Collections.max(list);




        //1차시도
//        int count =0;
//        int result =1;
//        int compare = 0;
//        List<Integer> list = new ArrayList<Integer>();
//
//
//        for(int o : boxes){
//            if(o>compare){
//                compare = o;
//                count=1;
//            } else if (o<=compare) {
//                count++;
//                result = count;
//            }
//            if(count==1){
//                list.add(result);
//                compare =0;
//            }
//        }
//
//        return Collections.max(list);
    }
}
