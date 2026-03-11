//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //basketball 클럽 객체 생성
        Club basketball = new Club("농구",5);

        //seo 사람 객체 생성
        Person seo = new Person("서장훈",57,'남');

        //Club 클래스의 join 메소드 실행
        Club.join(seo);
    }
}