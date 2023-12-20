package w4;

// 백준 문제 링크: https://www.acmicpc.net/problem/3003
/*
동혁이는 오래된 창고를 뒤지다가 낡은 체스판과 피스를 발견했다.
체스판의 먼지를 털어내고 걸레로 닦으니 그럭저럭 쓸만한 체스판이 되었다. 하지만, 검정색 피스는 모두 있었으나,
흰색 피스는 개수가 올바르지 않았다. 체스는 총 16개의 피스를 사용하며,
킹 1개, 퀸 1개, 룩 2개, 비숍 2개, 나이트 2개, 폰 8개로 구성되어 있다.
동혁이가 발견한 흰색 피스의 개수가 주어졌을 때, 몇 개를 더하거나 빼야 올바른 세트가 되는지 구하는 프로그램을 작성하시오.

입력
첫째 줄에 동혁이가 찾은 흰색 킹, 퀸, 룩, 비숍, 나이트, 폰의 개수가 주어진다. 이 값은 0보다 크거나 같고 10보다 작거나 같은 정수이다.

출력
첫째 줄에 입력에서 주어진 순서대로 몇 개의 피스를 더하거나 빼야 되는지를 출력한다.
만약 수가 양수라면 동혁이는 그 개수 만큼 피스를 더해야 하는 것이고,
음수라면 제거해야 하는 것이다.

예제 입력           예제 출력
0 1 2 2 2 7     1 0 0 0 0 1

예제 입력 2         예제 출력 2
2 1 2 1 2 1     -1 0 0 1 0 7

 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SecondAl {
    public static void main(String[] args) throws IOException {
        // 어떤 입력에 대하여 버퍼링 기능 제공
        BufferedReader reader
                = new BufferedReader(new InputStreamReader(System.in));
        // readLine을 통해 한줄 입력 받기
        String input = reader.readLine();

        // 주어진 인자를 (정규 표현식으로 활용해서) 기준으로 삼아
        // 문자열을 나눈 배열로 반환한다.
        String[] splitString = input.split(" ");
        // 기준이 되는 체스말을 정수 배열로 저장
        int[] rightPieces = {1, 1, 2, 2, 2, 8};

        // 입력받은 각각의 체스말을 살펴본다.
        // 어떤 말인지를 보기 위해 for i 반복을 한다.
        for (int i = 0; i < 6; i++) {
            // 이번 말을 확인한다.
            String pieceRaw = splitString[i];
            // 동일한 말에서, 기준 갯수와 다른 만큼 빼준다.
            rightPieces[i] -= Integer.parseInt(pieceRaw);
        }
        // 출력
        System.out.println(String.format(
                "%d %d %d %d %d %d",
                rightPieces[0],
                rightPieces[1],
                rightPieces[2],
                rightPieces[3],
                rightPieces[4],
                rightPieces[5]
        ));
    }
}

