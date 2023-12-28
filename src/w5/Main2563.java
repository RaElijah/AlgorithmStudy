package w5;

// 백준 문제 링크: https://www.acmicpc.net/problem/2563

/*
가로, 세로의 크기가 각각 100인 정사각형 모양의 흰색 도화지가 있다. 이 도화지 위에 가로,
세로의 크기가 각각 10인 정사각형 모양의 검은색 색종이를 색종이의 변과 도화지의 변이 평행하도록 붙인다.
이러한 방식으로 색종이를 한 장 또는 여러 장 붙인 후 색종이가 붙은 검은 영역의 넓이를 구하는 프로그램을 작성하시오.

입력
첫째 줄에 색종이의 수가 주어진다. 이어 둘째 줄부터 한 줄에 하나씩 색종이를 붙인 위치가 주어진다.
색종이를 붙인 위치는 두 개의 자연수로 주어지는데
첫 번째 자연수는 색종이의 왼쪽 변과 도화지의 왼쪽 변 사이의 거리이고,
두 번째 자연수는 색종이의 아래쪽 변과 도화지의 아래쪽 변 사이의 거리이다.
색종이의 수는 100 이하이며, 색종이가 도화지 밖으로 나가는 경우는 없다

출력
첫째 줄에 색종이가 붙은 검은 영역의 넓이를 출력한다.

예제 입력       예제 출력
3            260
3 7
15 7
5 2
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main2563 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(reader.readLine());
        // 도화지의 크기는 정해져 있다.
        int[][] board = new int[100][100];
        for (int i = 0; i < N; i++) {
            // 입력받는 내용은 왼쪽 위의 점이다.
            String[] leftUp = reader.readLine().split(" ");
            int startLeft = Integer.parseInt(leftUp[0]);
            int startUp = Integer.parseInt(leftUp[1]);
            // 왼쪽 위에서 오른쪽 아래로, 10칸씩 칠해준다.
            for (int j = startLeft; j < startLeft + 10; j++) {
                for (int k = startUp; k < startUp + 10; k++) {
                    // 덧칠해도 무방하다.
                    board[k][j] = 1;
                }
            }
        }

        // 100 * 100을 전부 순회하며 1을 센다.
        int sum = 0;
        for (int i = 0; i < 100; i++) {
            for (int j = 0; j < 100; j++) {
                sum += board[i][j];
            }
        }
        System.out.println(sum);
    }
}
