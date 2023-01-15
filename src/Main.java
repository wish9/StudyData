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

        QueueTest queue = new QueueTest();

        queue.size(); // 0
        for(int i = 1; i <= 10; i++) {
            queue.add(i);
        }
        queue.poll(); // 1
        queue.poll(); // 2
        queue.size(); // 8
        queue.add(77);
        queue.size(); // 9
        queue.poll(); // 3
        queue.poll(); // 4
        queue.size(); // 7

        System.out.println(queue.show());

    }
}