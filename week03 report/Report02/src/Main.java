//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Doctor kim = new Doctor("철수",45);
        Teacher lee = new Teacher("영희",24);
        Engineer park = new Engineer("민수",35);

        System.out.println(kim);
        kim.treat();
        kim.operate();
        System.out.println();
        System.out.println(lee);
        lee.teach();
        lee.grade();
        System.out.println();
        System.out.println(park);
        park.code();
        park.debug();
        System.out.println();
    }
}