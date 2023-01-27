package Algorithm;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Stack;

public class BrowserMove {
    public ArrayList<Stack> browserStack(String[] actions, String start) { //Browser 앞뒤로가기 기능 구현
        Stack<String> prevStack = new Stack<>();
        Stack<String> nextStack = new Stack<>();
        Stack<String> current = new Stack<>();
        ArrayList<Stack> result = new ArrayList<>();

        current.push(start);

        for(String o : actions) {
            if(nextStack.size()==0&&o=="1"){ // String 비교할 때 습관적으로 equals 쓰도록 하자.
                continue;
            }else if(prevStack.size()==0&& o=="-1"){
                continue;
            } else if(o=="-1"){
                nextStack.push(current.pop());
                current.push(prevStack.pop());
            } else if(o=="1"){
                prevStack.push(current.pop());
                current.push(nextStack.pop());
            }else {
                prevStack.push(current.pop());
                current.push(o);
                nextStack.clear();
            }
        }

        result.add(prevStack);
        result.add(current);
        result.add(nextStack);

        return result;

    }
}
