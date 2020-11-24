package com.decred.memories.security;


import java.util.ArrayList;
import com.decred.memories.security.JwtApp;
import com.decred.memories.security.JwtAppRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class JwtUserDetailsService implements UserDetailsService {

    @Autowired
    private JwtAppRepository jwtAppRepository;

    @Autowired
    private PasswordEncoder bcryptEncoder;

    @Override
    public UserDetails loadUserByUsername(String appkey) throws UsernameNotFoundException {

        JwtApp user = jwtAppRepository.findByAppKey(appkey);
        
        if (user == null) {
            throw new UsernameNotFoundException("User not found with appkey: " + appkey);
        }
        return new org.springframework.security.core.userdetails.User(user.getAppKey(), user.getAppSecret(),
                new ArrayList<>());
    }

    public JwtApp save(JwtApp appkey) {
        JwtApp app = new JwtApp();
        app.setAppKey(appkey.getAppKey());
        app.setAppSecret(bcryptEncoder.encode(appkey.getAppSecret()));
        return jwtAppRepository.save(app);
    }
}
