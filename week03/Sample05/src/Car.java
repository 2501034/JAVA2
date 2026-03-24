public class Car {
    public void drive(Nevigation nevigation, String start, String destination) {
        System.out.println("운전 시작");
        nevigation.findRoute(start, destination);
        System.out.printf("Driving to " + destination);
    }
}
