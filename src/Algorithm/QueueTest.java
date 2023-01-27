package Algorithm;

import java.util.ArrayList;

public class QueueTest {
    private ArrayList<Integer> listQueue = new ArrayList<Integer>();

    public void add(Integer data) { // 큐에 데이터 추가
        listQueue.add(data);
    }

    public Integer poll() { // 가장 먼저 추가된 데이터 삭제, 리턴
        if(listQueue.size()==0) {
            return null;
        }else {
            return listQueue.remove(0);
        }
    }

    public int size() { // 큐에 저장된 데이터 크기 리턴
        return listQueue.size();
    }

    public Integer peek() { // 가장 먼저 추가된 데이터 리턴
        if(listQueue.size()==0) {
            return null;
        }else {
            return listQueue.get(0);
        }
    }

    public String show() {
        return listQueue.toString();
    }

    public void clear() {
        listQueue.clear();
    }
}
