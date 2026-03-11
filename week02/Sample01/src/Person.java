public class Person {

    //속성(Attribute)
    private String name;
    private int age;
    private char gender;
    private boolean married;
    private int child;

    //생성자
    public Person(String name, int age, char gender, boolean married, int child) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.married = married;
        this.child = child;
    }

    //출력
    @Override
    public String toString() {
        return String.format("나이는 %d살, 이름은 %s이라는 %c자가 있습니다.\n" +
                        "이 %c자는 결혼을 %s고 자식이 %d명 있습니다.\n",
                age, name, gender, gender, (married? "했" : "안했"), child);
    }
}
