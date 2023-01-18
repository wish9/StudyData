import java.util.ArrayList;
import java.util.Arrays;
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

        //프린터 기능구현
//        QueuePrinter queueP = new QueuePrinter();
//
//        System.out.println(queueP.queuePrinter( 2, 10, new int[]{1,9,1,9,1,9}));

        //TreeTest
//        TreeTest rootNode = new TreeTest("0");
//
//        for(int i = 1; i <= 5; i++) { // tree에 1~5까지 요소 추가
//            rootNode.addChildNode(new TreeTest(Integer.toString(i)));
//        }
//        System.out.println(rootNode.getValue());
//        System.out.println(rootNode.contains("7"));
//        System.out.println(rootNode.contains("3"));

        //GraphTest
//        GraphTest graphTest = new GraphTest();
//
//        graphTest.addVertex(3);
//        graphTest.setGraph(3);
//        System.out.println(Arrays.deepToString(graphTest.getGraph()));

        //BST
//        BST.binarySearchTree tree = new BST.binarySearchTree();
//        tree.root = new BST.Node(10);
//        tree.insert(7);
//        tree.insert(8);
//        tree.insert(12);
//        tree.insert(11);
//        tree.insert(-1);
//        tree.insert(-10);
//        tree.insert(-10);
//        tree.insert(-10);
//        tree.insert(7);
//        tree.root.getLeft().getRight().getData(); // 8
//        tree.root.getRight().getLeft().getData(); // 11
//
//        ArrayList<Integer> tree2 = tree.preorderTree(tree.root, 0, new ArrayList<Integer>());
//        System.out.println(tree2.toString()); // [10, 7, -1, -10, 8, 12, 11]
//
//        ArrayList<Integer> tree3 = tree.inorderTree(tree.root, 0, new ArrayList<Integer>());
//        System.out.println(tree3.toString()); // [-10, -1, 7, 8, 10, 11, 12]
//
//        ArrayList<Integer> tree4 = tree.postorderTree(tree.root, 0, new ArrayList<Integer>());
//        System.out.println(tree4.toString()); // [-10, -1, 8, 7, 11, 12, 10]


        //AdjacentMatrix 인접 행렬 생성하기
//        AdjacentMatrix adjacentMatrix = new AdjacentMatrix();
//
//       int[][] array1 = adjacentMatrix.createMatrix(new int[][]{
//                {0, 3, 0},
//                {0, 2, 0},
//                {1, 3, 0},
//                {2, 1, 0},
//        });
//
//       for ( int i = 0; i < array1.length; i++) {
//           System.out.println(Arrays.toString(array1[i]));
//       }
//
//        System.out.println();
//
//        int[][] array2 = adjacentMatrix.createMatrix(new int[][]{
//                {0, 2, 0},
//                {2, 4, 1},
//                {1, 3, 1},
//                {2, 1, 0},
//        });
//
//        for ( int i = 0; i < array1.length; i++) {
//            System.out.println(Arrays.toString(array2[i]));
//        }


        //FindRoot
        FindRoot findRoot = new FindRoot();

        System.out.println(findRoot.getDirections(new int[][]
                        {
                                {0, 1, 0, 0},
                                {0, 1, 1, 1},
                                {0, 0, 0, 0},
                                {0, 0, 0, 1}
                        },
                3,
                3
        ));


        //AdjacentList
//        AdjacentList adjacentList = new AdjacentList();
//        System.out.println(adjacentList.connectedVertices(new int[][]{
//                {0, 1},
//                {2, 3},
//                {3, 4},
//                {3, 5},
//        }));


    }
}