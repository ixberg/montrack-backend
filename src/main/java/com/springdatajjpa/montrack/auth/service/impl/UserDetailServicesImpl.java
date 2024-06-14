package com.springdatajjpa.montrack.auth.service.impl;

import com.springdatajjpa.montrack.auth.service.entity.UserAuth;
import com.springdatajjpa.montrack.users.entity.Users;
import com.springdatajjpa.montrack.users.repository.UserRepository;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserDetailServicesImpl implements UserDetailsService {
    private final UserRepository userRepository;

    public UserDetailServicesImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Users existingUser = userRepository.findByEmail(username).orElseThrow(() -> new UsernameNotFoundException("User not found"));
        var userAuth = new UserAuth();
        userAuth.setEmail(existingUser.getEmail());
        userAuth.setPassword(existingUser.getPassword());
        return userAuth;
    }
}
