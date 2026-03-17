//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Date myBrithday = new Date(2003,5,28);
        Date today = new Date(2026,3,17);
        Date error = new Date(2025,2,29);

        error.setYear(2023);

        System.out.println();
        System.out.println("==== 생일 ====");
        System.out.println(myBrithday);
        System.out.println("=============");
        System.out.println();
        System.out.println("==== 오늘 ====");
        System.out.println(today);
        System.out.println("=============");
        System.out.println();
        System.out.println("==== 오류 ====");
        System.out.println(error);
        System.out.println("=============");
        System.out.println();
    }
}