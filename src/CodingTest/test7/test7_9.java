package CodingTest.test7;

/*
* 아래 그림과 같은 이진트리에서 루트 노드 1에서 말단노드까지의 길이 중 가장 짧은 길이를 구하는 프로그램을 작성하세요.
* DFS
* 사실은 BFS가 더 적절
* */

public class test7_9 {

    Node root;

    public int DFS(int L, Node root){
        if(root.lt == null && root.rt == null) return L;
        else return Math.min(DFS(L+1,root.lt), DFS(L+1, root.rt));

    }

    public static void main(String[] args) {
        test7_9 tree = new test7_9();
        tree.root = new Node(1);
        tree.root.lt = new Node(2);
        tree.root.rt = new Node(3);
        tree.root.lt.lt = new Node(4);
        tree.root.lt.rt = new Node(5);
        System.out.println(tree.DFS(0,tree.root));
    }
}
