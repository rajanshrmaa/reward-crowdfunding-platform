package dto;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import lombok.Builder;


public class AuthRequest {
    private String username;
    private String password;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Object getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    public AuthRequest() {
    }
    public AuthRequest(String username, String password) {
        this.username = username;
        this.password = password;
    }

    @Override
    public String toString() {
        return "AuthRequest{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}