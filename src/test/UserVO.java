package test;
 
import java.util.Date;
 
public class UserVO {
    
    private int IDX;
    private String ID;
    private String EMAIL;
    private String NAME;
    private String PASSWORD;
    private int GRADE;
    private Date REGDATE;
        
    //비밀번호 확인
    public boolean matchPassword(String pw) {
        return this.PASSWORD.equals(pw);
    }
 
    /* Getter, Setter 생략 */
}
