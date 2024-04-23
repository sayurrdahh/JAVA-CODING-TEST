package CodingTest.test7;
/*
* 자연수 N이 주어지면 1부터 N까지의 원소를 갖는 집합의 부분집합을 모두 출력하는 프로그램을 작성하시오
*
* */
public class test7_6 {

    static int n; //집합의 원소의 개수
    static int[] ch;

    public void DFS(int L){
        if(L == n + 1){

            String tmp = "";

            for (int i = 1; i <= n; i++) {
                if(ch[i]==1) tmp += (i + " ");
            }

            if(tmp.length()>0) System.out.println(tmp);

        }else{
            ch[L] = 1;//1은 사용한다
            DFS(L+1);// 왼쪽으로 뻗고 (원소를 사용할 경우)

            ch[L] = 0; //0은 사용하지 않는다
            DFS(L+1);//오른쪽으로 뻗고 (원소를 사용 안할 경우)
        }

    }

    public static void main(String[] args) {
        test7_6 T = new test7_6();
        n = 3;
        ch = new int[n+1];
        T.DFS(1);
    }
}
