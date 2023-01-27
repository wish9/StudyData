package Algorithm;

import java.util.ArrayList;
import java.util.Stack;

public class Stacktest {

    public void printStack() { //Stack형 자료구조 연습
        Stack<Integer> stack = new java.util.Stack<>(); //Integer형 스택 선언

        print(stack.push(1));
        print(stack.push(2));
        print(stack.push(3));
        print(stack.push(4));

        print(stack);

        print(stack.pop());
        print(stack.pop());
        print(stack.pop());
        print(stack.pop());
    }

    public void print(Object a) {
        System.out.println(a);
    }

    private ArrayList<Integer> listStack = new ArrayList<Integer>();

    public void push(Integer data) {
        listStack.add(data);
    }

    public Integer pop() {
        if(listStack.size()==0) {
            return null;
        }else {
            return listStack.remove(listStack.size()-1);
        }
    }

    public int size() {
        return listStack.size();
    }

    public Integer peek() {
        if(listStack.size()==0) {
            return null;
        }else {
            return listStack.get(listStack.size()-1);
        }
    }

    public String show() {
        return listStack.toString();
    }
    public void clear() { listStack.clear(); }
}
