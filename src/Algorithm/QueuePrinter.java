package Algorithm;

import java.util.LinkedList;
import java.util.Queue;

public class QueuePrinter {

//    bufferSize = 동시에 처리할 수 있는 작업칸수
//    capacities = 동시에 처리 가능한 최대 용량
//    (작업칸이 남아 있어도 용량이 오버되면 작업칸에 못들어오는거)
//    documents = 작업해야 할 목록 배열

    public int queuePrinter(int bufferSize, int capacities, int[] documents) { // 프린터기 기능 구현
        int time = 0;
        int bufferTotal =0;
        Queue<Integer> doc = new LinkedList<>();
        Queue<Integer> buffer = new LinkedList<>();

        for(int o : documents){
            doc.add(o);
        }

        for(int i=0; i<bufferSize; i++) {
            buffer.add(0);
        }

        while(!(bufferTotal == 0 && doc.size()==0)){
            bufferTotal=0;
            for(int j : buffer){
                bufferTotal += j;
            }
            if(doc.size()!=0) {
                if (bufferTotal + doc.peek() - buffer.peek() <= capacities) {
                    buffer.add(doc.poll());
                    buffer.poll();
                } else {
                    buffer.poll();
                    buffer.add(0);
                }
            }else {
                buffer.add(0);
                buffer.poll();
            }
            time++;

            bufferTotal=0;          // << bufferTotal 다시 계산해줘야하는데 이걸 뺴서 오류 났었음
            for(int j : buffer){
                bufferTotal += j;
            }
        }
        return time;

    }
}
