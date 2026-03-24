//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Apple apple = new Apple(1000,20);
        Seller seller = new Seller(apple,50000);
        Customer customer = new Customer(35000);

        System.out.println(seller);
        customer.buy(seller,apple,5);

    }
}