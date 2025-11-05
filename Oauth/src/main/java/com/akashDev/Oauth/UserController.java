package com.akashDev.Oauth; 

import java.util.Map;

import org.springframework.security.oauth2.core.user.OAuth2User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @GetMapping("/user-info")
    public Map<String, String> userInfo(OAuth2User principal) {
        return Map.of(
            "name", principal.getAttribute("name"),
            "email", principal.getAttribute("email")
        );
       
    }
}