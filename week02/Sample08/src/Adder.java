import java.util.Scanner;

public class Adder {

    //속성(Attribute)
    int num1;    //정수1
    int num2;    //정수2

    //입력 input
    void input() {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("정수 2개 입력 : ");
        num1 = keyboard.nextInt();
        num2 =keyboard.nextInt();
    }

    //처리 adder : 두 정수의 합 계산
    int adder(){
        return num1 + num2;
    }

    //출력 print 메소드
    void print() {
        System.out.printf("%d + %d = %d", num1, num2, adder());
    }
}
