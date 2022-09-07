package com.ququinia.edu.security;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.ququinia.edu.service.UserService;
import com.ququinia.edu.user.AppUser;


@Service
public class CustomUserDetailService implements UserDetailsService {



    @Autowired
    private UserService userService;

    @Override
    @Transactional
    public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {
        AppUser user = userService.findUserByUserName(userName);
        //List<GrantedAuthority> authorities = getUserAuthority(user.getRoles());
        
        List<GrantedAuthority> authorities = new ArrayList<>(ApplicationUserRole.ADMIN.getGrantedAuthorities());

        return buildUserForAuthentication(user, authorities);
    }

    /*
    private List<GrantedAuthority> getUserAuthority(Set<Role> userRoles) {
        
        Set<GrantedAuthority> roles = new HashSet<GrantedAuthority>();
        for (Role role : userRoles) {
            roles.add(new SimpleGrantedAuthority(role.getRole()));
        }
         
        List<GrantedAuthority> grantedAuthorities = new ArrayList<>(roles);

        return grantedAuthorities;
    }
    */

    private UserDetails buildUserForAuthentication(AppUser user, List<GrantedAuthority> authorities) {
        return new org.springframework.security.core.userdetails.User(user.getUsername(), user.getPassword(),
                true, true, true, true, authorities);
    }



/*
    @Autowired
    private UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        final AppUser user = userRepository.findByEmail(username);
        if (user == null) {
            throw new UsernameNotFoundException(username);
        }


        UserDetails myUser = User.withUsername(user.getEmail()).password(user.getPassword()).authorities(ApplicationUserRole.ADMIN.getGrantedAuthorities()).build();
        return myUser;
    }

    */
}
