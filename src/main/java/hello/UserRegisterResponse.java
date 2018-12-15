package hello;

public class UserRegisterResponse {

    private String email;
    private String password;

    public UserRegisterResponse(String email, String password) {
        this.email = email;
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public String registerUser(User user) {
        return user.getEmail();
    }
}
