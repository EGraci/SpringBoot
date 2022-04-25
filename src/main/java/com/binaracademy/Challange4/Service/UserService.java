package com.binaracademy.Challange4.Service;

import com.binaracademy.Challange4.Dto.UserDto;
import com.binaracademy.Challange4.Entity.User;
import com.binaracademy.Challange4.Repository.UserRepository;
import org.jasypt.util.password.StrongPasswordEncryptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public List<User> ls_user(){
        return userRepository.findAll();
    }
    // checked login
    /*
    if (passwordEncryptor.checkPassword(inputPassword, encryptedPassword)) {
      // correct!
    } else {
      // bad login!
    }
     */
    public User set_user(UserDto userDto){
        StrongPasswordEncryptor passwordEncryptor = new StrongPasswordEncryptor();
        User user = new User();
        user.setIdUser(userDto.getIdUser());
        user.setUsername(userDto.getUsername());
        user.setEmail(userDto.getEmail());
        user.setPassword(passwordEncryptor.encryptPassword(userDto.getPassword()));
        return userRepository.save(user);
    }
    public Optional<User> ls_user(Long id){
        return userRepository.findById(id);
    }
    public Boolean delete_user(Long id){
        if(userRepository.existsById(id)){
            userRepository.deleteById(id);
            return true;
        }
        return false;
    }
}
