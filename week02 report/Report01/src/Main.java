//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Member TV = new Member("우리집 TV","Samsung",2017,55,"LED");
        Member newTV = new Member("새로운 TV","LG",2026,88,"OLED");

        System.out.println(TV);
        System.out.println(newTV);
    }
}