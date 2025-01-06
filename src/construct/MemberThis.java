package construct;

public class MemberThis {
    String nameField;

    void initMember(String nameParameter){
        // 앞에 this가 생략되어 있다고 보면 됨.
        // this.nameField
        nameField = nameParameter;
    }
}
