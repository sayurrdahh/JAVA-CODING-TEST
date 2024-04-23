package CodingTest.test7;

/*
* 10진수 N이 입력되면 2진수로 변환하여 출력하는 프로그램을 작성하세요.
*
* */

public class test7_2 {

    public void DFS(int n){
        if(n == 0) return;
        else {

            DFS(n/2);
            System.out.print(n%2);
        }
    }

    public static void main(String[] args) {
        test7_2 T = new test7_2();
        T.DFS(11);

    }
}
