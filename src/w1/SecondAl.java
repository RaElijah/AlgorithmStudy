package w1;

// 백준 문제 링크 : https://www.acmicpc.net/problem/1001

/*
두 정수 A와 B를 입력받은 다음, A-B를 출력하는 프로그램을 작성하시오.
 */

import java.util.Scanner;

public class SecondAl {
    public static void main(String[] args) {
        // 출력하기 위해 Scanner 이용
        Scanner sc = new Scanner(System.in);
        // 두 정수 A, B
        int A = sc.nextInt();
        int B = sc.nextInt();
        System.out.println(A - B);
    }
}