package w2;

// 백준 문제 링크: https://www.acmicpc.net/problem/2739

import java.util.Scanner;

/*
N을 입력받은 뒤, 구구단 N단을 출력하는 프로그램을 작성하시오. 출력 형식에 맞춰서 출력하면 된다.

입력
첫째 줄에 N이 주어진다. N은 1보다 크거나 같고, 9보다 작거나 같다.

출력
출력형식과 같게 N*1부터 N*9까지 출력한다.

 */
public class ThirdAl {
    public static void main(String[] args) {
        // 입력 위해 Scanner 사용
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        // 반복문 for
        for (int i = 1; i < 10; i++) {
            // n * i = n*i 표현을 위해 String.format 사용
            System.out.println(String.format("%d * %d = %d", n, i, n * i));
        }
    }
}
