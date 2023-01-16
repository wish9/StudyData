import java.util.Stack;

public class Main {
    public static void main(String[] args) {

        //Stack형 자료구조 연습
//        Stacktest stack = new Stacktest();
        //stack.printStack();

        //Stack형 자료구조 직접만들기
//        stack.size();
//        for(int i = 1; i < 15; i++) {
//            stack.push(i);
//        }
//        stack.pop(); // 14지우기
//        stack.pop(); // 13지우기
//        stack.size(); // 길이 = 12
//        stack.push(77); // 77추가하기
//        stack.size(); // 길이 = 13
//
//        System.out.println(stack.show());

        //Queue형 자료구조 직접만들기
//        QueueTest queue = new QueueTest();
//
//        queue.size(); // 0
//        for(int i = 1; i <= 10; i++) {
//            queue.add(i);
//        }
//        queue.poll(); // 1
//        queue.poll(); // 2
//        queue.size(); // 8
//        queue.add(77);
//        queue.size(); // 9
//        queue.poll(); // 3
//        queue.poll(); // 4
//        queue.size(); // 7
//
//        System.out.println(queue.show());

        //Browser 앞뒤로가기 기능 구현
//        BrowserMove browserMove = new BrowserMove();
//
//        System.out.println(browserMove.browserStack(new String[]{"B", "C", "-1", "D", "E", "-1", "1", "-1", "-1"}, "A"));
//        System.out.println(browserMove.browserStack(new String[]{"C", "-1", "B", "A", "C", "-1", "-1", "1", "-1", "1", "E", "-1", "-1", "1"},"B"));

        // PaveBox 박스 포장
//        PaveBox pave = new PaveBox();
//
//        System.out.println(pave.paveBox(new int[]{5, 2, 3, 7,1,2,3,4,5,6}));
//        System.out.println(pave.paveBox(new int[]{8, 1, 2, 3,4,5,6,7,10,11}));

        QueuePrinter queueP = new QueuePrinter();

        System.out.println(queueP.queuePrinter( 2, 10, new int[]{7, 4, 5, 6,1,1,9,8,4,6,5,2,7,6,5,4,1,5,2,6,4,3,1,5}));

    }
}