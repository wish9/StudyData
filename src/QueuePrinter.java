import java.util.LinkedList;
import java.util.Queue;

public class QueuePrinter {

    public int queuePrinter(int bufferSize, int capacities, int[] documents) {
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
        }
        return time;

    }
}
