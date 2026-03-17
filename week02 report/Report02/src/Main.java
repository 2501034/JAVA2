//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Movie movie1 = new Movie("헤라클레스","레니 할린",2014,"켈란 루츠",6.9f);

        Movie movie2 =new Movie("노아","대런 아로노프스키",2004,"러셀 크로우",7.3f);


        movie2.setRankPoint(8.2f);

        System.out.println();
        System.out.println("==== movie1 ====");
        System.out.println(movie1);
        System.out.println("================");
        System.out.println();
        System.out.println("==== movie2 ====");
        System.out.println(movie2);
        System.out.println("================");
        System.out.println();
        System.out.println("================");
        System.out.println("감독 이름 : " + movie1.getDirector());
        System.out.println("================");
    }
}