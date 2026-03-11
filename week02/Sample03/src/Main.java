//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //Box 객체 생성
        Box box =new Box(30,15,45,"무지","파손주의");

        //Box 객체 정보 출력
        System.out.println(box);

        //Box 부피만 출력
        System.out.println("Box 부피 : " + box.volume() + " \u33a4");
    }
}