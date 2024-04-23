package CodingTest.test7;
/*
BFS
* 설명
현수는 송아지를 잃어버렸다. 다행히 송아지에는 위치추적기가 달려 있다.
현수의 위치와 송아지의 위치가 수직선상의 좌표 점으로 주어지면 현수는 현재 위치에서 송아지의 위치까지 다음과 같은 방법으로 이동한다.
송아지는 움직이지 않고 제자리에 있다.
현수는 스카이 콩콩을 타고 가는데 한 번의 점프로 앞으로 1, 뒤로 1, 앞으로 5를 이동할 수 있다.
최소 몇 번의 점프로 현수가 송아지의 위치까지 갈 수 있는지 구하는 프로그램을 작성하세요.

입력
첫 번째 줄에 현수의 위치 S와 송아지의 위치 E가 주어진다. 직선의 좌표 점은 1부터 10,000까지이다.

출력
점프의 최소횟수를 구한다. 답은 1이상이며 반드시 존재합니다.
* */

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class test7_8 {

    int answer = 0;
    int[] dis = {1,-1,5};
    int[] ch;
    Queue<Integer> Q = new LinkedList<>();

    public int BFS(int s, int e){
        ch = new int[10001];
        ch[s] = 1; //방문했다면 1
        Q.offer(s);
        int L = 0; //레벨값
        while(!Q.isEmpty()){
            int len = Q.size();
            for (int i = 0; i < len; i++) {
                int x = Q.poll();
                for (int j = 0; j < 3; j++) { //3개의 노드 생성
                    int nx = x + dis[j];
                    if(nx == e) return L+1; //송아지 찾으면 레벨값 반환
                    if(nx>=1 && nx <=10000 && ch[nx] == 0){
                        ch[nx] = 1;
                        Q.offer(nx);
                    }
                }
            }
            L++; //레벨 증가 
        }
        return 0;
    }

    public static void main(String[] args) {
        test7_8 T = new test7_8();
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt(); //현수의 위치
        int e = sc.nextInt(); //송아지의 위치
        System.out.println(T.BFS(s,e));

    }

}
