package w5;

// 백준 문제 링크: https://www.acmicpc.net/problem/2566

/*
<그림 1>과 같이 9×9 격자판에 쓰여진 81개의 자연수 또는 0이 주어질 때, 이들 중 최댓값을 찾고 그 최댓값이 몇 행 몇 열에 위치한 수인지 구하는 프로그램을 작성하시오.

예를 들어, 다음과 같이 81개의 수가 주어지면

 	1열	2열	3열	4열	5열	6열	7열	8열	9열
1행	3	23	85	34	17	74	25	52	65
2행	10	7	39	42	88	52	14	72	63
3행	87	42	18	78	53	45	18	84	53
4행	34	28	64	85	12	16	75	36	55
5행	21	77	45	35	28	75	90	76	1
6행	25	87	65	15	28	11	37	28	74
7행	65	27	75	41	7	89	78	64	39
8행	47	47	70	45	23	65	3	41	44
9행	87	13	82	38	31	12	29	29	80

이들 중 최댓값은 90이고, 이 값은 5행 7열에 위치한다.

입력
첫째 줄부터 아홉 번째 줄까지 한 줄에 아홉 개씩 수가 주어진다.
주어지는 수는 100보다 작은 자연수 또는 0이다.

출력
첫째 줄에 최댓값을 출력하고, 둘째 줄에 최댓값이 위치한 행 번호와 열 번호를 빈칸을 사이에 두고 차례로 출력한다.
최댓값이 두 개 이상인 경우 그 중 한 곳의 위치를 출력한다.

예제 입력                               예제 출력
3 23 85 34 17 74 25 52 65            90
10 7 39 42 88 52 14 72 63            5  7
87 42 18 78 53 45 18 84 53
34 28 64 85 12 16 75 36 55
21 77 45 35 28 75 90 76 1
25 87 65 15 28 11 37 28 74
65 27 75 41 7 89 78 64 39
47 47 70 45 23 65 3 41 44
87 13 82 38 31 12 29 29 80
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main2566 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        // 기본적으로 9 * 9 배열로 고정되어 있다.
        int[][] board = new int[9][];
        // 한줄씩 입력 받아가며
        for (int i = 0; i < 9; i++) {
            String[] row = reader.readLine().split(" ");
            // 한줄의 숫자를 차례데로 넣어준다.
            for (int j = 0; j < 9; j++) {
                board[i][j] = Integer.parseInt(row[j]);
            }
        }

        // 제일 왼쪽 위의 값을 기본 최댓값으로 상정한다.
        int max = board[0][0];
        // 그 위치를 기록한다.
        int x = 0;
        int y = 0;
        // 모든 줄을 순회하고,
        for (int i = 0; i < 9; i++) {
            // 모든 칸을 순회한다.
            for (int j = 0; j < 9; j++) {
                // 현재의 위치가 기록된 값보다 더 크다.
                if (board[i][j] > max) {
                    // 해당 최댓값을 기록하고
                    max = board[i][j];
                    // x와 y의 위치도 기록해준다.
                    x = j;
                    y = i;
                }
            }
        }

        // 정답을 만들어 준다.
        StringBuilder answerBuilder = new StringBuilder();
        // 최댓값
        answerBuilder.append(max)
                .append('\n')    // 개행
                .append(y + 1)   // 1부터 세니까 + 1
                .append(" ")     // 공백
                .append(x + 1);  // 1부터 세니까 + 1
        // 출력
        System.out.println(answerBuilder);
    }
}
