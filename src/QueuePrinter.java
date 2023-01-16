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
        //System.out.println(doc);

        for(int i=0; i<bufferSize; i++) {
            buffer.add(0);
        }
        //System.out.println(buffer);

        while(true==true){
            bufferTotal=0;

            for(int j : buffer){
                bufferTotal += j;
            }
            //System.out.println(bufferTotal);
            if(doc.size()!=0) {
                if (bufferTotal + doc.peek() <= capacities) {
                    buffer.add(doc.poll());
                    buffer.poll();
                    //System.out.println(buffer);
                } else {
                    buffer.poll();
                    buffer.add(0);
                }
            }else {
                buffer.add(0);
                buffer.poll();
            }

            System.out.println(buffer);

            bufferTotal = 0;

            for(int k : buffer){
                bufferTotal += k;
            }

            //System.out.println(bufferTotal);

            if(bufferTotal == 0 && doc.size()==0) {
                break;
            }

            time++;

            if(bufferTotal==0) time -= 1;
            System.out.println(time);
        }
        time++;
        return time;

    }
}
