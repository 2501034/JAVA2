//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Student kim = new Student("철수","221111","의예과",20030324);
        Student lee = new Student("영희","212222","교육학과",19800529);
        Student park = new Student("민수","132323","컴퓨터학과",19901112);

        System.out.println(kim);
        System.out.println(lee);
        System.out.println(park);
    }
}