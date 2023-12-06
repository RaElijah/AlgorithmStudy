package w2;

// 백준 문제 링크: https://www.acmicpc.net/problem/8393

/*
n이 주어졌을 때, 1부터 n까지 합을 구하는 프로그램을 작성하시오.
 */

import java.util.Scanner;

public class SecondAl {
    public static void main(String[] args) {
        // 입력 위해 Scanner 사용
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int sum = 0;
        // 반복문 설정
        for (int i = 0; i <= n; i++) {
            sum += i;
        }
        System.out.println(sum);
    }
}
