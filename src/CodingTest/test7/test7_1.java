package CodingTest.test7;/*
* 자연수 N이 입력되면 재귀함수를 이용하여 1부터 N까지 출력하는 프로그램
* */

public class test7_1 {

    public void DFS(int n){
        if(n == 0) return;
        else {
            DFS(n-1);
            System.out.println(n);
        }
    }


    public static void main(String[] args) {
        test7_1 T = new test7_1();
        T.DFS(3);
    }
}
