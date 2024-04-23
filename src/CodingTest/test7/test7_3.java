package CodingTest.test7;

/*
* 자연수 N이 입력되면 N! 을 구하는 프로그램을 작성하세요.
* */

public class test7_3 {

    public int DFS(int n){
        if(n == 1) return 1;
        else return n*DFS(n-1);

    }

    public static void main(String[] args) {
        test7_3 T = new test7_3();
        System.out.println(T.DFS(5));
    }
}
