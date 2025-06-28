package dto;
import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UserDTO {
    private String name;
    private String email;
    private String password;
    private String role;
    private Double goalAmount;
    private String description;
}