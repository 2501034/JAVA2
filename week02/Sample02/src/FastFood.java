public class FastFood {

    //속성(Attribute)
    private int radius;             //반지름
    private String name;            //이름
    private float PI = 3.141592f;   //원주율

    //생성자
    public FastFood(int radius, String name) {
        this.radius = radius;
        this.name = name;
    }

    //compute (처리) : 넓이 계산
    float getArea() {             // MemberMethod
        return PI * radius * radius;
    }

    //출력
    @Override
    public String toString() {
        return String.format("%s의 면적은 %.2f ㎠", name, getArea());
    }

}
