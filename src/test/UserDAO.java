package test;

@Repository("userDAO")
public class UserDAO extends AbstractDAO{
 
    public UserVO selectById(String id) {
        return (UserVO) selectOne("user.selectById", id);
    }
 
}