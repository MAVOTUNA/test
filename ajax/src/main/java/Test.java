import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Test {

    public static void main(String[] args) {

        User user = new User();
        user.setUserId("신동민");
        user.setUserId("1234");

        User user2 = new User();
        user.setUserId("기효주");
        user.setUserId("2345");
        
        List<User> userList = new ArrayList<>();
        userList.add(user);
        userList.add(user2);

        Optional<User> any = userList.stream().findAny();

        User user1 = any.get();
        System.out.println("user1 = " + user1.getUserId());

    }
    
    static class User{
        private String userId;
        private String userPassword;


        public String getUserPassword() {
            return userPassword;
        }

        public void setUserPassword(String userPassword) {
            this.userPassword = userPassword;
        }

        public String getUserId() {
            return userId;
        }

        public void setUserId(String userId) {
            this.userId = userId;
        }
    }
}
