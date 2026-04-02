public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return String.format("안녕하세요, 제 이름은 %s이고 %d살 입니다.", name, age);
    }

}