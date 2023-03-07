package com.iroshnk.springbootdemo.services;

import com.iroshnk.springbootdemo.entities.User;
import com.iroshnk.springbootdemo.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.stereotype.Service;

@Service
public class CustomUserDetailsService implements UserDetailsService {

    @Autowired
    private UserRepository usersRepository;

    public void setUsersRepository(UserRepository usersRepository) {
        this.usersRepository = usersRepository;
    }

    /**
     * Load user details by username from the Users repository and create a UserDetailsImpl object.
     * @return a UserDetailsImpl object containing the user's details if found, null otherwise
     */
    @Override
    public UserDetails loadUserByUsername(String username) {
        User user = usersRepository.findByUsername(username).orElse(new User());
        return new UserDetailsImpl(user);
    }
}
