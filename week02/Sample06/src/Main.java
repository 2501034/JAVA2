//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //t객체 선언 "new Today"가 아니라 "new Today()" 인 이유 :
        //t(객체) = 붕어빵, Today(클래스) = 붕어빵틀,
        // 붕어빵틀이 있다고 붕어빵이 생기진 않음
        // 따리서 new Today(); = 붕어빵을 만드는 것
        Today t = new Today();

        //t 객체의 happyDay 행동
        for (int i=0; i<= 10; i++)
        t.happyDay();

        //static 메소드 → Today.happyDay()
        //일반 메소드 → new Today() 만든 후 t.happyDay()
    }
}