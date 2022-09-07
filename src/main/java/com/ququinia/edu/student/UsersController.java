package com.ququinia.edu.student;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.ququinia.edu.service.UserService;
import com.ququinia.edu.model.user.AppUser;

@RestController
@RequestMapping("management/api/v1/users")
public class UsersController {

    @Autowired
    UserService userService;;

    
    
//    hasRole('ROLE_') hasAnyRole('ROLE_') hasAuthority('permission') hasAnyAuthority('permission')

    @GetMapping
    @PreAuthorize("hasAnyRole('ROLE_ADMIN', 'ROLE_ADMINTRAINEE')")
    public List<AppUser> getAllUsers() {
        System.out.println("getAllUsers");
        //return userRepository.findAll();
        AppUser app = new AppUser(2, "e", "password", "username");
        List<AppUser> result = new ArrayList<AppUser>();
        result.add(app);

        result = userService.getAll();
        for (AppUser appUser : result) {
            appUser.setPassword("");
            
        }
        return result;
    }

   
}
