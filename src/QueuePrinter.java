import java.util.LinkedList;
import java.util.Queue;

public class QueuePrinter {

    public int queuePrinter(int bufferSize, int capacities, int[] documents) {
        Queue<Integer> queue = new LinkedList<>();
        Queue<Integer> buffer = new LinkedList<>();
        for (int document : documents) queue.add(document);
        int memory = capacities;
        int res = 1;

        while(!queue.isEmpty() || !buffer.isEmpty()){
            res++;
            // 문서에서 버퍼로 넘기기
            if(!queue.isEmpty()){
                // 큐에서 버퍼로 넣을 수 있는 경우
                if(queue.peek() <= memory){
                    memory -= queue.peek();
                    for(int i=buffer.size(); i < bufferSize-1; i++) buffer.add(0);
                    buffer.add(queue.poll());
                }
            }
            System.out.println(buffer);
            // 버퍼 이동시키기
            if(!buffer.isEmpty()){
                if(buffer.peek() != 0){
                    memory += buffer.peek();
                }
                buffer.poll();
            }
            //System.out.println(buffer);

        }
        return res;

    }
}
