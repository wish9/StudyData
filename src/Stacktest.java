import java.util.Stack;

public class Stacktest {

    public void printStack() {
        Stack<Integer> stack = new java.util.Stack<>(); //Integer형 스택 선언

        print(stack.push(1));
        print(stack.push(2));
        print(stack.push(3));
        print(stack.push(4));

        print(stack.pop());
        print(stack.pop());
        print(stack.pop());
        print(stack.pop());
    }

    public void print(Object a) {
        System.out.println(a);
    }
}
