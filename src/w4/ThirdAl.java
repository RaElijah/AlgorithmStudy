package w4;

// 백준 문제 링크: https://www.acmicpc.net/problem/2444

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
예제를 보고 규칙을 유추한 뒤에 별을 찍어 보세요.

입력
첫째 줄에 N(1 ≤ N ≤ 100)이 주어진다.

출력
첫째 줄부터 2×N-1번째 줄까지 차례대로 별을 출력한다.

예제 입력
5

예제 출력
    *
   ***
  *****
 *******
*********
 *******
  *****
   ***
    *

 */
public class ThirdAl {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader =
                new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bufferedReader.readLine());
        char[] star = new char[2 * n - 1];
    }
}
