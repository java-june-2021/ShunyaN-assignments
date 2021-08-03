package com.shunya.controllerView.Services;

import java.util.Optional;

import org.mindrot.jbcrypt.BCrypt;
import org.springframework.stereotype.Service;

import com.shunya.controllerView.Models.User;
import com.shunya.controllerView.Repositories.UserRepository;

@Service
public class UserService {
    private final UserRepository userRepository;
    
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }
    
    // register and hash their pass
    public User registerUser(User user) {
        String hashed = BCrypt.hashpw(user.getPassword(), BCrypt.gensalt());
        user.setPassword(hashed);
        return userRepository.save(user);
    }

	// find by email
    public User findByEmail(String email) {
        return userRepository.findByEmail(email);
    }
    
    // find by id
    public User findUserById(Long id) {
    	Optional<User> eUser = userRepository.findById(id);
    	
    	if(eUser.isPresent()) {
            return eUser.get();
    	} else {
    	    return null;
    	}
    }
    
    // authenticate user
    public boolean authenticateUser(String email, String password) {
        // first find the user by email
        User user = userRepository.findByEmail(email);
        // return false, if not find by email
        if(user == null) {
            return false;
        } else {
        	// if the passwords match, return true, else, return false
            if(BCrypt.checkpw(password, user.getPassword())) {
                return true;
            } else {
                return false;
            }
        }
    }
}