package com.sam.oauth.config;

import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class MyUserDetailService implements UserDetailsService {

//    @Override
//    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
//        return new MyUserDetails(s);
//    }
    @Override
    public UserDetails loadUserByUsername(String account) throws UsernameNotFoundException {
//        return jpaAccountRpy.findByAccount(account).stream().findFirst().orElseThrow(() -> new RuntimeException("查無帳號"));
        return User.builder().username("sam").password("pass").authorities("ROLE_r1").build();
    }

}
