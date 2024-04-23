package CodingTest.test7;
/*
* 피보나치 수열을 출력한다. 피보나치 수열이란 앞의 2개의 수를 합하여 다음 숫자가 되는 수열이다.
* 입력은 피보나치 수열의 총 항의 수이다.
* */
public class test7_4 {

    static int[] fibo;

    public int DFS(int n){
        if(fibo[n] > 0) return fibo[n];
        if(n == 1) return fibo[n]=1; //첫번째 항
        else if(n==2) return fibo[n]=1; //두번째 항
        else return fibo[n] = DFS(n-2) + DFS(n-1);
    }


    public static void main(String[] args) {
        test7_4 T = new test7_4();
        int n = 10;
        fibo = new int[n+1];
        T.DFS(n);
        for (int i = 1; i <= n ; i++) {
            System.out.print(fibo[i]+" ");
        }
    }
}
