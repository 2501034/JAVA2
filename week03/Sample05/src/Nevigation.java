public class Nevigation {
    private String model;

    public Nevigation(String model) {
        this.model = model;
    }

    public void findRoute(String start, String destination) {
        System.out.printf("출발지 : %s, 목적지 : %s까지의 길을 찾았습니다.\n",
                start, destination);
    }
}
