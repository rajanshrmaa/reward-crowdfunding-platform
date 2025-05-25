package service;

import dto.UserDTO;
import entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import repository.UserRepository;

import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    public User registerUser(UserDTO userDTO) {
        String encryptedPassword = passwordEncoder.encode(userDTO.getPassword());
        User user = User.builder()
                .name(userDTO.getName())
                .email(userDTO.getEmail())
                .password(encryptedPassword)
                .role(userDTO.getRole())
                .build();
        return userRepository.save(user);
    }

    public Optional<User> getUserByEmail(String email) {
        return userRepository.findByEmail(email);
    }
}