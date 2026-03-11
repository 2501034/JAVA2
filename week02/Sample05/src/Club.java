public class Club {

    //속성(Attribute)
    private static String clubName;    //클럽 이름
    private static int clubMember;     //클럽 인원


    //생성자
    public Club(String clubName, int clubMember) {
        this.clubName = clubName;
        this.clubMember = clubMember;
    }

    //출력 행동자
    static void join(Person p) {
        System.out.printf("나이가 %d살, 이름이 %s 이라는 %c자가 있다.",p.age,p.name,p.gender);
        System.out.printf("이 %c자는 %s 클럽에 참여하였고, 그 클럽의 인원은 %d명 이다.",p.gender,clubName,clubMember);
    }
}
