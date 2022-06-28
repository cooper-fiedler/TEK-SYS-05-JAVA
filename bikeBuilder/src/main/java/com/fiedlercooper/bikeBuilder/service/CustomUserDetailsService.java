package com.fiedlercooper.bikeBuilder.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import com.fiedlercooper.bikeBuilder.CustomUserDetails;
import com.fiedlercooper.bikeBuilder.entity.User;
import com.fiedlercooper.bikeBuilder.repository.UserRepository;
 
// SERVICE IMPLEMENTATION FOR REPOSITORY TO LOAD USER DETAILS BASED ON USERNAME (EMAIL)

public class CustomUserDetailsService implements UserDetailsService {
 
    @Autowired
    private UserRepository userRepo;
     
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = userRepo.findByEmail(username);
        if (user == null) {
            throw new UsernameNotFoundException("User not found");
        }
        return new CustomUserDetails(user);
    }
 
}