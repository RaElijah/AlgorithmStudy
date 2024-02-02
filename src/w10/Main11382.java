package w10;

// 백준 문제 링크: https://www.acmicpc.net/problem/11382

/*
꼬마 정민이는 이제 A + B 정도는 쉽게 계산할 수 있다. 이제 A + B + C를 계산할 차례이다!

입력
첫 번째 줄에 A, B, C (1 ≤ A, B, C ≤ 1012)이 공백을 사이에 두고 주어진다.

출력
A+B+C의 값을 출력한다.
 */

import java.util.Scanner;

public class Main11382 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        /*
        int로 백준에 제출할 경우 런타임에러가 뜬다.
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int C = scanner.nextInt();
         */

        Long A = scanner.nextLong();
        Long B = scanner.nextLong();
        Long C = scanner.nextLong();
        System.out.println(A + B + C);
    }
}
