public class Box {

    //속성(Attribute)
    private int width;      //너비
    private int height;     //높이
    private  int depth;     //깊이
    private String color;   //색상
    private String text;    //문구

    //생성자
    public Box(int width, int height, int depth, String color, String text) {
        this.width = width;
        this.height = height;
        this.depth = depth;
        this.color = color;
        this.text = text;
    }
    // Behavior (행동) : 부피 계산
    int volume() {
        return width * height * depth;
    }

    //출력
    @Override
    public String toString() {
        return String.format("==== BOX ====\n" +
                "너비 : %d Cm \n"  +
                "높이 : %d Cm \n" +
                "깊이 : %d Cm \n" +
                "색상 : %s \n" +
                "문구 : %s \n" +
                "부피 : %,d \u33a4 \n",width,height,depth,color,text,volume() );
    }

}
