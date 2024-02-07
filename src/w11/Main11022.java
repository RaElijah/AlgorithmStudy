package w11;

// 백준 문제 링크: https://www.acmicpc.net/problem/11022

/*
A+B - 8
두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.

입력
첫째 줄에 테스트 케이스의 개수 T가 주어진다.
각 테스트 케이스는 한 줄로 이루어져 있으며,
각 줄에 A와 B가 주어진다. (0 < A, B < 10)

출력
각 테스트 케이스마다 "Case #x: A + B = C" 형식으로 출력한다.
x는 테스트 케이스 번호이고 1부터 시작하며, C는 A+B이다.

예제 입력                       예제 출력
5                             Case #1: 1 + 1 = 2
1 1                           Case #2: 2 + 3 = 5
2 3                           Case #3: 3 + 4 = 7
3 4                           Case #4: 9 + 8 = 17
9 8                           Case #5: 5 + 2 = 7
5 2
 */
import java.io.*;
import java.util.*;

public class Main11022 {
    public static void main(String[] args) {
        try {
            BufferedReader br =
                    new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw =
                    new BufferedWriter(new OutputStreamWriter(System.out));

            int n = Integer.parseInt(br.readLine());
            for (int i = 1; i <= n; i++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                int a = Integer.parseInt(st.nextToken());
                int b = Integer.parseInt(st.nextToken());
                int c = a + b;
                bw.write("Case #" + i + ": " + a + " + " + b + " = " + c + "\n");
            }
            bw.flush();
            br.close();
            bw.close();

        } catch (IOException ioe) {
            ioe.printStackTrace();
            System.out.println(ioe.getMessage());
        }
    }
}
