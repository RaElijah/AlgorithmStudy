package w1;
/*
아래 예제와 같이 개를 출력하시오.

예제 출력

|\_/|
|q p|   /}
( 0 )"""\
|"^"`    |
||_/=\\__|

 */
public class ThirdAl {
    public static void main(String[] args) {
        // 주석 한 것처럼 하면 출력값은 같으나 쓰기 힘들고 백준에서는 실패로 나온다.
//        System.out.println("|\\_/|\n|q p|   /}\n( 0 )\"\"\"\\\n|\\\"^\\\"`  |\n||_/=\\\\__|");
        // \은 두번입력해야 적용된다.
        System.out.println("|\\_/|");
        System.out.println("|q p|   /}");
        System.out.println("( 0 )\"\"\"\\");
        System.out.println("|\"^\"`    |");
        System.out.println("||_/=\\\\__|");
    }
}
