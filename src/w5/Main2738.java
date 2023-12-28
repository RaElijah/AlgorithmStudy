package w5;

// 백준 문제 링크: https://www.acmicpc.net/problem/2738

/*
N*M크기의 두 행렬 A와 B가 주어졌을 때, 두 행렬을 더하는 프로그램을 작성하시오.

입력
첫째 줄에 행렬의 크기 N 과 M이 주어진다. 둘째 줄부터 N개의 줄에 행렬 A의 원소 M개가 차례대로 주어진다.
이어서 N개의 줄에 행렬 B의 원소 M개가 차례대로 주어진다.
N과 M은 100보다 작거나 같고, 행렬의 원소는 절댓값이 100보다 작거나 같은 정수이다.

출력
첫째 줄부터 N개의 줄에 행렬 A와 B를 더한 행렬을 출력한다. 행렬의 각 원소는 공백으로 구분한다.

예제 입력           출력
3 3             4 4 4
1 1 1           6 6 6
2 2 2           5 6 100
0 1 0
3 3 3
4 4 4
5 5 100
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main2738 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader
                = new BufferedReader(new InputStreamReader(System.in));
        // 각 행렬의 크기 정보 받기
        String matInfoString = reader.readLine();
        String[] matInfo = matInfoString.split(" ");
        int N = Integer.parseInt(matInfo[0]);
        int M = Integer.parseInt(matInfo[1]);

        // 행렬의 크기 정보를 바탕으로 새로운 행렬 만들고, 할당하기
        int[][] matrix = new int[N][M];
        // 2중 반복문을 수행하면서,
        for (int i = 0; i < N; i++) {
            // 각 줄을 입력받는다.
            String[] rowInfo = reader.readLine().split(" ");
            for (int j = 0; j < M; j++) {
                // i번 줄의 j번 칸에 rowInfo[j]를 정수로 할당한다.
                matrix[i][j] = Integer.parseInt(rowInfo[j]);
            }
        }

        // 다른 2차원 배열을 만들어 할당 뒤 연산
        // 입력을 받으며 바로 연산
        for (int i = 0; i < N; i++) {
            // 반대 행렬 줄을 입력받는다.
            String[] rowInfo = reader.readLine().split(" ");
            for (int j = 0; j < M; j++) {
                // matrix[i][j]에 rowInfo[j]를 더해준다.
                matrix[i][j] += Integer.parseInt(rowInfo[j]);
            }
        }

        // 출력 만들기
        StringBuilder answerBuilder = new StringBuilder();
        for (int i = 0; i < N; i++) {
            // 각 줄 출력
            for (int j = 0; j < M; j++) {
                answerBuilder.append(matrix[i][j]);
                answerBuilder.append(" ");
            }
            // 개행문자 출력
            answerBuilder.append("\n");
        }

        System.out.println(answerBuilder);
    }
}