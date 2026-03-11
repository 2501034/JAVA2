public class Body {

    //속성(Attribute)
    private int height;     //키
    private float weight;   //몸무게
    private int age;        //나이

    //생성자 행동자 (void)
    public void setBody(int height, float weight, int age) {
        this.height = height;
        this.weight = weight;
        this.age = age;
    }

    //출력 행동자 (void)
    public void print() {
        System.out.printf("서경석은 키가 %d Cm 이고, 몸무게는 %.1f Kg이고," +
                "나이는 %d살 입니다.",height,weight,age);
    }
}
