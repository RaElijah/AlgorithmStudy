package w11;

// 백준 문제 링크: https://www.acmicpc.net/problem/11654

/*
아스키 코드
알파벳 소문자, 대문자, 숫자 0-9중 하나가 주어졌을 때,
주어진 글자의 아스키 코드값을 출력하는 프로그램을 작성하시오.

입력
알파벳 소문자, 대문자, 숫자 0-9 중 하나가 첫째 줄에 주어진다.

출력
입력으로 주어진 글자의 아스키 코드 값을 출력한다.

예제 입력 1                 예제 출력 1
A                         65

예제 입력 2                 예제 출력 2
C                         67

 */

import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class Main11654 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String letter = sc.next();
        byte[] bytes = letter.getBytes(StandardCharsets.US_ASCII);
        System.out.println(bytes[0]);
    }
}
